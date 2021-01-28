## LGTM
[![Total alerts](https://img.shields.io/lgtm/alerts/g/cricketbackground/csv-datalogger.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/cricketbackground/csv-datalogger/alerts/)

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
