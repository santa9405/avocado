package com.kh.oop.ch2_encapsulation.model.vo;

public class Account {
	
	// VO(Value Object) : ���� ����ϴ� ��ü
	
	// �Ӽ� ����
	// �̸�, ���¹�ȣ, ��й�ȣ, �����ڵ�, �ܾ�
	
	// ĸ��ȭ : �Ӽ��� ����� ����, (class�� {}�� �Ӽ�, ����� ������)
	//		    �ܺη� ��ó ��������� ���� �����ϴ� ���� ����
	// 		   -> �ΰ� ȿ���� ���� ������ ��Ÿ��
	
	
	// �Ӽ� ����
	// ��� ����
	// public : ������ ��𼭵� ���� ����
	// private : ���� Ŭ����(��ü) �������� ���� ����
	private String name = "������"; // �̸�, ��ü ��𼭵� ������ ������
	private String accountNumber = "123-45-6789"; // ���¹�ȣ
	private int password = 1234;
	private final String BANK_CODE = "002";
	private int balance = 100000;
	
	/* public static final double PI = 3.14; // static == ����
	       ������ ���������� ����� �� �ְ� ����� ������ �ʴ� �� */
	
	
	// ��� ����
	// private���� �ܺ� ���� ������ ���ѵ� ��� ������
	// ���� ������ �����ϵ��� �ϴ� �޼ҵ�(���) ����
	// == setter/getter
	
	// setter �ۼ� ��Ģ
	// public void set���������(��������ڷ��� ���������){
	//		this.������� = �Ű�����;
	// }
	
	
	// name�� setter
	public void setName(String name) { // �ܺ� ������ ���� �ϵ��� public ���
				// setter == �Ű�����, ��������, �Ķ���� == �ܺη� ���� ���� ���� ���� ���η� ���� == �ܺη� ���� ���� ���� ���� ���ִ� �Ű�ü
		this.name = name; // ���� ��ü�� ������ �ִ� name = �Ű����� name;
		// this : ���� ��ü
	}
	
	// accountNumber�� setter
	public void setAccountNumber(String accountNumber) { 
		this.accountNumber = accountNumber; 
		// �ܺη� ���� ���޹��� ���¹�ȣ��
		// ���� ��ü�� ���¹�ȣ�� �����ض�
	}
	
	public void setPassword(int password) {
		this.password = password;
		
	}
	// BANK_CODE�� final(���)�̹Ƿ� ���� ������ �� ����
	/* public void setBankCode(String bankcode) {
		this.bankCode = bankcode;
	}*/
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// getter �ۼ� ��Ģ
	// public ��������ڷ��� get���������() {
	// 	  return ��������� : 
	// }
	
	// name�� getter
	public String getName() {
			// ��ȯ�� : �޼ҵ尡 ȣ��� �� ȣ��� ������ ���ư� �� ������ �������� �ڷ���
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getPassword() {
		return password;
	}
	
	public String getBankCode() {
		return BANK_CODE;
	}
	
	public int getBalance() {
		return balance;
	}
}
