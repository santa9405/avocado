package com.kh.operator.service;

public class A_SingleOperater {

	public void logicalNegationOp() {
		// �� ���� ������ : !
		// ����(true / false)�� �ݴ�� �ٲ��ִ� ������

		boolean isTrue = true;

		System.out.println("isTrue : " + isTrue); // true
		System.out.println("!isTrue : " + !isTrue); // false
	}

	public void increaseOp() {
		// ���� ������ : ++
		// �ǿ����ڸ� 1�� ���� ��Ű�� ������
		// -> �ǿ����� : ������ ���ϴ� �� �Ǵ� ����

		// ++(�ǿ�����) : ���� ���� ������
		// 1) ���� �ǿ����ڸ� ���� ��Ų ��
		// 2) ���� ������ ����

		// (�ǿ�����)++ : ���� ���� ������
		// 1) �ٸ� ������ ���� ��
		// 2) �ǿ����ڸ� ������Ŵ

		int num1 = 10;

		// ���� ���� ������ �׽�Ʈ
		System.out.println("----- ���� ���� ������ -----");
		System.out.println("�ʱⰪ : " + num1); // 10
		System.out.println("++num1 1ȸ ���� : " + ++num1); // 11
		System.out.println("++num1 2ȸ ���� : " + ++num1); // 12
		System.out.println("++num1 3ȸ ���� : " + ++num1); // 13
		System.out.println("++num1 4ȸ ���� : " + ++num1); // 14
		System.out.println("++num1 5ȸ ���� : " + ++num1); // 15
		System.out.println("������ : " + num1);

		int num2 = 10;

		// ���� ���� ������ �׽�Ʈ
		System.out.println("----- ���� ���� ������ -----");
		System.out.println("�ʱⰪ : " + num2); // 10
		System.out.println("num1++ 1ȸ ���� : " + num2++); // 10
		System.out.println("num1++ 2ȸ ���� : " + num2++); // 11
		System.out.println("num1++ 3ȸ ���� : " + num2++); // 12
		System.out.println("num1++ 4ȸ ���� : " + num2++); // 13
		System.out.println("num1++ 5ȸ ���� : " + num2++); // 14
		System.out.println("������ : " + num2); // 15
	}
		public void practice1() {
			int num = 20;
			
			int result = num++ * 3 + ++num;
					// num++ * 3
					//    20 * 3 == 60, num = 21
					//    60 + ++num
					//    60 + 22 == 82
			
			System.out.println("result : " + result); // 82
			System.out.println("num : " + num); // 22
			
		}
	
		public void practice2() {
			// ���� : ���������� a, b, c ������ ����� ����
			// 		result1, result2, result3 �� ����� �� �����ϱ�
			
			int a = 10;
			int b = 20;
			int c = 30;
			
			int result1 = a++; // 10
			//			11�� ����
			
			int result2 = ++a + b++; // 12 + 20 = 32
			//            1+11   21�� ����
			
			int result3 = a++ + --b + --c; // 12 + 20 + 29 = 61
			//			13�� ���� + 20 + 29
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			
		}
		
		
		
		
		
		
		
		
}
