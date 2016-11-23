package com.bytebeats.spring4.extension.samples;

import com.bytebeats.spring4.extension.domain.RpcServiceBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        RpcServiceBean rpc = (RpcServiceBean) context.getBean("rpc");
        System.out.println("rpc:"+rpc.getInterfaceName());

        RpcServiceBean rpcServiceBean = (RpcServiceBean) context.getBean("rpcService");
        System.out.println("rpcServiceBean:"+rpcServiceBean.getInterfaceName());
        context.close();
    }
}
