package com.example.chatbot;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatbotService {
    private final RestTemplate restTemplate;

    public ChatbotService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchSampleData() {
        // 임의의 테스트 API 호출
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
