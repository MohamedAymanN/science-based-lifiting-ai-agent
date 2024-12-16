package com.moayman.sblagent.science_based_lifting_agent;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.ollama.OllamaContainer;

public class TestContainersConfig {
    @Bean
    @ServiceConnection
    OllamaContainer ollama() {
        return new OllamaContainer("ollama/ollama").withReuse(true);
    }
}
