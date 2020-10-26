package com.kh.practice.model.service;

import java.util.jar.Attributes.Name;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.kh.practice.model.vo.Student;

public class StudentManagementServiceImpl implements StudentManagementService {
	private Student[] students = { new Student("������", 30, 'F'), new Student("������", 27, 'M'),
			new Student("������", 27, 'F'), new Student("����", 26, 'M'), new Student("�踸��", 29, 'M'),
			new Student("�輺��", 28, 'F'), new Student("�迵��", 28, 'M'), new Student("������", 26, 'M'),
			new Student("����ȭ", 25, 'F'), new Student("������", 26, 'F'), new Student("���¿�", 28, 'M'),
			new Student("������", 27, 'F'), new Student("�ΰ��", 26, 'M'), new Student("�ڿ���", 28, 'F'),
			new Student("����ȣ", 24, 'M'), new Student("������", 28, 'F'), new Student("����", 32, 'M'),
			new Student("������", 26, 'F'), new Student("������", 27, 'M'), new Student("������", 27, 'M'),
			new Student("�̼���", 31, 'F'), new Student("������", 25, 'F'), new Student("����ȣ", 29, 'M'),
			new Student("������", 22, 'F'), new Student("���Ѽ�", 27, 'F'), new Student("�ӼҸ�", 25, 'F'),
			new Student("������", 25, 'F'), new Student("������", 26, 'F'), new Student("�ּ���", 25, 'M') };

	// ���� students �迭�� ������ ���� ����� �ε������� �����ϴ� ����
	private int currentIndex = students.length - 1;

	// ��ü �л� ������ ����ִ� �迭�� ��ȯ�ϴ� service
	@Override
	public Student[] selectAll() {

		return students; // �迭�� �ּ� ��ȯ
	}

	// students ��ü �迭���� �̸��� ��ġ�ϴ� �л� ��ü ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ (���������� ���ٰ� ����)
	@Override
	public Student selectName(String name) {
		Student std = null; // ����� �����ϱ� ���� �������� ����

		// for(int i=0; i<students.length; i++) {
		for (int i = 0; i <= currentIndex; i++) {
			if (students[i].getName().contentEquals(name)) {
				std = students[i];
				break; // ���������� ���ٰ� �����Ǿ� �����Ƿ� �߰� �˻��� �ʿ� ����
			}
		}

		/*
		 * for (int i = 0; i < students.length; i++) { if
		 * (students[i].getName().equals(name)) { return students[i]; } }
		 */
		return std;
	}

	// students ��ü �迭���� ���޹��� gender�� ������ ��ġ�ϴ� �л��� Student �迭�� ��ȯ�ϴ� service
	@Override
	public Student[] selectGender(char gender) {

		// �˻� ����� ������ �迭 ����
		// 1) students �迭 ũ��� ������ ���ο� �迭 ���� -> �ӵ��� ������ �޸� ȿ���� ������
		// 2) �Է¹��� gender�� ��ġ�ϴ� ����� ������ŭ�� ũ�⸦ ���� ���ο� �迭 ���� -> �ӵ��� ������ �޸� ȿ���� ����� / �ǹ�����
		// ���� ����

		// ������ ��ġ�ϴ� ����� ������ count
		int count = 0;
		for (int i = 0; i <= currentIndex; i++) { // ���� �Էµ� �κб��� �˻�
			if (students[i].getGender() == gender) {
				count++;
			}
		}

		Student[] newArr = new Student[count]; // ������ ��ġ�ϴ� ��ŭ �迭 ũ�� ����

		int index = 0; // ���ο� �迭�� �����Ͱ� ���ߵ� �κ��� ����Ű�� �뵵
		// ���� �����Ͱ� �ִ� �ε��� + 1
		for (int i = 0; i <= currentIndex; i++) { // ���� �Էµ� �κб��� �˻�
			if (students[i].getGender() == gender) {
				newArr[index++] = students[i];
			}
		}

		/*
		 * Student[] newObjectArr = new Student[students.length];
		 * 
		 * int currentIndex = 0; for (int i = 0; i < students.length; i++) { if
		 * (students[i].getGender() == gender) { newObjectArr[currentIndex] =
		 * students[i]; currentIndex++; } }
		 */

		return newArr;

	}

