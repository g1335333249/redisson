## Redisson standalone node

Redisson 提供作为独立节点运行并参与分布式计算的能力。 此类节点用于运行 [MapReduce](./9.-distributed-services/#95-distributed-mapreduce-service), [ExecutorService](./9.-distributed-services#93-executor-service), [ScheduledExecutorService](https://github.com/mrniko/redisson/wiki/9.-distributed-services#94-scheduled-executor-service) 任务 or [RemoteService](./9.-distributed-services#91-remote-service) 服务。 所有任务都保存在 Redis 中，直到执行时刻。

包装为一个jar，可以 [下载](https://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=org.redisson&a=redisson-all&v=3.13.4&e=jar).

[文档](https://github.com/mrniko/redisson/wiki/12.-Standalone-node) 对于Redisson节点。
