```

/Library/Java/JavaVirtualMachines/jdk-14.0.2.jdk/Contents/Home/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:53505,suspend=y,server=n -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -javaagent:/Users/deus/Library/Caches/JetBrains/IntelliJIdea2020.2/groovyHotSwap/gragent.jar -javaagent:/Users/deus/Library/Caches/JetBrains/IntelliJIdea2020.2/captureAgent/debugger-agent.jar -Dfile.encoding=UTF-8 -classpath /Users/deus/async-messaging/csv-datalogger/build/classes/java/main:/Users/deus/async-messaging/csv-datalogger/build/resources/main:/Users/deus/.gradle/caches/modules-2/files-2.1/org.projectlombok/lombok/1.18.12/48e4e5d60309ebd833bc528dcf77668eab3cd72c/lombok-1.18.12.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-actuator/2.3.4.RELEASE/44aebd5ec26be2d2ff3f72d2181001aad1f94f4a/spring-boot-starter-actuator-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-web/2.3.4.RELEASE/fe00611add5307c1f25f955b5229b7dddaaa2ff4/spring-boot-starter-web-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.kafka/spring-kafka/2.5.6.RELEASE/d54f69b36c912801462eeac6a74434bf168367ab/spring-kafka-2.5.6.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.opencsv/opencsv/5.0/6aa7ff327f0ad7e3e9dabd6fe29ee19122b382c3/opencsv-5.0.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter/2.3.4.RELEASE/cfeb7cce94a342b4b31b64c42a82c287c2f17207/spring-boot-starter-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-actuator-autoconfigure/2.3.4.RELEASE/17b36fb863a9d993b898e7521fa7bdd39cee3fa7/spring-boot-actuator-autoconfigure-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-core/1.5.5/f99c57087263b2db589390603c3a0f8b1ab8deaa/micrometer-core-1.5.5.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-json/2.3.4.RELEASE/1fac4d2fa9d2827e5e7a2c11ccc50f8dea2e95b/spring-boot-starter-json-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-tomcat/2.3.4.RELEASE/acffbb94a26dd1b7e9c38795797197e2dcb9d2e5/spring-boot-starter-tomcat-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/5.2.9.RELEASE/bec8682df7622707f067f98457ee95a8f276de80/spring-webmvc-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-web/5.2.9.RELEASE/4bc4a60b74ea0a92ed09d41c675f8426324b4e56/spring-web-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-context/5.2.9.RELEASE/4003ef2db8b5e4b22330fc6d67aae7ac5d304319/spring-context-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-messaging/5.2.9.RELEASE/649bc39008ec725ba9fdc847aa68db70adc5e250/spring-messaging-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-tx/5.2.9.RELEASE/6e7cc2fe50bebf443f42b91001bd7d4d930ae7a1/spring-tx-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.retry/spring-retry/1.2.5.RELEASE/2d3bc6318cce49a351a1db97048b04e172e4f079/spring-retry-1.2.5.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.kafka/kafka-clients/2.5.1/ccc851fa0412debfb3a5cfd2d00d3ad5cfdd6a53/kafka-clients-2.5.1.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-text/1.7/4d7d6dc210f80d0bff18645cc534a0c45324d0d6/commons-text-1.7.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.10/e155460aaf5b464062a09c3923f089ce99128a17/commons-lang3-3.10.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/commons-beanutils/commons-beanutils/1.9.4/d52b9abcd97f38c81342bb7e7ae1eee9b73cba51/commons-beanutils-1.9.4.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-collections4/4.4/62ebe7544cb7164d87e0637a2a6a2bdc981395e8/commons-collections4-4.4.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/2.3.4.RELEASE/ff9efafb9d62c17d8c3c1faec7afad147c924263/spring-boot-autoconfigure-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot/2.3.4.RELEASE/f23f14ae4062d5983db89b7c7336166b6734fc57/spring-boot-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-logging/2.3.4.RELEASE/677a66ac80e88cefaaca64e72b5523eb4836b7ae/spring-boot-starter-logging-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/jakarta.annotation/jakarta.annotation-api/1.3.5/59eb84ee0d616332ff44aba065f3888cf002cd2d/jakarta.annotation-api-1.3.5.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-core/5.2.9.RELEASE/400a6fdb45bfa5318aa7d06360f4495b75080bb5/spring-core-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/1.26/a78a8747147d2c5807683e76ec2b633e95c14fe9/snakeyaml-1.26.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-actuator/2.3.4.RELEASE/ed59b181c7bdf677450f86c15a024b3be3ed5847/spring-boot-actuator-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.hdrhistogram/HdrHistogram/2.1.12/6eb7552156e0d517ae80cc2247be1427c8d90452/HdrHistogram-2.1.12.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.datatype/jackson-datatype-jdk8/2.11.2/d4c1933a8d62db65c3d5a5cd809511e021a189c0/jackson-datatype-jdk8-2.11.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.11.2/e6235e5eb3cf3edd2a95cd0dc96bc48aeb309e8a/jackson-datatype-jsr310-2.11.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.module/jackson-module-parameter-names/2.11.2/c0dc526fcef5a3aae0273fc516ecf3505f7a5de8/jackson-module-parameter-names-2.11.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-databind/2.11.2/ee08bbd8975dde844307fe8309dfcd5ec7ee129d/jackson-databind-2.11.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-websocket/9.0.38/5d33c7736d192dff22bb5a7bef3ac2095573f91a/tomcat-embed-websocket-9.0.38.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-core/9.0.38/368aac73f9274896fa8cccf20f4799533629471c/tomcat-embed-core-9.0.38.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.glassfish/jakarta.el/3.0.3/dab46ee1ee23f7197c13d7c40fce14817c9017df/jakarta.el-3.0.3.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-aop/5.2.9.RELEASE/6ae14b8a11b4a30f22a15c8f97ac4b5d0979a4ef/spring-aop-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-beans/5.2.9.RELEASE/80e722ffa73a43459f639d36e25aa4e4a08d8d79/spring-beans-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-expression/5.2.9.RELEASE/c8584de306be115ef1715b7ed9d50fb2802867aa/spring-expression-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.github.luben/zstd-jni/1.4.4-7/f7e9d149c0182968cc2a8706d3ffe82f5c9f01eb/zstd-jni-1.4.4-7.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.lz4/lz4-java/1.7.1/c4d931ef8ad2c9c35d65b231a33e61428472d0da/lz4-java-1.7.1.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.xerial.snappy/snappy-java/1.1.7.3/241bb74a1eb37d68a4e324a4bc3865427de0a62d/snappy-java-1.1.7.3.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.30/b5a4b6d16ab13e34a88fae84c35cd5d68cac922c/slf4j-api-1.7.30.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.2/4bfc12adfe4842bf07b657f0369c4cb522955686/commons-logging-1.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/commons-collections/commons-collections/3.2.2/8ad72fe39fa8c91eaaf12aadb21e0c3661fe26d5/commons-collections-3.2.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.2.3/7c4f3c474fb2c041d8028740440937705ebb473a/logback-classic-1.2.3.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-to-slf4j/2.13.3/966f6fd1af4959d6b12bfa880121d4a2b164f857/log4j-to-slf4j-2.13.3.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/1.7.30/d58bebff8cbf70ff52b59208586095f467656c30/jul-to-slf4j-1.7.30.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework/spring-jcl/5.2.9.RELEASE/39777c3eeaf3d0957d9fdffbb75e3ff8a89caf62/spring-jcl-5.2.9.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-core/2.11.2/bc022ab0f0c83c07f9c52c5ab9a6a4932b15cc35/jackson-core-2.11.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-annotations/2.11.2/e0a7f61fce3e3eac38a079c11831868269de2ea/jackson-annotations-2.11.2.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.2.3/864344400c3d4d92dfeb0a305dc87d953677c03c/logback-core-1.2.3.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.13.3/ec1508160b93d274b1add34419b897bae84c6ca9/log4j-api-2.13.3.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-devtools/2.3.4.RELEASE/c904a412e16d5f5bf4399008e4683eeff21e61bf/spring-boot-devtools-2.3.4.RELEASE.jar:/Users/deus/.gradle/caches/modules-2/files-2.1/org.latencyutils/LatencyUtils/2.0.3/769c0b82cb2421c8256300e907298a9410a2a3d3/LatencyUtils-2.0.3.jar:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar com.vp.messaging.CsvDataloggerApplication
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
Connected to the target VM, address: '127.0.0.1:53505', transport: 'socket'
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-29 18:22:13.999  INFO 45619 --- [  restartedMain] c.vp.messaging.CsvDataloggerApplication  : Starting CsvDataloggerApplication on MacBookPro.local with PID 45619 (/Users/deus/async-messaging/csv-datalogger/build/classes/java/main started by deus in /Users/deus/async-messaging/csv-datalogger)
2020-09-29 18:22:14.002  INFO 45619 --- [  restartedMain] c.vp.messaging.CsvDataloggerApplication  : No active profile set, falling back to default profiles: default
2020-09-29 18:22:14.050  INFO 45619 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2020-09-29 18:22:14.051  INFO 45619 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2020-09-29 18:22:15.219  INFO 45619 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2020-09-29 18:22:15.230  INFO 45619 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-09-29 18:22:15.230  INFO 45619 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.38]
2020-09-29 18:22:15.317  INFO 45619 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-09-29 18:22:15.318  INFO 45619 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1267 ms
2020-09-29 18:22:15.645  INFO 45619 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-29 18:22:15.956  INFO 45619 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2020-09-29 18:22:15.960  INFO 45619 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2020-09-29 18:22:16.053  INFO 45619 --- [  restartedMain] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.offset.reset = latest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id = 
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = consumer-log
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.apache.kafka.common.serialization.StringDeserializer

2020-09-29 18:22:16.144  INFO 45619 --- [  restartedMain] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.1
2020-09-29 18:22:16.145  INFO 45619 --- [  restartedMain] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 0efa8fb0f4c73d92
2020-09-29 18:22:16.145  INFO 45619 --- [  restartedMain] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1601418136143
2020-09-29 18:22:16.148  INFO 45619 --- [  restartedMain] o.a.k.clients.consumer.KafkaConsumer     : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Subscribed to topic(s): test
2020-09-29 18:22:16.150  INFO 45619 --- [  restartedMain] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService
2020-09-29 18:22:16.178  INFO 45619 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2020-09-29 18:22:16.201  INFO 45619 --- [  restartedMain] c.vp.messaging.CsvDataloggerApplication  : Started CsvDataloggerApplication in 2.551 seconds (JVM running for 3.576)
2020-09-29 18:22:16.395  INFO 45619 --- [on(2)-127.0.0.1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-09-29 18:22:16.396  INFO 45619 --- [on(2)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-09-29 18:22:16.404  INFO 45619 --- [on(2)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 8 ms
2020-09-29 18:22:16.564  INFO 45619 --- [ntainer#0-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Cluster ID: erCUVq8cS4WlK5suxgMrrg
2020-09-29 18:22:16.565  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Discovered group coordinator localhost:9092 (id: 2147483647 rack: null)
2020-09-29 18:22:16.567  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] (Re-)joining group
2020-09-29 18:22:16.584  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Join group failed with org.apache.kafka.common.errors.MemberIdRequiredException: The group member needs to have a valid member id before actually entering a consumer group
2020-09-29 18:22:16.584  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] (Re-)joining group
2020-09-29 18:22:16.593  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Finished assignment for group at generation 9: {consumer-consumer-log-1-1ca5d5d3-bf68-4afa-a948-5e916b4189b3=Assignment(partitions=[test-0])}
2020-09-29 18:22:16.599  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Successfully joined group with generation 9
2020-09-29 18:22:16.603  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Adding newly assigned partitions: test-0
2020-09-29 18:22:16.618  INFO 45619 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-consumer-log-1, groupId=consumer-log] Setting offset for partition test-0 to the committed offset FetchPosition{offset=8, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 0 rack: null)], epoch=0}}
2020-09-29 18:22:16.620  INFO 45619 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : consumer-log: partitions assigned: [test-0]
2020-09-29 18:22:33.035  INFO 45619 --- [ntainer#0-0-C-1] c.v.m.consumers.EmployeeLoggingConsumer  : Employee(id=1, name=Jack, email=jack@gmail.com, gender=Male)
2020-09-29 18:22:33.035  INFO 45619 --- [ntainer#0-0-C-1] c.v.m.consumers.EmployeeLoggingConsumer  : Employee(id=2, name=John, email=john@gmail.com, gender=Male)


```