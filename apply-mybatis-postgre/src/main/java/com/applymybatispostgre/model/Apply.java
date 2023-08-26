package com.applymybatispostgre.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apply {
    private int id;
    private String name;
    private int age;
    private String time;
}
