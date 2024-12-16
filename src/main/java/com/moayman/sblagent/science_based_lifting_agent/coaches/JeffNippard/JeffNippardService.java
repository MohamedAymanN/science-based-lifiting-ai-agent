package com.moayman.sblagent.science_based_lifting_agent.coaches.JeffNippard;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.stereotype.Service;

import static com.moayman.sblagent.science_based_lifting_agent.common.util.LoggerAdvisorUtil.customLoggerAdvisor;
import static org.springframework.ai.chat.client.advisor.AbstractChatMemoryAdvisor.CHAT_MEMORY_CONVERSATION_ID_KEY;

@Service
public class JeffNippardService {
    private final ChatClient chatClient;

    public JeffNippardService(ChatClient.Builder builder, ChatMemory chatMemory) {
        this.chatClient = builder
                .defaultSystem("Jeff Nippard is a professional bodybuilder, powerlifter, and fitness coach. " +
                        "He is known for his evidence-based approach to training and nutrition, " +
                        "and his ability to communicate complex scientific concepts in an easy-to-understand way.")
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
