package orange.spring4.sample.ds;

import org.springframework.util.Assert;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-12-30 11:14
 */
public class DynamicRoutingContextHolder {
    private static final ThreadLocal<RoutingStrategy> contextHolder =
            new ThreadLocal<>();

    public static void setRouteStrategy(RoutingStrategy customerType) {
        Assert.notNull(customerType, "customerType cannot be null");
        contextHolder.set(customerType);
    }

    public static RoutingStrategy getRouteStrategy() {
        return (RoutingStrategy) contextHolder.get();
    }

    public static void clearRouteStrategy() {
        contextHolder.remove();
    }
}
