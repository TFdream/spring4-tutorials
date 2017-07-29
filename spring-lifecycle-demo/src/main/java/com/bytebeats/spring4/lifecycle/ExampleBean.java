package com.bytebeats.spring4.lifecycle;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-12-28 22:46
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-12-28 22:44
 */
public class ExampleBean implements BeanFactoryAware, BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private BeanFactory beanFactory;
    private String beanName;
    private ApplicationContext applicationContext;

    public ExampleBean() {
        System.out.println("【构造器】调用ExampleBean的构造器实例化");
    }

    // 这是BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out
                .println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    // 这是BeanNameAware接口方法
    @Override
    public void setBeanName(String beanName) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    // 这是ApplicationContextAware接口方法
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【ApplicationContextAware接口】调用ApplicationContextAware.setApplicationContext()");
        this.applicationContext = applicationContext;
    }

    // 这是InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    // 这是DiposibleBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    // 通过<bean>的init-method属性指定的初始化方法
    public void initMethod() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void destroyMethod() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }

    @PostConstruct
    public void init(){
        System.out.println("【@PostConstruct】注解方法init");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("【@PreDestroy】注解方法preDestroy");
    }

}