	// students ��ü �迭���� ���޹��� age�� ���̰� ��ġ�ϴ� �л��� Student �迭�� ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ
	@Override
	public Student[] selectAge(int age) {

		// ���̰� ��ġ�ϴ� ����� ������ count
		int count = 0;
		for (int i = 0; i <= currentIndex; i++) { // ���� �Էµ� �κб��� �˻�
			if (students[i].getAge() == age) {
				count++;
			}
		}

		Student[] newArr = new Student[count]; // 0ĭ¥�� �迭�� ����, ���̰� ��ġ�ϴ� ��ŭ �迭 ũ�� ����

		int index = 0; // ���ο� �迭�� �����Ͱ� ���ߵ� �κ��� ����Ű�� �뵵
		// ���� �����Ͱ� �ִ� �ε��� + 1
		for (int i = 0; i <= currentIndex; i++) { // ���� �Էµ� �κб��� �˻�
			if (students[i].getAge() == age) {
				newArr[index++] = students[i];
			}
		}

		return newArr;

		/*
		 * Student[] newObjectArr = new Student[students.length];
		 * 
		 * int currentIndex = 0; for (int i = 0; i < students.length; i++) { if
		 * (students[i].getAge() == age) { newObjectArr[currentIndex] = students[i];
		 * currentIndex++; } }
		 * 
		 * return newObjectArr;
		 */
	}

	// ���޹��� Student ��ü�� Student[] �迭�� students�� �߰�
	// ���� students �迭�� ũ�Ⱑ ������ ��� 2��� ������Ų �� �߰�.
	@Override
	public void insertStudent(Student std) {

		// �迭 ũ�� �˻�
		if (students.length - 1 == currentIndex) {
			// students�� ������ �ε��� == ������ ������ �ε��� ��ġ
			// == �迭�� �� �� --> 2�� ū ���ο� �迭 ���� �� �������� + ��������

			Student[] newArr = new Student[students.length * 2];

			// ���� �迭 ������ -> �ű� �迭�� ��������
			System.arraycopy(students, 0, newArr, 0, students.length);

			// ��������(�ű� �迭 �ּҸ� students�� ����)
			students = newArr;
		}

		students[++currentIndex] = std;

		// students�� ������ �ε���

		// private int currentIndex = students.length - 1;
		/*
		 * if (currentIndex == students.length - 1) { Student[] newArr = new
		 * Student[students.length * 2];
		 * 
		 * System.arraycopy(students, 0, newArr, 0, students.length);
		 * 
		 * students = newArr;
		 * 
		 * }
		 * 
		 * currentIndex++; students[currentIndex] = std; // ���� ����ִ� ������ �ε����� ���� �־�
		 */

	}

	// students �迭 ��� �� name �Ӽ� ���� ���޹��� name�� ��ġ �迭 ��Ҹ� ã��
	// �ش� ��Ұ� �����ϴ� Student ��ü�� ���޹��� std�� ���� ����
	@Override
	public void updateStudent(String name, Student std) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(name)) {
				students[i] = std; // ��������
			}
		}
	}

	// ���޹��� name�� ��ġ�ϴ� �̸��� ���� �л� ������ students �迭���� ���� ��
	// �迭 �߰��� ������� �ʵ��� ������ ������ ������ ��ܿ���.
	// �̸��� ��ġ�ϴ� �л��� ���� ��� ������ �л� ����(Student), ���� ��� null�� ��ȯ
	@Override
	public Student deleteStudent(String name) {
		Student std = null; // ������ �л� ������ �����ϴ� ����

		// �̸� �˻�
		for (int i = 0; i <= currentIndex; i++) {
			if (students[i].getName().equals(name)) {

				std = students[i];

				// ���ŵ� ����� ���� ��Ҹ� ���� �ε����� �����Ͽ� �����
				for (int j = i; j < currentIndex; j++) {
					students[j] = students[j + 1];
				}

				// ������ �����Ͱ� �ִ� ��Ҹ� null�� �ٲ���
				students[currentIndex--] = null;
				break;

			}
		}

		return std;
		/*
		 * Student newObject = null; for (int i = 0; i < students.length; i++) { if
		 * (students[i] != null) {
		 * 
		 * if (students[i].getName().equals(name)) { newObject = students[i]; for (int j
		 * = i; j < students.length - 1; j++) { students[j] = students[j + 1];
		 * students[currentIndex] = null; } }
		 * 
		 * } }
		 * 
		 * return newObject;
		 */

	}
}
