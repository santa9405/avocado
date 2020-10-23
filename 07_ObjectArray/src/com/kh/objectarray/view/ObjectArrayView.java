package com.kh.objectarray.view;

import java.util.Scanner;

import com.kh.objectarray.model.service.ObjectArrayService;

public class ObjectArrayView {
	
	// MVC Model2 ������ ����
	// Model : ������, ���� ó�� (����Ͻ� ���� ó�� ���)
	// View : Ŭ���̾�Ʈ�� ��û(�Է�), ����(���) ���
	// Controller : ��û�� ������ ���� Service�� �����ϰ�
	//				����� �˸��� view�� ���� ���
	
	// Ŭ���� ���ο��� ��ĳ�ʸ� ��� ����� �� �ְ� ��� ������ ����
	private Scanner sc = new Scanner(System.in);
	
	// Ŭ���� ���ο��� ObjectArrayService ��ü�� ��� ����� �� �ְ� ��� ������ ����
	private ObjectArrayService service = new ObjectArrayService();
	
	// ���� �޴�
	public void displayView() {
		int sel = 0; // �޴� ��ȣ�� �Է¹��� �ӽ� ����
		do {
			System.out.println("========== �޴� ==========");
			System.out.println("1. ��ü å ���� ��ȸ");
			System.out.println("2. å ���� �˻�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			sc.nextLine(); // ���ۿ� �����ִ� ���๮�� ����
			
			switch (sel) {
			case 1 : System.out.println(service.selectAll()); break;
			case 2 : System.out.println( searchTitle() ); break;
			case 0 : System.out.println("���α׷� ����"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			}
			
			System.out.println(); // �ٹٲ�
			
		}while(sel != 0);
		
	}
	
	// ���� �˻��� View
	public String searchTitle() {
		
		System.out.print("�˻��� å ���� �Է� : ");
		String title = sc.nextLine();
		
		System.out.println("----- �˻� ��� -----");
		
		String str = service.searchTitle(title); // ��� ��ȯ�� ����
		
		if(str == null) {
			str = "�ش� ������ å�� �������� �ʽ��ϴ�.";
		}

		return str;
	}

}
