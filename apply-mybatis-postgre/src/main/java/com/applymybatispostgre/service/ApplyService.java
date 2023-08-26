package com.applymybatispostgre.service;

import com.applymybatispostgre.model.Apply;

import java.util.List;

public interface ApplyService {
    
    List<Apply> findAll();

    Apply findById(int id);

    int deleteById (int id);

    int save(Apply item);

    int update(int id, Apply item);
}
