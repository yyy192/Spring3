package com.bh.b1.bankbook;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bh.b1.MyJunitTest;
import com.bh.b1.util.Pager;

public class BankBookDAOTest extends MyJunitTest {

	@Autowired
	private BankBookDAO bankbookDAO;
	
	//@Test
	public void setUpdateTest() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(1);
		bankBookDTO.setBookName("g");
		bankBookDTO.setBookRate(3.33);
		bankBookDTO.setBookUse(0);
		
		int result = bankbookDAO.setUpdate(bankBookDTO);
		
		assertNotEquals(0, result);
	}
	
	//@Test
	public void setDeleteTest() {
		int result = bankbookDAO.setDelete(5L);
		assertEquals(1, result);
	}
	
	@Test
	public void setInsertTest() throws Exception {
		
		Random random = new Random();
		for(int i=0;i<200;i++) {
			
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("BookName"+i);
			
			int rate = random.nextInt(400);
			
			bankBookDTO.setBookRate(rate/100.0);
			bankBookDTO.setBookUse(random.nextInt(2));
			
			int result = bankbookDAO.setInsert(bankBookDTO);
			
			if(i%10==0) {
				Thread.sleep(500);
			}
			
		}
		
		System.out.println("======== FINISH ========");
	}
	
	//@Test
	public void getListTest(Pager pager) {
		List<BankBookDTO> ar = bankbookDAO.getList(pager);
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
