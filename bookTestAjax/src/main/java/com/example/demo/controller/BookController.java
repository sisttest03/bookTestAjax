package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDao;
import com.example.demo.vo.BookVO;

@RestController
public class BookController {
	@Autowired
	private BookDao dao;
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listBook.do")
	public List<BookVO> listBook() {
		return dao.findAll();
	}
	
	@RequestMapping("/insertBook.do")
	public String insertBook(BookVO b) {
		int re = dao.insert(b);
		return "ok";
	}
	
	
	@RequestMapping("/hello.do")
	public String hello() {
		return "hello";
	}
}
