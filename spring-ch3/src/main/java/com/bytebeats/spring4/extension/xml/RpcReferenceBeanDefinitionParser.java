package com.bytebeats.spring4.extension.xml;

import com.bytebeats.spring4.extension.domain.RpcReferenceBean;
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
public class RpcReferenceBeanDefinitionParser extends AbstractBeanDefinitionParser {

    @Override
    protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {

        return parseComponet(element, parserContext);
    }

    private AbstractBeanDefinition parseComponet(Element element, ParserContext parserContext) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RpcReferenceBean.class);

        String id = element.getAttribute("id");
        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }

        String interfaceName = element.getAttribute("interface");
        builder.addPropertyValue("interfaceName", interfaceName);

        String version = element.getAttribute("version");
        if (StringUtils.hasText(version)) {
            builder.addPropertyValue("version", version);
        }

        String group = element.getAttribute("group");
        if (StringUtils.hasText(group)) {
            builder.addPropertyValue("group", group);
        }

        String registry = element.getAttribute("registry");
        if (StringUtils.hasText(registry)) {
            builder.addPropertyValue("registry", registry);
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

        String check = element.getAttribute("check");
        if (StringUtils.hasText(check)) {
            builder.addPropertyValue("check", Boolean.valueOf(check));
        }
        return builder.getBeanDefinition();
    }

}
