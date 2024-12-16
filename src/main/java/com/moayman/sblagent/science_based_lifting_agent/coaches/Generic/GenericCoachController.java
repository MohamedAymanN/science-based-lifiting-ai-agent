package com.moayman.sblagent.science_based_lifting_agent.coaches.Generic;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class GenericCoachController {
    private final GenericCoachService genericCoachService;

    @PostMapping(value = "/chat/{chatId}")
    public ResponseEntity<String> ask(@RequestBody String message, @PathVariable String chatId) {
        var coachAnswer = genericCoachService.chat(chatId, message);
        return ResponseEntity.ok(coachAnswer);
    }
}
