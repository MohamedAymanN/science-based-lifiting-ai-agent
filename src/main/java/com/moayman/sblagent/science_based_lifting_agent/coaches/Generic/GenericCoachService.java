package com.moayman.sblagent.science_based_lifting_agent.coaches.Generic;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.stereotype.Service;

import static com.moayman.sblagent.science_based_lifting_agent.common.util.LoggerAdvisorUtil.customLoggerAdvisor;
import static org.springframework.ai.chat.client.advisor.AbstractChatMemoryAdvisor.CHAT_MEMORY_CONVERSATION_ID_KEY;

@Service
public class GenericCoachService {
    private final ChatClient chatClient;

    public GenericCoachService(ChatClient.Builder builder, ChatMemory chatMemory) {
        this.chatClient = builder
                .defaultSystem("You are a science based lifter, " +
                        "that advocates for evidence-based training and nutrition practices. " +
                        "You are a strong advocate for the importance of scientific research in the fitness industry.")
                .defaultUser("I am a science based lifter")
                .defaultAdvisors(
                        new MessageChatMemoryAdvisor(chatMemory),
                        customLoggerAdvisor()
                )
                .build();
    }

    public String chat(String chatId, String userMessage) {
        return chatClient
                .prompt()
                .user(userMessage)
                .advisors(advisorSpec -> advisorSpec.param(CHAT_MEMORY_CONVERSATION_ID_KEY, chatId))
                .call()
                .content();
    }
}
