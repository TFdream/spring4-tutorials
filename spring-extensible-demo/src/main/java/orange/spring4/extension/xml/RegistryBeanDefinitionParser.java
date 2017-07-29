package orange.spring4.extension.xml;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-26 2:44
 */
public abstract class RegistryBeanDefinitionParser implements BeanDefinitionParser {

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {

        return this.parseInternal(element, parserContext);
    }

    /**向Spring容器注册Bean*/
    protected BeanDefinition registerBeanDefinition(ParserContext parserContext, BeanDefinition definition,
                                                            String id, String[] aliases){

        BeanDefinitionHolder holder1 = new BeanDefinitionHolder(definition, id, aliases);
        this.registerBeanDefinition0(holder1, parserContext.getRegistry());

        BeanComponentDefinition componentDefinition = new BeanComponentDefinition(holder1);
        parserContext.registerComponent(componentDefinition);

        return definition;
    }

    private void registerBeanDefinition0(BeanDefinitionHolder definition, BeanDefinitionRegistry registry) {
        BeanDefinitionReaderUtils.registerBeanDefinition(definition, registry);
    }

    protected abstract BeanDefinition parseInternal(Element element, ParserContext parserContext);
}
