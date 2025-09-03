package com.example.metrics.autoconfigure;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

public class MetricsStarterEnvironmentPostProcessor implements EnvironmentPostProcessor {

    private static final String PROPERTY_SOURCE_NAME = "metrics-autoconfigure-starter-defaults";

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Map<String, Object> map = new HashMap<>();
        map.put("example.metrics.enabled", "true");
        map.put("management.endpoints.web.exposure.include", "prometheus,health,metrics");
        map.put("management.endpoint.prometheus.enabled", "true");
        map.put("management.endpoints.web.base-path", "/actuator");

        MapPropertySource ps = new MapPropertySource(PROPERTY_SOURCE_NAME, map);
        environment.getPropertySources().addLast(ps);
    }
}
