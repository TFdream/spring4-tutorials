# Spring profile
Spring允许我们通过定义 profile 来将若干不同的 bean 定义组织起来，从而实现不同环境自动激活不同的 profile 来切换配置参数的功能。

## 实现

定义：
```
	<!-- 开发环境配置文件 -->
	<beans profile="dev">
		<context:property-placeholder location="classpath:dev/config-dev.properties"/>
	</beans>
	<!-- 测试环境配置文件 -->
	<beans profile="test">
		<context:property-placeholder location="classpath:test/config-test.properties"/>
	</beans>
	<!-- 生产环境配置文件 -->
	<beans profile="production">
		<context:property-placeholder location="classpath:production/config-production.properties"/>
	</beans>
```

## 激活profile
Spring 为我们提供了大量的激活 profile 的方法，可以通过代码来激活，也可以通过系统环境变量、JVM参数、servlet上下文参数来定义 spring.profiles.active 参数激活 profile。

* 系统环境变量
* JVM启动参数
* 作为Web 应用上下文中的初始化参数
* 使用@ActiveProfiles来进行激活

### Web应用上下文中的初始化参数

默认 profile 是指在没有任何 profile 被激活的情况下，默认 profile 内定义的内容将被使用，通常可以在 web.xml 中定义全局 servlet 上下文参数 spring.profiles.default 实现，代码如下：
```
<!-- 配置spring的默认profile -->
<context-param>
    <param-name>spring.profiles.default</param-name>
    <param-value>development</param-value>
</context-param>
```

### 启动参数
在生产环境中，以 tomcat 为例，我们在 tomcat 的启动脚本中加入以下 JVM 参数：
```
-Dspring.profiles.active="production"
```

### 使用@ActiveProfiles

```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
@ActiveProfiles("test")
public class SpringProfileTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testApp() {

        helloService.sayHello("ricky");
    }
}
```