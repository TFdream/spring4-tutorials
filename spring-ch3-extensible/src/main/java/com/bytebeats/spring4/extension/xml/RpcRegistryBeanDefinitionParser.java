package com.bytebeats.spring4.extension.xml;

import com.bytebeats.spring4.extension.domain.RpcRegistryBean;
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
public class RpcRegistryBeanDefinitionParser extends RegistryBeanDefinitionParser {

    @Override
    protected BeanDefinition parseInternal(Element element, ParserContext parserContext) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RpcRegistryBean.class);

        String id = element.getAttribute("id");
        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }

        String protocol = element.getAttribute("protocol");
        builder.addPropertyValue("protocol", protocol);

        String address = element.getAttribute("address");
        builder.addPropertyValue("address", address);

        String username = element.getAttribute("username");
        if (StringUtils.hasText(username)) {
            builder.addPropertyValue("username", username);
        }

        String password = element.getAttribute("password");
        if (StringUtils.hasText(password)) {
            builder.addPropertyValue("password", password);
        }

        String check = element.getAttribute("check");
        if (StringUtils.hasText(check)) {
            builder.addPropertyValue("check", Boolean.valueOf(check));
        }

        return this.registerBeanDefinition(parserContext, builder.getBeanDefinition(), id, null);
    }

}
