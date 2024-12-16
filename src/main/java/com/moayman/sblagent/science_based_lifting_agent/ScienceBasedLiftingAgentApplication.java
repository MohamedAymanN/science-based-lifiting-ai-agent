package com.moayman.sblagent.science_based_lifting_agent;

import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScienceBasedLiftingAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScienceBasedLiftingAgentApplication.class, args);
	}

	@Bean
	ChatMemory chatHistory() {
		return new InMemoryChatMemory();
	}
}
