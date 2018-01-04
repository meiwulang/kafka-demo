# kafka-demo
spring-boot 快速集成kafka消息中间件
kafka服务配置文件一定要追加如下几条配置

kafka搭建
	下载文件  
		http://mirrors.hust.edu.cn/apache/kafka/1.0.0/kafka_2.11-1.0.0.tgz
	解压文件 
		tar zxvf kafka_2.11-1.0.0.tgz
	启动自带zookeeper
		cd kafka_2.11-1.0.0
		bin/zookeeper-server-start.sh  -daemon config/zookeeper.properties
	启动kafka实例
	    bin/kafka-server-start.sh -daemon config/server.properties

远程访问kafka需要修改server.properties
	添加配置

	#外网或者内网地址
	advertised.host.name=192.168.1.156
	#内网地址
	host.name=192.168.1.156
	#支持删除主题
	delete.topic.enable=true

项目中
KafkaConsumerConfig KafkaProducerConfig 这两个文件暂时没有任何用处

