package com.boot.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBoardBiz;
import com.boot.jdbc.model.dto.MyBoardDto;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {

	@Autowired
	private MyBoardBiz biz;

	@GetMapping("/list")
	public String selectList(Model model) {

		model.addAttribute("list", biz.selectList());

		return "myboardlist";
	}

	@GetMapping("/writepage")
	public String writePage() {

		return "myboardwrite";
	}

	@PostMapping("/write")
	public String write(MyBoardDto dto) {

		int res = biz.insert(dto);
		if (res > 0) {
			return "redirect:/myboard/list";
		} else {
			return "redirect:/myboard/writepage";
		}

	}

	@GetMapping("/detail")
	public String detail(int myno, Model model) {

		model.addAttribute("dto", biz.seletOne(myno));

		return "myboarddetail";
	}

	@GetMapping("/updatepage")
	public String updatePage(int myno, Model model) {

		model.addAttribute("dto", biz.seletOne(myno));

		return "myboardupdate";
	}
	
	@PostMapping("/update")
	public String update(MyBoardDto dto) {
		
		int res = biz.update(dto);
		if (res > 0) {
			return "redirect:/myboard/list";
		} else {
			return "redirect:/myboard/updatepage";
		}
	}
	
	@GetMapping("/delete")
	public String delete(int myno) {
		
		int res = biz.delete(myno);
		if (res > 0) {
			return "redirect:/myboard/list";
		} else {
			return "redirect:/myboard/detail";
		}
	}
}
