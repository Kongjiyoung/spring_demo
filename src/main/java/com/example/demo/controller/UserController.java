//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
////@RestController //리턴시에 그 문자를 그대로 응답
//@Controller //리턴시에 파일을 응답, 템블릿엔진을 쓰는 리턴되는 파일명이 되야함을 찾아줌, 파일을 찾아서 응답 어제한 포워드한게 이거
//public class UserController {
//
//    @GetMapping("/joinForm") //
//    public String joinForm() {
//        return "joinForm"; //view리저브클래스가 resources/joinForm.mustache 확장자를 붙여줌..?
//    }
//
////    @PostMapping("/join")
////    public String join(HttpServletRequest request) { //request, response만 전달받을 수 있음
////        String username = request.getParameter("username");
////        String password = request.getParameter("password");
////        String email = request.getParameter("email");
////
////        System.out.println("username : " + username);
////        System.out.println("password : " + password);
////        System.out.println("email : " + email);
////        return "main";
////    }
//
//    @PostMapping("/join")
//    public String join(String username, String password, String email) { //위에보다 편한거
////        String username = request.getParameter("username");
////        String password = request.getParameter("password");
////        String email = request.getParameter("email");
//
//        System.out.println("username : " + username);
//        System.out.println("password : " + password);
//        System.out.println("email : " + email);
//
////        if (username.length() > 10) {
////            return "error";
////        }
//
//        return "main";
//    }
//
//}
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //  리턴시 파일을 응답 (템플렌 엔진 같은 걸 쓰는 리턴 파일을 찾아줌 )
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        System.out.println("username:" + username);
        System.out.println("password:" + password);
        System.out.println("email:" + email);


        if (username.length() > 10) { //유효성 검사
            return "error-404";

        }

        //유효검사 후에 DB와 연결, 전에 하면 연관없는 db에서 에러가 뜰 수있다 - 유효성 검사 위배,레이어의 책임을 분명하게 하기

        return "redirect:/main"; //만들어놓은 뷰를 리턴하면 위에 코드를 적어줘야해서 만들어놓은 컨트롤러를 리다이렉션해줘야함


    }
}

