package com.bh.b1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bh.b1.util.Pager;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankbookService;
	
	@RequestMapping("bankbookSelect")
	public void select(BankBookDTO bankBookDTO, Model model) {
		
		bankBookDTO = bankbookService.getSelect(bankBookDTO);
		model.addAttribute("dtov", bankBookDTO);
		/*
		 * mv.setViewName("bankbook/bankbookSelect");
		 * 
		 * return mv;
		 */
	}
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv, Pager pager) {
		
		List<BankBookDTO> ar = bankbookService.getList(pager);
		
		mv.addObject("pager", pager);
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
	
	@RequestMapping(value = "bankbookUpdate", method = RequestMethod.GET)
	public ModelAndView update(BankBookDTO bankBookDTO, ModelAndView mv) {
		bankBookDTO = bankbookService.getSelect(bankBookDTO);
		///System.out.println(bankBookDTO.getBookName());
		 
		//ModelAndView mv = new ModelAndView();
		mv.setViewName("bankbook/bankbookUpdate");
		mv.addObject("dto", bankBookDTO);
		
		return mv;
	}
	
	@RequestMapping(value = "bankbookUpdate", method=RequestMethod.POST)
	public String update(BankBookDTO bankBookDTO) {
		
		int result = bankbookService.setUpdate(bankBookDTO);
		
		//mv.setViewName("redirect:./bankbookList");
		return "redirect:./bankbookList";
	}
}
