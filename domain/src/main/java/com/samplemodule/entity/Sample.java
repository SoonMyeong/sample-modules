package com.samplemodule.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Sample {
    @Id
    private Integer id;
    @Column(length = 10, nullable = false)
    private String username;
    @Column(length = 100)
    private String email;
}
