package orange.spring4.extension.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-23 11:48
 */
public class RpcNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("service", new RpcServiceBeanDefinitionParser());
        registerBeanDefinitionParser("ref", new RpcReferenceBeanDefinitionParser());
        registerBeanDefinitionParser("registry", new RpcRegistryBeanDefinitionParser());
        registerBeanDefinitionParser("protocol", new RpcProtocolBeanDefinitionParser());
    }
}
