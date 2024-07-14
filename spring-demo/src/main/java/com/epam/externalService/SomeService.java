package com.epam.externalService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

    @Value("${external.service.url}")
    String url;

    public String getUrl() {
        return url;
    }
}
