package com.example.springwebstudy.controller;

import com.example.springwebstudy.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetAPIController {

    //1. GET 형태로 GET url 불러오기
    @RequestMapping(method = RequestMethod.GET, path = "/get")
    public String getRequest() {
        return "this is getRequest";
    }

    //2. GET으로 url 불러오는 방식. 리턴 값 그대로 html 에 표기된다.
    //String id 는 파라미터 값이 된다.
    @GetMapping("/getParam")
    public String getParameters(@RequestParam String id,String email ){
        return "아이디는" + id + "이메일은" + email;
    }

    //3. vo를 사용해서 객체 불러오기
    @GetMapping("/getVO")
    public String getMultParams(SearchVO searchVO){
        return "VO 사용 아이디는" + searchVO.getId() + "이메일은" + searchVO.getEmail();
    }

    //4. VO 모델을 JSON 형태로 GET 데이터 받아오기
    @GetMapping("getJson")
    public SearchVO getJSONModule (SearchVO searchVO){
        return searchVO;
    }




}
