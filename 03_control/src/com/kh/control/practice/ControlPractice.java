package com.kh.control.practice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		/*
		 * �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���, ���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		 * ex. 1. �Է� 2. ���� 3. ��ȸ 4. ���� 7. ���� �޴� ��ȣ�� �Է��ϼ��� : 3 ��ȸ �޴��Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �޴� ��ȣ�� �Է��ϼ��� : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���� �޴��Դϴ�.");
			break;
		}

	}

	public void practice2() {
		/*
		 * Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ� ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���. ����� �ƴϸ�
		 * ������� �Է����ּ���.���� ����ϼ���. ex. ���ڸ� �� �� �Է��ϼ��� : -8 ����� �Է����ּ���.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		int input = sc.nextInt();

		String result = null;

		if (input < 0) {
			result = "����� �Է����ּ���.";
		} else if (input > 0 && input % 2 == 0) {
			result = "¦����.";
		} else {
			result = "Ȧ����";
		}
		System.out.println(result);

	}

	public void practice3() {
		/*
		 * ����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ� �հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� �����
		 * �����ϼ���. (�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���) �հ� ���� ��� ���� �� ������ �հ�,
		 * ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ� ���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���. [��� ���ô� ���� �忡]
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� : ");
		int input1 = sc.nextInt();

		System.out.println("�������� : ");
		int input2 = sc.nextInt();

		System.out.println("�������� : ");
		int input3 = sc.nextInt();

		int sum = input1 + input2 + input3;
		double evr = sum / 3;

		String result = null;

		if (input1 < 40 && input2 < 40 && input3 < 40) {
			result = "�������� : " + input1 + "\n�������� : " + input3 + "\n�������� : " + input2 + "\n���հ��Դϴ�.";
		} else if (evr >= 60) {
			result = "���� : " + input1 + "\n���� : " + input3 + "\n���� : " + input2 + "\n�հ� : " + sum + "\n��� : " + evr
					+ "\n�����մϴ�, �հ��Դϴ�!";
		} else {
			result = "���հ��Դϴ�.";
		}

		System.out.println(result);
	}

	public void practice4() {
		/*
		 * 1~12 ������ ���� �Է� �޾� ��, ����, ����, �ܿ� ������ ����ϼ���. �߸� �Է��� ��� ��OO���� �߸� �Էµ� ���Դϴ�.����
		 * ����ϼ���. (switch�� ���) ex 1. 1~12 ������ ���� �Է� : 8 8���� �����Դϴ�. ex 2. 1~12 ������ ���� �Է�
		 * : 99 99���� �߸� �Էµ� ���Դϴ�.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 12 ������ ���� �Է� : ");
		int input = sc.nextInt();

		switch (input) {
		case 12:
			System.out.println(input + "���� �ܿ��Դϴ�.");
			break;
		case 1:
			System.out.println(input + "���� �ܿ��Դϴ�.");
			break;
		case 2:
			System.out.println(input + "���� �ܿ��Դϴ�.");
			break;
		case 3:
			System.out.println(input + "���� ���Դϴ�.");
			break;
		case 4:
			System.out.println(input + "���� ���Դϴ�.");
			break;
		case 5:
			System.out.println(input + "���� ���Դϴ�.");
			break;
		case 6:
			System.out.println(input + "���� �����Դϴ�.");
			break;
		case 7:
			System.out.println(input + "���� �����Դϴ�.");
			break;
		case 8:
			System.out.println(input + "���� �����Դϴ�.");
			break;
		case 9:
			System.out.println(input + "���� �����Դϴ�.");
			break;
		case 10:
			System.out.println(input + "���� �����Դϴ�.");
			break;
		case 11:
			System.out.println(input + "���� �����Դϴ�.");
			break;
		default:
			System.out.println(input + "�� �߸� �Էµ� ���Դϴ�.");
		}

	}

	public void practice5() {
		/*
		 * ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���. �α��� ���� �� ���α��� ������, ���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
		 * ��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���. ex 1. ex 2. ex 3. ���̵� : myId ���̵� : myId
		 * ���̵� : my ��й�ȣ : myPassword12 ��й�ȣ : myPassword ��й�ȣ : myPassword12 �α��� ����
		 * ��й�ȣ�� Ʋ�Ƚ��ϴ�. ���̵� Ʋ�Ƚ��ϴ�.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("���̵� : ");
		String id = sc.nextLine();

		System.out.println("��й�ȣ : ");
		String pw = sc.nextLine();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("�α��� ����");
		} else if (id.equals("myId") || pw == "myPassword12") {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}

	}

	public void practice6() {
		/*
		 * ����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���. ��, �����ڴ� ȸ������, �Խñ� ����,
		 * �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ� ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ� ��ȸ���� �Խñ� ��ȸ��
		 * �����մϴ�. ex. ������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ������ ȸ������, �Խñ� ���� �Խñ� �ۼ�, ��� �ۼ� �Խñ� ��ȸ
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String grade = sc.nextLine();

		/*
		 * switch (grade) { case "������": System.out.print("ȸ������, "); case "ȸ��":
		 * System.out.print("�Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, "); case "��ȸ��":
		 * System.out.print("�Խñ� ��ȸ");
		 */

		String str = ""; // ���ڿ�
		switch (grade) {
		case "������":
			str += "ȸ������, ";
		case "ȸ��":
			str += "�Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, ";
		case "��ȸ��":
			str += "�Խñ� ��ȸ";
		}
		System.out.println(grade);
	}

	public void practice7() {
		/*
		 * Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ���� ��ü��/����ü��/��ü��/���� ����ϼ���. BMI = ������
		 * / (Ű(m) * Ű(m)) BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü�� BMI�� 23�̻� 25�̸��� ���
		 * ��ü�� / 25�̻� 30�̸��� ��� �� BMI�� 30�̻��� ��� �� �� ex. Ű(m)�� �Է��� �ּ��� : 1.65 ������(kg)��
		 * �Է��� �ּ��� : 58.4 BMI ���� : 21.45087235996327 ����ü��
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Ű(m)�� �Է��� �ּ��� : ");
		double hieght = sc.nextDouble();

		System.out.println("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		double bmi = weight / (hieght * hieght);

		System.out.println("BMI ���� : " + bmi);

		String result = null;

		if (bmi < 18.50) {
			result = "��ü��";
		} else if (bmi < 23) {
			result = "����ü��";
		} else if (bmi < 25) {
			result = "��ü��";
		} else if (bmi < 30) {
			result = "��";
		} else {
			result = "�� ��";
		}

		System.out.println(result);

	}

	public void practice8() {
		/*
		 * Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���. (��, �� ���� ���� ��� ����� ���� �۵��ϸ�
		 * ���� ���� ��ȣ�� �Է� ���� �� ���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���) ex. �ǿ�����1 �Է� : 15 �ǿ�����2 �Է� :
		 * 4 �����ڸ� �Է�(+,-,*,/,%) : / 15 / 4 = 3.750000
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();

		System.out.println("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) { // �� �� ����� ���
			System.out.println("�����ڸ� �Է�(+,-,*,/,%) : ");
			char ch1 = sc.nextLine().charAt(0);

			double result = 0;

			switch (ch1) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double) num1 / num2;
				break; // �ڵ� ����ȯ
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
			}
				System.out.println(num1 + " " + ch1 + " " + num2 + " = " + result);

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}

		// sc.nextLine(); // �Է� ���ۿ� �����ִ� ���๮�� ����

		/*
		 * switch (ch1) { case '+': result = num1 + num2; break; case '-': result = num1
		 * - num2; break; case '*': result = num1 * num2; break; case '/': result = num1
		 * / num2; break; case '%': result = num1 % num2; break; default:
		 * System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); }
		 */

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�߰� ��� ���� : ");
		int num1 = sc.nextInt();

		System.out.println("�⸻ ��� ���� : ");
		int num2 = sc.nextInt();

		System.out.println("���� ���� : ");
		int num3 = sc.nextInt();

		System.out.println("�⼮ ȸ�� : ");
		int num4 = sc.nextInt();

		System.out.println("=============== ��� ===============");

		double test1 = num1 * 0.2;
		double test2 = num2 * 0.3;
		double hw = num3 * 0.3;
		double check = num4;
		double sum = test1 + test2 + hw + num4;

		String result = null;

		if (num4 > 14) { // (num4 > 20 * 0.7) �⼮ 70% �ʰ� ��
			if (sum >= 70) {
				result = "PASS";
			} else {
				result = "Fail [���� �̴�]";
			}
		} else {
			System.out.println("Fail [�⼮ Ƚ�� �̴� (" + num4 + " / 20)");
			return;
		}

		/* if (num4 > 20 * 0.7)
		   System.out.println("�߰� ��� ����(20) : " + test1);
		   System.out.println("�⸻ ��� ����(30) : " + test2);
		   System.out.println("���� ����           (30) : " + hw);
		   System.out.println("�⼮ ����           (20) : " + check);
		   
		   System.out.println("���� : " + sum);
		   
		   if(sum >= 70) {
		   		System.out.printlnt("FAIL [���� �̴�] (���� " + sum +")");
		 } else {
		 		System.out.printlnt("FAIL [�⼮ Ƚ�� ����] (" + num4 + " / 20)");
		 } */
		
		System.out.println("�߰� ��� ����(20) : " + test1);
		System.out.println("�⸻ ��� ����(30) : " + test2);
		System.out.println("���� ����           (30) : " + hw);
		System.out.println("�⼮ ����           (20) : " + check);
		System.out.println("���� : " + sum);
		System.out.println(result);
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����� �����ϼ���.\r\n" + "1. �޴� ���\r\n" + "2. ¦��/Ȧ��\r\n" + "3. �հ�/���հ�\r\n" + "4. ����\r\n"
				+ "5. �α���\r\n" + "6. ���� Ȯ��\r\n" + "7. BMI\r\n" + "8. ����\r\n" + "9. P/F\r\n");
		
		/* 		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : "); */
		
		System.out.print("���� : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		}

	}
}
