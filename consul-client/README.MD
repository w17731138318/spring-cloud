#Spring Cloud Consul
>Spring Cloud Consul项目是针对Consul的服务治理实现。Consul是一个分布式高可用的系统，它包含多个组件，但是作为一个整体，在微服务架构中为我们的基础设施提供服务发现和服务配置的工具。它包含了下面几个特性：
1. 服务发现
2. 健康检查
3. Key/Value存储
4. 多数据中心
>由于Spring Cloud Consul项目的实现，我们可以轻松的将基于Spring Boot的微服务应用注册到Consul上，并通过此实现微服务架构中的服务治理。

##先安装Consul
https://www.consul.io/
###win
设置环境变量：
在path下加上：E:\**\consul consul.exe的路径
###启动
cmd
consul agent -dev
###启动服务consul
###打开网址：http://localhost:8500 ，可以看到界面，相关服务发现的界面。