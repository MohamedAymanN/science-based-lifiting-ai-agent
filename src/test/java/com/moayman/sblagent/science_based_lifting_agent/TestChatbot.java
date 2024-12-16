package com.moayman.sblagent.science_based_lifting_agent;

import org.springframework.boot.SpringApplication;

public class TestChatbot {

    public static void main(String[] args) {
        SpringApplication.from(ScienceBasedLiftingAgentApplication::main).with(TestContainersConfig.class).run(args);
    }
}
