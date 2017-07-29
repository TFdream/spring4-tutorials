package com.bytebeats.spring4.extension.xml;

import com.bytebeats.spring4.extension.domain.RpcServiceBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-23 11:50
 */
public class RpcServiceBeanDefinitionParser extends RegistryBeanDefinitionParser {

    @Override
    protected BeanDefinition parseInternal(Element element, ParserContext parserContext) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RpcServiceBean.class);

        String ref = element.getAttribute("ref");
        builder.addPropertyValue("ref", ref);

        String id = element.getAttribute("id");
        if (StringUtils.isEmpty(id)) {
            id = ref+"Impl";
            System.out.println("id is empty, generate id:"+id);
        }
        builder.addPropertyValue("id", id);

        String interfaceName = element.getAttribute("interface");
        builder.addPropertyValue("interfaceName", interfaceName);

        String group = element.getAttribute("group");
        if (StringUtils.hasText(group)) {
            builder.addPropertyValue("group", group);
        }

        String registry = element.getAttribute("registry");
        if (StringUtils.hasText(registry)) {
            builder.addPropertyValue("registry", registry);
        }

        String version = element.getAttribute("version");
        if (StringUtils.hasText(version)) {
            builder.addPropertyValue("version", version);
        }

        String timeout = element.getAttribute("timeout");
        if (StringUtils.hasText(timeout)) {
            builder.addPropertyValue("timeout", Integer.parseInt(timeout));
        }

        String retries = element.getAttribute("retries");
        if (StringUtils.hasText(retries)) {
            builder.addPropertyValue("retries", Integer.parseInt(retries));
        }

        String async = element.getAttribute("async");
        if (StringUtils.hasText(async)) {
            builder.addPropertyValue("async", Boolean.valueOf(async));
        }

        return this.registerBeanDefinition(parserContext, builder.getBeanDefinition(), id, null);
    }

}
