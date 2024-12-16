package com.moayman.sblagent.science_based_lifting_agent.common.util;

import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;

public class LoggerAdvisorUtil {


    public static SimpleLoggerAdvisor customLoggerAdvisor() {
        return new SimpleLoggerAdvisor(
                request -> "Custom request: " + request.userText(),
                response -> "Custom response: " + response.getResult(),
                0
        );
    }
}
