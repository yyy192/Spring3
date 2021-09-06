package com.bh.b1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bh.b1.util.Pager;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.bh.b1.bankbook.BankBookDAO.";
	
	//setUpdate
	public int setUpdate(BankBookDTO bankBookDTO) {
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
	
	//setDelete
	public int setDelete(Long bookNumber) {
		/* System.out.println(bookNumber); */
		return sqlSession.delete(NAMESPACE+"setDelete", bookNumber);
	}
	
	
	//setInsert
	public int setInsert(BankBookDTO bankBookDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", bankBookDTO);
	}
	
	//getList
	public List<BankBookDTO> getList(Pager pager) {
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	//getSelect
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {
		return sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
		
	}
	
	public Long getCount() {
		return sqlSession.selectOne(NAMESPACE+"getCount");
	}

}
