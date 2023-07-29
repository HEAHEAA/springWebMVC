package com.example.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "김지희");
        return "hello";
    }

    //get URL param 제작
    @GetMapping("hello-mvc")
    public String helloMv(@RequestParam("name") String name,Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    // url param 문자를 그대로 내린다.
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello" + name;
    }

    //json api 방식
    //tip!: xml 방식은 좀 무겁다.
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello{
        private String name;

        //게터세터 (프로퍼티 방식) 이라고도 한다.
        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }






}
