Spring Cloud Netflix 模板

各个项目介绍(括号内为该项目使用到的组件)：

hello-spring-cloud-dependencies:
	公共的依赖管理，其他项目依赖该项目的pom.xml
	
hello-spring-cloud-eureka(eureka-server,zipkin-client):
	服务发现与服务注册中心
	
hello-spring-cloud-config(eureka-client,zipkin-client,config-server):
	配置中心，使用respo目录下的配置文件。
	注意：由于网络问题，可能配置文件的拉取会失败。
	建议使用gitlab,需配置username和password
	
hello-spring-cloud-service-admin(eureka-client,config-client,zipkin-client):
	服务提供者
	
hello-spring-cloud-web-admin-ribbon(ribbon,eureka-discovery-client,hystrix,hystrix-dashboard,config-client,zipkin-client):
	使用ribbon实现服务调用和负载均衡
	
hello-spring-cloud-web-admin-feign(feign,hystrix,hystrix-dashboard,config-client,zipkin-client,eureka-discovery-client,admin-client):
	使用feign实现服务调用和负载均衡
	
hello-spring-cloud-zuul(zuul,eureka-client):
	api网关，api统一接入
	
hello-spring-cloud-zipkin(zipkin-server,eureka-client):
	服务追踪，查看服务链路，分析系统瓶颈
	
hello-spring-cloud-admin(admin-server,eureka-client):
	服务追踪，检查服务健康状况
	
服务启动顺序：
	1.服务注册与发现
	2.配置中心
	3.服务提供者
	4.服务消费者
	5.api网关
	