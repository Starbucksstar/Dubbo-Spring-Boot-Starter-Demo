# Dubbo-Spring-Boot-Starter-Demo
Dubbo Springboot Starter Demo(Provider、Consumer、Monitor)

# Dubbo
![]()

# dubbo spring boot starter step
## apache官方的starter,方便快速开发dubbo框架的rpc服务
### 注册中心：Zookeeper、Nacos(推荐，阿里出品，支持服务注册发现和配置管理，权限管理等功能，开源且支持越来越多的组件)
1. 启动zookeeper，本机地址为localhost:2181/ nacos:localhost:8848(nacos dashboard:localhost:8848/nacos)
2. 创建服务提供方工程，新建两个moudule，分别是dubbo-provider-api,dubbo-provider-service 
  -   2.1.api工程添加服务提供者的接口和相关接口入参出参DTO
  -   2.2.service工程添加api接口实现类,通过@Service注解暴露接口给zk注册中心。
3. 创建服务消费方工程fubbo-consumer,添加dubbo-provider-api的maven依赖,在引用地方使用@Reference注解引用服务提供方的接口。
4. 下载dubbo-admin工程，使用mvn clean package 打包最新的dubbo-admin的dashboard的jar包，并使用java -jar的方式进行启动。
5. 通过消费者的controller去消费提供方的接口，查看返回接口和响应请求时间
6. 打开http://localhost:8080 打开dubbo-admin的dashboard，可以查看服务注册情况，服务治理、服务测试，服务统计以及服务Mock功能等。


