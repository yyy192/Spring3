package com.bh.b1.bankbook;

public class BankBookDTO {
	
	//멤버변수 Table 컬럼과 같은 이름, 같은 데이터타입
	//접근지정자는 private
	
	//생성자는 기본생성자
	
	private long bookNumber;
	private String bookName;
	private double bookRate;
	private int bookUse;
	
	
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookRate() {
		return bookRate;
	}
	public void setBookRate(double bookRate) {
		this.bookRate = bookRate;
	}
	public int getBookUse() {
		return bookUse;
	}
	public void setBookUse(int bookUse) {
		this.bookUse = bookUse;
	}

}
