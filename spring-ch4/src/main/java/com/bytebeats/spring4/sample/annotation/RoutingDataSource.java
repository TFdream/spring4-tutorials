package com.bytebeats.spring4.sample.annotation;

import com.bytebeats.spring4.sample.ds.RoutingStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2016-12-30 15:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoutingDataSource {
    RoutingStrategy value();
}
