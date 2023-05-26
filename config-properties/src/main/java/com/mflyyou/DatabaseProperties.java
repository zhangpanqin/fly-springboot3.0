package com.mflyyou;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "database")
public class DatabaseProperties {
    private String username;
    private String password;
}
