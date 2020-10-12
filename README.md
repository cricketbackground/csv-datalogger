## What this app does?

Listens to kafka topic "test". 
Reads incoming messages and logs to console.

## Kafka installation steps

```
brew install kafka
```

This installs zookeeper and kafka

Stop both zookeepr and kafka. Edit kafka config to uncomment and update below properties. Save the file

```
brew services stop kafka
brew services stop zookeeper
```

```
listeners=PLAINTEXT://localhost:9092
advertised.listeners=PLAINTEXT://localhost:9092
```

```
brew services start zookeeper
brew services start kafka
```

```
brew services
```

kafka             started deus /Users/deus/Library/LaunchAgents/homebrew.mxcl.kafka.plist
zookeeper         started deus /Users/deus/Library/LaunchAgents/homebrew.mxcl.zookeeper.plist

```
Error:java.lang.IllegalStateException: This error handler cannot process 'SerializationException's directly; please consider configuring an 'ErrorHandlingDeserializer' in the value and/or key deserializer
Link: https://www.confluent.io/blog/spring-kafka-can-your-kafka-consumers-handle-a-poison-pill/
```

## Highlights of this new version

Enabled spring cloud messaging with kafka binder.
Key advantage is the code looks really simple compared to the one with kafka consumer configuration. 

* Create an interface. Add a method and annotate it with @Input and return type SubscribableChannel. SubscribableChannel has subscribe and unsubscribe methods
* Create a class. Annotate with @Component. Write a method that accepts the pojo annotated with @Payload and method is annotated with @StreamListener(INBOUND_CHANNEL_NAME)
* That's it. The method receives a message whenever a message arrives to the topic
* Here is how topic is configured
  ```
  spring:
    cloud:
      stream:
        kafka:
          binder:
            auto-create-topics: true # tell kafka to auto create topic
            brokers:
              - localhost:9092 # list of kafka binders
        bindings.susbcriptionorders: # can be any name here. this should be in @Input annotation 
          destination: fs.checkout.subscription.orders # name of topic
          contentType: "application/json" # this makes the message is convered from json to pojo 
  ```
  * The interface has to be mentioned in the binder config as below. This causes a proxy instance to be created and available by the container.
  ```
  @EnableBinding(CsvStreams.class)
  public class CsvStreamsConfig {
  
  }
  ```
