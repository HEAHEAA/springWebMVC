package com.example.hellospring.domain;

public class Member {
    private Long id;
    private String name;

    //게터세터
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }




}
