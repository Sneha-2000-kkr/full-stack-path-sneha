package com.example.hello.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupLogger {

    @Value("${server.port}")
    private int port;

    @Value("${server.servlet.context-path:/}")
    private String contextPath;

    @EventListener(ApplicationReadyEvent.class)
    public void onReady() {
        System.out.println("Application started. Open http://localhost:" + port + contextPath);
    }
}
