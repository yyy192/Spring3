package com.bh.b1.bankbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankbookService;
	
	@RequestMapping("bankbookSelect")
	public Model select(BankBookDTO bankBookDTO, Model model, ModelAndView mv) {
		bankBookDTO.setBookNumber(bankBookDTO.getBookNumber());
		bankBookDTO = bankbookService.getSelect(bankBookDTO);
		model.addAttribute("dtov", bankBookDTO);
		mv.setViewName("bankbook/bankbookSelect");
		
		return model;
	}
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv) {
		
		List<BankBookDTO> ar = bankbookService.getList();
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		
		return mv;
		
	}
	
	@RequestMapping("bankbookInsert.do")
	public String insert(BankBookDTO bankBookDTO) {
		
		System.out.println(bankBookDTO.getBookName());
		System.out.println("bankbook Insert");
		return "redirect:../";
	}
}
