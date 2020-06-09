#springCloudExamples
启动顺序：
1、spring-cloud-example-config(配置中心)
2、spring-cloud-example-registry（注册中心）
3、spring-cloud-example-biz-a（服务a）/spring-cloud-example-biz-b（服务b）
4、spring-cloud-example-gateway（网关中心）

访问：
1、http://localhost:8002/spring-cloud-example-biz-a/hello
2、http://localhost:8002/spring-cloud-example-biz-b/hello

详细教程：
https://www.jianshu.com/p/7293b148028f