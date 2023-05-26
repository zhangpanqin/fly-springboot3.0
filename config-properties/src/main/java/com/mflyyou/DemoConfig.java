package com.mflyyou;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:sample.yaml", factory = YamlPropertySourceFactory.class)
@RequiredArgsConstructor
public class DemoConfig {
    private final ContextRefresher contextRefresher;
}
