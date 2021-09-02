package com.bh.b1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankbookService;
	
	@RequestMapping("bankbookSelect")
	public void select(BankBookDTO bankBookDTO, Model model, ModelAndView mv) {
		
		bankBookDTO = bankbookService.getSelect(bankBookDTO);
		model.addAttribute("dtov", bankBookDTO);
		/*
		 * mv.setViewName("bankbook/bankbookSelect");
		 * 
		 * return mv;
		 */
	}
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv) {
		
		List<BankBookDTO> ar = bankbookService.getList();
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		
		return mv;
		
	}
	
	@RequestMapping(value="bankbookInsert", method=RequestMethod.GET)
	public void insert() {
		
	}
	
	@RequestMapping(value="bankbookInsert", method=RequestMethod.POST)
	public String insert(BankBookDTO bankBookDTO) {
		int reult = bankbookService.setInsert(bankBookDTO);
		
		return "redirect:./bankbookList";
	}
	
	@RequestMapping("bankbookDelete")
	public String delete(Long bookNumber) {
		int result = bankbookService.setDelete(bookNumber);
		
		return "redirect:./bankbookList";
	}
}
