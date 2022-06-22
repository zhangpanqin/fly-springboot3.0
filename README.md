SpringBoot 3.0 研究,等待发版

## Kafka

```shell
# 启动 kafka 集群
docker-compose -f ./gradle/docker-compose/kafka-cluster.yaml up -d

# 关闭 kafka 集群
docker-compose -f ./gradle/docker-compose/kafka-cluster.yaml down

# 创建 topic
docker exec kafka-0 kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

# 创建生产者
docker exec --interactive --tty kafka-0 \
    kafka-console-producer.sh --bootstrap-server kafka-0:9092 \
    --topic quickstart-events
                       
# 创建消费者
docker exec --interactive --tty kafka-0 \
    kafka-console-consumer.sh --bootstrap-server kafka-0:9092 \
    --topic quickstart-events --from-beginning                       
```