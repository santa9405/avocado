package com.kh.objectarray.model.service;

import com.kh.objectarray.model.vo.Book;

public class ObjectArrayService {
	
	// Service Ŭ���� �� ��𼭵� ��� ������ 
	// Book ��ü �迭 ���� �� �Ҵ�, �ʱ�ȭ
	private Book[] books = { new Book("�ڹ�������", "���� ��", "��������", 30000),
							 new Book("�����", "�����㺣��", "���л�", 8000),
							 new Book("�ڹ� ����?", "�鵿��", "KH����", 100000),
							 new Book("����", "�������� ��������", "��������", 12000),
							 new Book("���� �������", "����� ���� ������", "�����", 63000)
							}; // ����� �ʱ�ȭ
	
	// ��ü ���� �� �ʱ�ȭ ����
	// JBM �⺻�� -> ����� �ʱ�ȭ -> �ʱ�ȭ �� -> ������
	
	// �⺻ ������
	public ObjectArrayService() {  }
	// �����ڿ��� �ʵ� �ʱ�ȭ�� �������� ������
	// ����� �ʱ�ȭ ������ ������
	
	// ����� å ������ ��� ��ȸ�� String ���·� ��ȯ�ϴ� �޼ҵ�
	public String selectAll() {
		String str = ""; // �� ���ڿ�
		
		for(int i=0; i<books.length; i++) { // 0 ~ 4 ����
			str += books[i].information() + "\n"; // ����ִ� ���ڿ��� å������ ���ٷ� ���� �ϰ� str�� ���ư���
		}
		
		return str;
	}

	//��ü �迭�� �Է¹��� ������ å�� �ִ��� �˻��Ͽ� å ���� ��ȯ
	public String searchTitle(String title) {
								// �Է��� å ������ ���޹��� �Ű�����
		String str = null;
		
		for(int i=0; i<books.length; i++) {
			if( books[i].getTitle().equals(title) ) {
				// books �迭 ��� �� ������ title�� ��ġ�ϴ� ��Ұ� �ִٸ�
				// �ش� ����� ����(information())�� str�� ����
				str = books[i].information();
			}
		}

		return str;
	}
			
}
