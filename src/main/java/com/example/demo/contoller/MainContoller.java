package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BoardDTO;

@RestController
public class MainContoller {

	@Autowired
	BoardDTO dto;
	
	@RequestMapping(value="/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/text1")
	public BoardDTO test1() {
		
		dto.setTitle("테스트1");
		dto.setContent("테스트입니다");
		return dto;
	}
}
