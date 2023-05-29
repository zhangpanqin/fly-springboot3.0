package com.mflyyou;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final DatabaseProperties databaseProperties;
    private final AppProperties appProperties;
    private final ConfigmapProperties configmapProperties;

    @GetMapping("/demo")
    public DatabaseProperties demo() {
        return databaseProperties;
    }

    @GetMapping("/app")
    public AppProperties app() {
        return appProperties;
    }

    @GetMapping("/configmap")
    public ConfigmapProperties configmap() {
        return configmapProperties;
    }
}

