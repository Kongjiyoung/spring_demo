package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/main") //리다이렉션을 해줘야함
    public String main() {//받는 데이터가 없어서 파싱할 필요없음
        return "main";
    }
}
