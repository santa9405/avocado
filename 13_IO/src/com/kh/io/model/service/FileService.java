package com.kh.io.model.service;

import java.io.File;
import java.io.IOException;

public class FileService {

	// File Ŭ����
	// - ���� �ý����� ������ ǥ���ϴ� Ŭ����

	// File Ŭ���� ���� ����
	// - File Ŭ������ ��ü�� �����Ѵٰ� �ؼ� ��¥ ������ ��������°� �ƴ�!

	public void example1() {
		try {
			// 1. ���� ����
			File f1 = new File("test1234.txt"); // ��� ���
			// -> ���� �̸��� �����ִ� ���
			// ���� ������Ʈ �ֻ���� �ǹ���.

			// test123.txt ������ �ִٸ�?
			// -> f1 ������ ���ؼ� ���� test123.txt ���Ͽ� ������ �� �ְԵ�

			// test123.txt ������ ���ٸ�?
			// ���� ������Ʈ �ֻ�ܿ� test123.txt ������ ����� �� �غ� �� �� �ְԵ�
			f1.createNewFile();
			// -> createNewFile() == ���ο� ������ ����� ��
			// --> �ڹ� ���α׷� -> ���� ��ǻ�� ����ҷ� ������ ���
			// --> �Է� �Ǵ� ��°� ���õ� �޼ҵ�� IOException�� �߻���ų ���ɼ��� ����
			// --> IOException�� ����ó���� �ݵ�� ������ϴ� CheckedException
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void example2() {
		// 2. ���ϴ� ��ġ�� ���� ����
		// ���� ��θ� �̿��Ͽ� C����̺꿡 �ִ� dev������ ���� �����ϱ�
		// ���� ��� : �ֻ��� ����̺� �Ǵ� ������ ������ ��θ� ��� �ۼ�
		try {
			File f2 = new File("C:\\dev/test.txt");

			if (f2.createNewFile()) {
				System.out.println("���� ���� ����");
			} else {
				System.out.println("���� ���� ����");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void example3() {
		// 2. ���ϴ� ��ġ�� ���� ����
		// ���� ������Ʈ�� src ���� �ؿ� test.txt ���� �����ϱ�
		// ��� ��� : ���� ������ ��ġ�� �������� �Ͽ� ��θ� �ۼ�
		// -> �ڹ� ������Ʈ���� ��� ��� : ���� ������Ʈ�� �������� �Ͽ� ��� �ۼ�

		try {
			// \, // �� �� ���������� �ǹ���!
			// ../ �� ���������� �ǹ���!
			// File f2 = new File("C:\\workspace\\1_Java\\13_IO\\src\\test.txt"); // ���� ���
			// File f2 = new File("src/test2.txt"); // ��� ���
			File f2 = new File("../test.txt");

			if (f2.createNewFile()) {
				System.out.println("���� ���� ����");
			} else {
				System.out.println("���� ���� ����");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void example4() {
		// �������� �ʴ� ������ ���� �����ϱ�

		// ���� ������Ʈ ���� ��ܿ� temp ������ ����
		// �� �ȿ� test.txt ���� �����

		try {

			// 1. temp ������ �ִ��� Ȯ��
			File folder = new File("temp");

			// exists() : �ش� ��ο� ������ ������ �����ϸ� true
			if (!folder.exists()) { // temp ������ �������� �ʴ� ���

				// temp ���� ����
				if (folder.mkdir()) { // ���� ����
					System.out.println(folder.getName() + " ������ �����Ǿ����ϴ�.");
				}
			}

			File f = new File("temp/test.txt");
			if(f.createNewFile()) {
				System.out.println(f.getName() + " ������ �����Ǿ����ϴ�.");
			}
			
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("���� ���(���� ���) : " + f.getAbsolutePath());
			System.out.println("���� ���(��� ���) : " + f.getPath());
			System.out.println("���� ���� : " + f.getParent());
			System.out.println("���� �뷮 : " + f.length());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
