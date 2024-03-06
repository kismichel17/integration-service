package ru.kismi.integrationservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kismi.companystarter.service.GetCurrentTimeService;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final ObjectMapper objectMapper;
    private final GetCurrentTimeService getCurrentTimeService;

    @SneakyThrows
    @GetMapping("/hello")
    public String hello() {
//        return objectMapper.writeValueAsString(Instant.now());
        return getCurrentTimeService.getCurrentTime();
    }
}