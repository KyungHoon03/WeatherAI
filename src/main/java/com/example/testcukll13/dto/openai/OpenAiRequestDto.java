package com.example.testcukll13.dto.openai;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class OpenAiRequestDto {
    private String model;
    private List<Map<String, String>> messages;
    private double temperature;
    private int max_tokens;


}