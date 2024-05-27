package com.samplemodule.service;

import com.samplemodule.dto.SampleDto;
import com.samplemodule.mapper.SampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleMapper sampleMapper;

    public String getGreeting(Integer id) {
        SampleDto sample = sampleMapper.findById(id);
        return sample == null ? "계정 없는 유저 Hi?" : sample.getUsername() + "님 Hello.";
    }
}
