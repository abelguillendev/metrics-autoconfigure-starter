package com.example.metrics.autoconfigure;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MeterRegistry.class)
@AutoConfigureAfter(PrometheusMetricsConfiguration.class)
@ConditionalOnBean(MeterRegistry.class)
@ConditionalOnProperty(prefix = "example.metrics", name = "enabled", havingValue = "true", matchIfMissing = true)
public class MetricsAutoConfiguration {

    // BasicCustomMetrics has been removed from the starter; consumers should register their own custom metrics
}