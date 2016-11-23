package com.bytebeats.spring4.extension.xml;

import com.bytebeats.spring4.extension.domain.RpcServiceBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-23 11:50
 */
public class RpcServiceBeanDefinitionParser extends AbstractBeanDefinitionParser {

    @Override
    protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {

        return parseComponet(element, parserContext);
    }

    private AbstractBeanDefinition parseComponet(Element element, ParserContext parserContext) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RpcServiceBean.class);

        String id = element.getAttribute("id");
        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }

        String ref = element.getAttribute("ref");
        builder.addPropertyValue("ref", ref);

        String interfaceName = element.getAttribute("interface");
        builder.addPropertyValue("interfaceName", interfaceName);

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

        return builder.getBeanDefinition();
    }

}
