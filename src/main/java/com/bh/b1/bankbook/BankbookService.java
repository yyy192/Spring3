package com.bh.b1.bankbook;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bh.b1.util.DBConnector;

@Service
public class BankbookService {
	private BankBookDAO bankbookDAO;
	
	@Autowired
	public void setBankbookDAO(BankBookDAO bankbookDAO) {
		this.bankbookDAO = bankbookDAO;
	}


	public ArrayList<BankBookDTO>getList() {
		ArrayList<BankBookDTO> ar = bankbookDAO.getList();
		return ar;
		
	}
}
