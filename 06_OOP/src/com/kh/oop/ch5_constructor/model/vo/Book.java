package com.kh.oop.ch5_constructor.model.vo;

public class Book {
	// �Ӽ� (�ʵ�)
	private String title; // å ����
	private String author; // ����
	private String content; // ����
	private String publisher; // ���ǻ�
	private int price; // ����
	
	// ���(�޼ҵ�)
	
	// ������
	// �⺻ ������ : �Ű������� ���� ������
	public Book() {
		// Ŭ���� ���� �ٸ� �����ڰ� �ϳ��� �ۼ����� ���� ���
		// ������ �� �ڵ����� �⺻ �����ڰ� �߰���
		System.out.println("Book() �⺻ �����ڷ� ������.");
	}
	
	// �Ű� ������ �ִ� ������
	// ��ü ���� �� ���޹��� ���� ��ü �ʵ� �ʱ�ȭ ������ ���
	// �ڵ� �������� �ʰ�, ������ �ʿ信 ���ؼ� �ۼ��Ǵ� ������
	public Book(String title, String author, String content, 
			String publisher, int price) { // �ټ����� ���� ���� �޾ƶ�
		
		// this() ������
		// ���� Ŭ���� ������ �ٸ� �����ڸ� �θ� �� ���
		// - ���� : �ڵ� ���� ����, ������ ���뼺 ����
		this(title, author, price);
		this.content = content;
		this.publisher = publisher;

	}
	
	// �����ε� : �� Ŭ���� ���� ������ �޼ҵ� �̸����� ���� �� �ۼ��ϴ� ���
	// ���� 1) �޼ҵ�� ����
	// ���� 2) �Ű������� ����, Ÿ��, ������ �޶�� ��
	
	public Book(String title, String author, int price) {
		// �Ű����� 3��, String, String, int ����
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		// �Ű������� ���� ����( 3 -> 2 )
	}
	
	public Book(String title, String author, String content) {
		// ������ �Ű� ���� Ÿ�� ����(int -> String)
	}
	
	public Book(int price, String title, String author) {
		// �Ű����� ���� ����. (String, String, int -> int, String, String)
	}
	
	/* public Book(String content, String publisher, int price) {
		// �Ű����� ������ ���� -> ���� �߻�!
		// -> �����ε� �� �Ű��������� �߿����� �����Ƿ� Ÿ�Ը� ���� ��!
	} */
	
	
	// getter/setter
	// title setter
	public void setTitle(String title) {
		this.title = title; // �ڹ��� ����
	} // title ��� ������ ���� �ض�
	
	// title getter
	public String getTitle() {
		return title;
	}
	
	// content setter
	public void setContent(String content) {
		this.content = content;
	}
	
	// content getter
	public String getContent() {
		return content;
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






	@Override // �ʵ� ������ �ϳ��� ���ڿ��� ��ȯ
	public String toString() { 
		return "Book [title=" + title + ", author=" + author + ", content=" + content + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}
	
	// getter / setter �ڵ� ����
	// alt + shift + s -> r
	
	// toString() �޼ҵ� �ڵ�
	// alt + shift + s -> s
	
	
	
	
	
	
	
	
}
