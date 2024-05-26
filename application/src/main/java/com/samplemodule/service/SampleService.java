package com.samplemodule.service;

import com.samplemodule.entity.Sample;
import com.samplemodule.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public String getGreeting() {
        Sample sample = sampleRepository.findById(1).orElse(null);
        return sample == null ? "계정 없는 유저 Hi?" : sample.getUsername() + "님 Hello.";
    }
}
