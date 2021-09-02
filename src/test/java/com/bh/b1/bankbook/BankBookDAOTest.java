package com.bh.b1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bh.b1.MyJunitTest;

public class BankBookDAOTest extends MyJunitTest {

	@Autowired
	private BankBookDAO bankbookDAO;
	
	@Test
	public void setDelete() {
		int result = bankbookDAO.setDelete(5L);
		assertEquals(1, result);
	}
	
	//@Test
	public void setInsertTest() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("주택청약");
		bankBookDTO.setBookRate(4.12);
		bankBookDTO.setBookUse(1);
		
		int result = bankbookDAO.setInsert(bankBookDTO);
		
		assertEquals(1, result);
	}
	
	//@Test
	public void getListTest() {
		List<BankBookDTO> ar = bankbookDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
	//@Test
	public void getSelectTest() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(6);
		
		bankBookDTO = bankbookDAO.getSelect(bankBookDTO);
		//System.out.println(bankBookDTO.getBookName());
		assertNotNull(bankBookDTO);
		
	}
}
