package com.example.springwebstudy.controller;

import com.example.springwebstudy.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostAPIController {
    //1. http 통신할 때 마다 post는 body 에다가 data를 넣어서 받아온다.
    //2. @RequestBody에 SearchVo에 있는 값을 매칭 시켜서 보내주자

    @RequestMapping(method = RequestMethod.POST, path = "/post")
    public SearchVO postRequest(@RequestBody SearchVO searchVO){
        return searchVO;
    }

    @PostMapping(value = "postValue")
    public SearchVO postMapping(@RequestBody SearchVO searchVO){
        return searchVO;
    }

}
