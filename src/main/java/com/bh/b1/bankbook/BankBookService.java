package com.bh.b1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public BankBookDTO getSelect(BankBookDTO bankbookDTO) {
		return bankBookDAO.getSelect(bankbookDTO);
	}
	
	public List<BankBookDTO> getList() {
		
		return bankBookDAO.getList();
	}
	
	public int setInsert(BankBookDTO bankBookDTO) {
		
		return bankBookDAO.setInsert(bankBookDTO);
	}
	
	public int setDelete(Long bookNumber) {
		return bankBookDAO.setDelete(bookNumber);
	}

}
