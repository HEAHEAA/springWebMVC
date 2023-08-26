package com.applymybatispostgre.service;

import com.applymybatispostgre.mapper.ApplyMapper;
import com.applymybatispostgre.model.Apply;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplyServiceImpl implements ApplyService{

    private final ApplyMapper mapper;

    @Override
    public List<Apply> findAll(){
        return mapper.findAll();
    }

    @Override
    public Apply findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public int save(Apply item) {
        return mapper.save(item);
    }

    @Override
    public int update(int id, Apply item) {
        item.setId(id);
        return mapper.update(item);
    }


}
