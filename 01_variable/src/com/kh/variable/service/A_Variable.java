package com.kh.variable.service;

public class A_Variable {
	
	// ������ ������� �ʴ� ���
	public void noVariable() {
		System.out.println("----- ���� ���X -----");
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592635389793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
	}
	
	// ������ ����� ���
	public void usingVariable() {
		double pi = 3.141592653589793; // ������
		int radius = 5; // ������
		int height = 20; // ����
		
		System.out.println("----- ���� ���O -----");
		System.out.println(2 * pi * radius); // ���� �ѷ�
		System.out.println(pi * radius * radius); // ���� ����
		System.out.println(pi * radius * radius * height); // ������� ����
		System.out.println(4 * pi * radius * radius); // ���� �ѳ���
		
		/* ���� ��� �� ����
		 * 1. ��(data)�� �ǹ̸� �ο��� �� �ִ�.
		 * 2. �ڵ��� �������� �ǹ��ľ��� ������.
		 * 3. ������ ����Ǿ� �ִ� ���� ���������� ��ȭ��ų �� ����
		 *   -> ���뼺 �� �������� ���
		 */
	}

	// ���� ����
	public void declareVariable() {

		// 1. ����
		boolean isTrue; // 1byte
		isTrue = true; // �� ����
		// isTrue : ������
		// '=' : ���� ������, ������ data�� ���� ������ ����		
		//true : ���ͷ�
		
		
		
		
		
		// 2. ������
		byte bNum; // 1byte
		bNum = 100;
		
		short sNum; // 2byte
		sNum = 10000;
		
		// byte, short�� int�� ���ͷ� ǥ����� �����.
		// ��? byte, short�� �ٸ� ���α׷��� ������ ȣȯ�� ����
		//    �ʿ��� �ڷ���;
		// -> java������ �ڵ� �ۼ� �� ����� ���� ���� �ڷ���
		//	--> ������ ���ͷ� ǥ����� �������� ����(�׳� int�� ���)
		
		
		int iNum; // 4byte, ���� �⺻��
		iNum = 1000000000; // 10��
		iNum = 1_000_000_000; // _�� �̿��Ͽ� �ڸ��� ���� ����
		
		
		
		long lNum; // 8byte
		lNum = 10000000000L; // 100��
		// (���ڵ�)L �Ǵ� 1 : long�� ���ͷ� ǥ���
		
		
		
		
		
		// 3. �Ǽ���
		float fNum; // 4byte
		fNum = 3.141592f;
		// (�Ǽ�)f �Ǵ� F : float ���ͷ� ǥ���
		
		double dNum; // 8byte, �Ǽ� �⺻��
		dNum = 3.141592;
		
		
		// 4. ������
		char ch; // 2byte
		// ������ �����
		ch = 'A'; // 65�� ���� ��
		// ch = 65; // 'A'�� ���� ��
		// ch = '\u0041'; //'A'�� ���� ��(16���� �����ڵ� ǥ���)
		// char ���ͷ� ǥ��� : ''
		
		// 5. ���ڿ�(�⺻ �ڷ����� �ƴ�)
		String str; // 4byte
					// ������ (���� �����͸� �������� �ʰ�,
					//		�����Ͱ� ����� �ּҸ� ������)
					// String�� Ŭ������
		str = "�ȳ��ϼ���?";
		// String(���ڿ�) ���ͷ� ǥ��� : ""
		
		// ���� ����� ���ÿ� �ʱ�ȭ
		String start = "�ȳ��ϼ���?";
		// �ʱ�ȭ : ������ ���� �����Ѵ�
		
		// ���� ����� ���ÿ� �ʱ�ȭ
		int iNum2 = 200;
		// �ʱ�ȭ : ������ ���� �����Ѵ�
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		System.out.println("iNum2 : " + iNum2);
		
		int ����;
		char ��;
		String �̸�; // �ڹٴ� �ѱ۷� �ڵ� ����
		
		
		//��� ���� �� �ʱ�ȭ
		
		System.out.println("----- ��� -----");
		
		int age = 31;
		System.out.println("age : " + age); // age : 31
		
		age = 32;
		System.out.println("age : " + age); // age : 32
		
		// ��� : ������� ��� �빮��. ����� �ܾ�� '_'�� ����
		final int AGE = 31;
		System.out.println("AGE : " + AGE); // AGE : 31
		
		// AGE = 32; // ���� �߻�! ����� �ʱ�ȭ �� �� ������ �Ұ��� ��
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
