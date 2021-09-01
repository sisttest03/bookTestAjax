package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/main.do")
	public void main() {
	}
}
// jsp를 만들어 Ajax통신을 통해 모든 도서목록을 출력 해 봅니다.
// 완성하면 "1"