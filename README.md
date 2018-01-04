# kafka-demo
spring-boot 快速集成kafka消息中间件
kafka服务配置文件一定要追加如下几条配置

#外网或者内网地址
advertised.host.name=192.168.1.156
#内网地址
host.name=192.168.1.156
#支持删除主题
delete.topic.enable=true
