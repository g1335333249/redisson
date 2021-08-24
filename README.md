# Redisson - Redis Java客户端<br/>具有内存数据网格的功能
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.redisson/redisson/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.redisson/redisson)
[![JavaDoc](http://www.javadoc.io/badge/org.redisson/redisson.svg)](http://www.javadoc.io/doc/org.redisson/redisson)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

[快速开始](https://github.com/redisson/redisson#quick-start) | [文档](https://github.com/redisson/redisson/wiki/Table-of-Content) | [变更日志](https://github.com/redisson/redisson/blob/master/CHANGELOG.md) | [代码示例](https://github.com/redisson/redisson-examples) | [常见问题](https://github.com/redisson/redisson/wiki/16.-FAQ) | [报告问题](https://github.com/redisson/redisson/issues/new)

基于高性能异步无锁Java Redis客户端和 [Netty](http://netty.io) 框架。  
JDK 兼容性：1.8 - 16，Android

## 特点

* Redis 复制设置 (包括支持 [AWS ElastiCache](http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Replication.html) 和 [Azure Redis Cache](https://azure.microsoft.com/en-us/services/cache/))  
* Redis 集群设置 (包括支持 [AWS ElastiCache Cluster](http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.html) 和 [Azure Redis Cache](https://azure.microsoft.com/en-us/services/cache/))  
* Redis 哨兵设置  
* Redis with Master with Slave only  
* Redis single (包括支持 [Azure Redis Cache](https://azure.microsoft.com/en-us/services/cache/) 和 [Google Cloud Memorystore for Redis](https://cloud.google.com/memorystore/docs/redis/))  
* 线程安全的实现  
* [Reactive Streams](https://github.com/redisson/redisson/wiki/3.-operations-execution#32-reactive-way) API  
* [RxJava3](https://github.com/redisson/redisson/wiki/3.-operations-execution#32-reactive-way) API  
* [Asynchronous](https://github.com/redisson/redisson/wiki/3.-operations-execution#31-async-way) API  
* 异步连接池  
* Lua 脚本  
* 本地缓存支持包括 [Caffeine](https://github.com/ben-manes/caffeine) -基于实现
* [Distributed Java objects](https://github.com/redisson/redisson/wiki/6.-Distributed-objects)  
    Object holder, Binary stream holder, Geospatial holder, BitSet, AtomicLong, AtomicDouble, PublishSubscribe,
    Bloom filter, HyperLogLog
* [Distributed Java collections](https://github.com/redisson/redisson/wiki/7.-Distributed-collections)  
    Map, Multimap, Set, List, SortedSet, ScoredSortedSet, LexSortedSet, Queue, Deque, Blocking Queue, Bounded Blocking Queue, Blocking Deque, Delayed Queue, Priority Queue, Priority Deque
* [Distributed Java locks and synchronizers](https://github.com/redisson/redisson/wiki/8.-Distributed-locks-and-synchronizers)  
    Lock, FairLock, MultiLock, RedLock, ReadWriteLock, Semaphore, PermitExpirableSemaphore, CountDownLatch
* [Distributed services](https://github.com/redisson/redisson/wiki/9.-distributed-services)  
    Remote service, Live Object service, Executor service, Scheduler service, MapReduce service
* [Helidon](https://github.com/redisson/redisson/tree/master/redisson-helidon) 整合  
* [Micronaut](https://github.com/redisson/redisson/tree/master/redisson-micronaut) 整合  
* [Quarkus](https://github.com/redisson/redisson/tree/master/redisson-quarkus) 整合  
* [Spring Cache](https://github.com/redisson/redisson/wiki/14.-Integration-with-frameworks/#142-spring-cache) 实现
* [Spring Transaction API](https://github.com/redisson/redisson/wiki/14.-Integration-with-frameworks/#148-spring-transaction-manager) 实现
* [Spring Data Redis](https://github.com/redisson/redisson/tree/master/redisson-spring-data) 整合
* [Spring Boot Starter](https://github.com/redisson/redisson/tree/master/redisson-spring-boot-starter) 实现
* [Hibernate Cache](https://github.com/redisson/redisson/tree/master/redisson-hibernate) 实现
* [MyBatis Cache](https://github.com/redisson/redisson/tree/master/redisson-mybatis) 实现
* [Transactions API](https://github.com/redisson/redisson/wiki/10.-Additional-features#104-transactions)
* [JCache API (JSR-107)](https://github.com/redisson/redisson/wiki/14.-Integration-with-frameworks/#144-jcache-api-jsr-107-implementation) 实现
* [Tomcat Session Manager](https://github.com/redisson/redisson/tree/master/redisson-tomcat) 实现
* [Spring Session](https://github.com/redisson/redisson/wiki/14.-Integration-with-frameworks/#147-spring-session) 实现
* [Redis pipelining](https://github.com/redisson/redisson/wiki/10.-additional-features#103-execution-batches-of-commands) (command batches)
* 支持安卓平台  
* 支持自动重连  
* 支持发送命令失败自动重试  
* 支持 OSGi  
* 支持 SSL  
* 支持许多流行的编解码器 ([JBoss Marshalling](https://github.com/jboss-remoting/jboss-marshalling), [Jackson JSON](https://github.com/FasterXML/jackson), [Avro](http://avro.apache.org/), [Smile](http://wiki.fasterxml.com/SmileFormatSpec), [CBOR](http://cbor.io/), [MsgPack](http://msgpack.org/), [Kryo](https://github.com/EsotericSoftware/kryo), [Amazon Ion](https://amzn.github.io/ion-docs/), [LZ4](https://github.com/jpountz/lz4-java), [Snappy](https://github.com/xerial/snappy-java) 和 JDK 序列化)
* 超过 2000 个单元测试  
<!--
Used by
================================
[![Siemens](https://redisson.org/assets/logos/client29.png "Siemens")](https://www.siemens.com) &nbsp;&nbsp;&nbsp;
[![BMW GROUP](https://redisson.org/assets/logos/client27.png "BMW GROUP")](https://www.bmwgroup.com) &nbsp;&nbsp;&nbsp;
[![AIG](https://redisson.org/assets/logos/client24.png "AIG")](https://www.aig.com/) &nbsp;&nbsp;&nbsp;
[![S&P Global](https://redisson.org/assets/logos/client20.png "S&P Global")](https://www.spglobal.com/) &nbsp;&nbsp;&nbsp;
[![SAP](https://redisson.org/assets/logos/client12.png "SAP")](http://www.sap.com/) &nbsp;&nbsp;&nbsp;
[![EA](https://redisson.org/assets/logos/client1.png "EA")](http://ea.com/) &nbsp;&nbsp;&nbsp;
[![Adobe](https://redisson.org/assets/logos/client23.png "Adobe")](https://www.adobe.com/)  

[![Jeppesen](https://redisson.org/assets/logos/client25.png "Jeppesen")](https://www.jeppesen.com/) &nbsp;&nbsp;&nbsp;
[![BROOKHAVEN](https://redisson.org/assets/logos/client6.png "Brookhaven National Laboratory")](http://bnl.gov/) &nbsp;&nbsp;&nbsp;
[![New Relic Synthetics](https://redisson.org/assets/logos/client3.png "New Relic Synthetics")](http://newrelic.com/synthetics) &nbsp;&nbsp;&nbsp;
[![Netflix](https://redisson.org/assets/logos/client10.png "Netflix")](https://netflix.com/) &nbsp;&nbsp;&nbsp;
[![Personal Capital](https://redisson.org/assets/logos/client26.png "Personal Capital")](https://www.personalcapital.com)  

[![Singtel](https://redisson.org/assets/logos/client5.png "New Relic Synthetics")](http://singtel.com/) &nbsp;&nbsp;&nbsp;
[![Baidu](https://redisson.org/assets/logos/client2.png "Baidu")](http://baidu.com/) &nbsp;&nbsp;&nbsp;
[![Infor](https://redisson.org/assets/logos/client4.png "Infor")](http://www.infor.com/) &nbsp;&nbsp;&nbsp;
[![Crimson Hexagon](https://redisson.org/assets/logos/client7.png "Crimson Hexagon")](https://www.crimsonhexagon.com/) &nbsp;&nbsp;&nbsp;
[![ContaAzul](https://redisson.org/assets/logos/client18.png "ContaAzul")](https://contaazul.com/)&nbsp;&nbsp;&nbsp;
[![马蜂窝](https://redisson.org/assets/logos/client33.png "马蜂窝")](http://www.mafengwo.cn/)  

[![Datorama](https://redisson.org/assets/logos/client8.png "Datorama")](https://datorama.com/)&nbsp;&nbsp;&nbsp;
[![Ticketmaster](https://redisson.org/assets/logos/client14.png "Ticketmaster")](http://www.ticketmaster.com/)&nbsp;&nbsp;&nbsp;
[![NAB](https://redisson.org/assets/logos/client11.png "NAB")](https://www.nab.com.au/)&nbsp;&nbsp;&nbsp;
[![Juniper](https://redisson.org/assets/logos/client31.png "Juniper")](https://www.juniper.net/)&nbsp;&nbsp;&nbsp;
[![火币](https://redisson.org/assets/logos/client32.png "火币")](https://www.huobi.com/)&nbsp;&nbsp;&nbsp;

[![Alibaba](https://redisson.org/assets/logos/client19.png "Alibaba")](http://www.alibaba-inc.com)&nbsp;&nbsp;&nbsp;
[![Flipkart](https://redisson.org/assets/logos/client21.png "Flipkart")](https://www.flipkart.com/)&nbsp;&nbsp;&nbsp;
[![Invaluable](https://redisson.org/assets/logos/client13.png "Invaluable")](http://www.invaluable.com/)&nbsp;&nbsp;&nbsp;
[![BBK](https://redisson.org/assets/logos/client22.png "BBK")](http://www.gdbbk.com/)  
[![SULAKE](https://redisson.org/assets/logos/client17.png "SULAKE")](http://www.sulake.com/)

<sub>Logos, product names and all other trademarks displayed on this page belong to their respective holders and used for identification purposes only. Use of these trademarks, names and brands does not imply endorsement.</sub>
-->
## 成功案例

## [从 Hazelcast 迁移到 Redis Datorama](https://engineering.datorama.com/moving-from-hazelcast-to-redis-b90a0769d1cb)  
## [从 Hazelcast 迁移到 Redis Halodoc](https://blogs.halodoc.io/why-and-how-we-move-from-hazelcast-to-redis-2/)
## [Redis 分布式锁定（从 Hazelcast 迁移） ContaAzul](https://carlosbecker.com/posts/distributed-locks-redis/)  
## [从 Coherence 迁移到 Redis](https://www.youtube.com/watch?v=JF5R2ucKTEg)  


## 快速开始

#### Maven 
    <dependency>
       <groupId>org.redisson</groupId>
       <artifactId>redisson</artifactId>
       <version>3.16.1</version>
    </dependency>  

#### Gradle
    compile 'org.redisson:redisson:3.16.1'  

#### SBT
    libraryDependencies += "org.redisson" % "redisson" % "3.16.1"

#### Java

```java
// 1. 创建配置对象
Config config = new Config();
config.useClusterServers()
       // 使用“rediss:”进行 SSL 连接
      .addNodeAddress("redis://127.0.0.1:7181");

// 或从文件中读取配置
config = Config.fromYAML(new File("config-file.yaml")); 
```

```java
// 2. 创建Redisson实例

// Sync and Async API
RedissonClient redisson = Redisson.create(config);

// Reactive API
RedissonReactiveClient redissonReactive = redisson.reactive();

// RxJava3 API
RedissonRxClient redissonRx = redisson.rxJava();
```

```java
// 3. 获取基于 Redis 的 java.util.concurrent.ConcurrentMap 实现
RMap<MyKey, MyValue> map = redisson.getMap("myMap");

RMapReactive<MyKey, MyValue> mapReactive = redissonReactive.getMap("myMap");

RMapRx<MyKey, MyValue> mapRx = redissonRx.getMap("myMap");
```

```java
// 4. 获取基于 Redis 的 java.util.concurrent.locks.Lock 实现
RLock lock = redisson.getLock("myLock");

RLockReactive lockReactive = redissonReactive.getLock("myLock");

RLockRx lockRx = redissonRx.getLock("myLock");
```

```java
// 4. 获取基于 Redis 的 java.util.concurrent.ExecutorService 实现
RExecutorService executor = redisson.getExecutorService("myExecutorService");

// over 50 Redis based Java objects and services ...

```

考虑 __[Redisson PRO](https:redisson.pro)__ 版本以获得超快的性能和 SLA 支持。

## 下载
   
[Redisson 3.16.1](https://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=org.redisson&a=redisson&v=3.16.1&e=jar),
[Redisson node 3.16.1](https://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=org.redisson&a=redisson-all&v=3.16.1&e=jar)  

## 常见问题

[Q: What is the cause of RedisTimeoutException?](https://github.com/redisson/redisson/wiki/16.-FAQ#q-what-is-the-cause-of-redistimeoutexception)

[Q: When do I need to shut down a Redisson instance, at the end of each request or the end of the life of a thread?](https://github.com/redisson/redisson/wiki/16.-FAQ#q-when-do-i-need-to-shut-down-a-redisson-instance-at-the-end-of-each-request-or-the-end-of-the-life-of-a-thread)

[Q: In MapCache/SetCache/SpringCache/JCache, I have set an expiry time to an entry, why is it still in Redis when it should be disappeared?](https://github.com/redisson/redisson/wiki/16.-FAQ#q-in-mapcachesetcachespringcachejcache-i-have-set-an-expiry-time-to-an-entry-why-is-it-still-in-redis-when-it-should-be-disappeared)

[Q: How can I perform Pipelining/Transaction through Redisson?](https://github.com/redisson/redisson/wiki/16.-FAQ#q-how-can-i-perform-pipeliningtransaction-through-redisson)

[Q: Is Redisson thread safe? Can I share an instance of it between different threads?](https://github.com/redisson/redisson/wiki/16.-FAQ#q-is-redisson-thread-safe-can-i-share-an-instance-of-it-between-different-threads)

[Q: Can I use different encoder/decoders for different tasks?](https://github.com/redisson/redisson/wiki/16.-FAQ#q-can-i-use-different-encoderdecoders-for-different-tasks)

