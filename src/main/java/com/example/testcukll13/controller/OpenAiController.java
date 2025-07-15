package com.example.testcukll13.controller;


import com.example.testcukll13.domain.OpenAI.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class OpenAiController {

    private final OpenAiService openAiService;

    // ✅ 클라이언트가 /chat?message=... 형태로 보낸 요청 처리
    @GetMapping("/json")
    public Map<String, String> ask(@RequestParam String message) {
        // 서비스에게 메시지를 넘기고 응답 받아서 그대로 리턴
        String reply = openAiService.askChatGPT(message);
        return Map.of("reply", reply);
    }
}

