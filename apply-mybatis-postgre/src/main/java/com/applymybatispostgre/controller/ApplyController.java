package com.applymybatispostgre.controller;

import com.applymybatispostgre.model.Apply;
import com.applymybatispostgre.service.ApplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApplyController {
    private final ApplyService service;

    //전체 Read
    @GetMapping("/list")
    public List<Apply> findAll(){
        return service.findAll();
    }

    //1개씩
    @GetMapping("/list/{id}")
    public Apply findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PostMapping("/list/insert")
    public int save(@RequestBody Apply apply){
        return service.save(apply);
    }

    @PutMapping("/list/update/{id}")
    public int update(@PathVariable("id")int id,@RequestBody Apply apply){
        return service.update(id,apply);
    }

    @DeleteMapping("/list/{id}")
    public int deleteById(@PathVariable("id")int id){
        return service.deleteById(id);
    }

}
