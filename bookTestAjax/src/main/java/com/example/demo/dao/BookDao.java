package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BookVO;

@Repository
public class BookDao {
	public List<BookVO> findAll(){
		return DBManager.listBook();
	}

	public int insert(BookVO b) {
		// TODO Auto-generated method stub
		return DBManager.insertBook(b);
	}
}
