package com.samplemodule.repository;

import com.samplemodule.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SampleRepository extends JpaRepository<Sample, Integer> {
    @Override
    Optional<Sample> findById(Integer integer);
}
