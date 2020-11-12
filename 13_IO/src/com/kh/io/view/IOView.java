package com.kh.io.view;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.io.model.service.ByteService;

public class IOView {

	private Scanner sc = new Scanner(System.in);
	private ByteService bService = new ByteService();

	public void displayMain() {
		int sel = 0;
		
		do {
			try {
				System.out.println("===== ����� �޴� =====");
				System.out.println("1. BYTE ��� ���� �ۼ�(���)");
				System.out.println("2. BYTE ��� ���� ����(�Է�)");
				System.out.println("3. ���� ��� ���� �ۼ�(���)");
				System.out.println("4. ���� ��� ���� ����(�Է�)");
				System.out.println("5. ���� ����(�Է� + ���)");
				System.out.println("0. ����");
				System.out.print("�޴� ���� >> ");
				
				sel = sc.nextInt();
				sc.nextLine(); // ���� ���ۿ��� ���ڸ� �Է¹��� �� �ֱ� ������ �̸� ���๮�� ����
				
				switch(sel) {
				case 1 : byteFileSave(); break;
				case 2 : break;
				case 3 : break;
				case 4 : break;
				case 5 : break;
				case 0 : System.out.println("���α׷� ����");break;
				default : System.out.println("�߸� �Է���.");
				}
				
				
			}catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sel = -1; // sel�� 0���� �����ż� ����Ǵ°� ����
				sc.nextLine(); // �Է� ���ۿ� �����ִ� �߸� �Է��� ���ڿ��� ����
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}while(sel != 0);
}

	// ����Ʈ ��� �Է�
	private void byteFileSave() throws FileNotFoundException {
		System.out.println("---����Ʈ ��� ���� �Է�---");
		
		System.out.print("���� ������ ���ϸ� : ");
		String fileName = sc.nextLine();
		
		// �ԷµǴ� ��� ������ ���ļ� ����
		StringBuffer content = new StringBuffer();
		
		// �ԷµǴ� ���� �� ���� �ӽ� ����
		String input = null;
		
		System.out.println("-----���� ���� �Է�(exit �Է� �� �Է� ����)-----");
		
		while(true) {
			input = sc.nextLine();
			
			// �Է¹��� ���ڿ��� "exit"�� ��� �ݺ��� ����
			if(input.equals("exit")) break;
			
			// StringBuffer�� �Է¹��� ���� + ���๮�ڸ� �߰�
			content.append(input + "\n");
		}
		
		//System.out.println("--------------------------------------");
		//System.out.println(content.toString());
		
		// �Է¹��� ���ϸ�� ������ ByteService�� �ִ� 
		// byteFileSave() �޼ҵ忡 �����Ͽ� ����� ��ȯ �ޱ�
		int result = bService.byteFileSave(fileName, content.toString());
		
		if(result == 1) {
			System.out.println(fileName + ".txt ���� ���� ����");
		}else {
			System.out.println(fileName + ".txt ���� ���� ����");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
