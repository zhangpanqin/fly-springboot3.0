package com.mflyyou;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "configmap")
public class ConfigmapProperties {
    private String name;
    private String age;
}
