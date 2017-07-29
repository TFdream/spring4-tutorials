package com.bytebeats.spring4.extension.samples;

import com.bytebeats.spring4.extension.domain.RpcProtocolBean;
import com.bytebeats.spring4.extension.domain.RpcReferenceBean;
import com.bytebeats.spring4.extension.domain.RpcRegistryBean;
import com.bytebeats.spring4.extension.domain.RpcServiceBean;
import com.bytebeats.spring4.extension.service.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        IHelloService helloService = (IHelloService) context.getBean("helloService");
        System.out.println(helloService.sayHello("ricky"));

        RpcServiceBean rpcServiceBean = (RpcServiceBean) context.getBean("helloServiceImpl");
        System.out.println("rpcServiceBean:"+rpcServiceBean.getInterfaceName());

        RpcReferenceBean accountService = (RpcReferenceBean) context.getBean("accountService");
        System.out.println("accountService:"+accountService.getInterfaceName());

        RpcRegistryBean rpcRegistryBean = (RpcRegistryBean) context.getBean("zk");
        System.out.println("rpcRegistryBean:"+rpcRegistryBean.getAddress());

        RpcProtocolBean rpcProtocolBean = (RpcProtocolBean) context.getBean("hessian");
        System.out.println("rpcProtocolBean:"+rpcProtocolBean.getPort());

    }
}
