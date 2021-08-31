package com.bh.b1.bankbook;

import java.util.ArrayList;

public class BankbookService {
	private BankBookDAO bankbookDAO;
	
	public BankbookService () {
		bankbookDAO = new BankBookDAO();
	}
	
	public ArrayList<BankBookDTO>getList() {
		ArrayList<BankBookDTO> ar = bankbookDAO.getList();
		return ar;
		
	}
}
