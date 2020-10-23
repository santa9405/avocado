package com.kh.objectarray.model.vo;

public class Book {
	// �ʵ�(�������, Ŭ��������)
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	// ������
	// �⺻ ������
	public Book() { }
	
	// �Ű����� �ִ� ������ == ��ü�� ���� ������ �ʱⰪ�� �ش�
	public Book(String title, String author, String publisher, int price) { // ��������� �ʱ�ȭ�� �� ����
		this(title, author);
		this.publisher = publisher;
		this.price = price;
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		
		
	}
	
	// �޼ҵ�
	// getter/setter
	// title getter
	public String getTitle() {
		return title;
	}
	
	// title setter
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// ��ü �ʵ� ���� ��ȯ�� �޼ҵ�
	public String information() {
		return title + " / " + author + " / " +
				publisher + " / " + price + "��";
			// �ڹ������� / ���� �� / ���� ���� / 30000��
		
	}
	
}
