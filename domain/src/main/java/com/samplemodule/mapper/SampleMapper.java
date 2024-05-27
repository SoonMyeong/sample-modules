package com.samplemodule.mapper;

import com.samplemodule.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
    SampleDto findById(Integer id);
}
