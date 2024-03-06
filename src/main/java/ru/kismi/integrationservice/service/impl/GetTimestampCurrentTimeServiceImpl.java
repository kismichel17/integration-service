//package ru.kismi.integrationservice.service.impl;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.RequiredArgsConstructor;
//import lombok.SneakyThrows;
//import org.springframework.stereotype.Service;
//import ru.kismi.companystarter.service.GetCurrentTimeService;
//
//import java.time.Instant;
//
//@Service
//@RequiredArgsConstructor
//public class GetTimestampCurrentTimeServiceImpl implements GetCurrentTimeService {
//
//    private final ObjectMapper objectMapper;
//
//    @Override
//    @SneakyThrows
//    public String getCurrentTime() {
//        return objectMapper.writeValueAsString(Instant.now());
//    }
//}