package orange.spring4.sample.ds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 *
 * @author Ricky Fung
 * @create 2016-12-30 11:12
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        return DynamicRoutingContextHolder.getRouteStrategy();
    }
}
