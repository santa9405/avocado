package com.kh.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.service.MusicService;
import com.kh.music.model.service.MusicServiceImpl;
import com.kh.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	MusicService service = new MusicServiceImpl(); // ����� ���� �ڷ���

	public void displayMain() {
		int sel = 0;
		do {
			System.out.println();
			System.out.println("--- Melong Player ---");
			System.out.println("1. ���� ��� ��ü ��ȸ");
			System.out.println("2. ���ǿ� �´� ��� ��ȸ");
			System.out.println("3. ���� ���� ����Ʈ �޴�");
			System.out.println("4. ���ƿ� ������");
			System.out.println("0. ���α׷� ����");
			System.out.println("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				selectAll();
				break;
			case 2:
				selectConditionMenu();
				break;
			case 3:
				myMusicListMenu();
				break;
			case 4:
				incFavoriteCount();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;

			}
		} while (sel != 0);

	}

	// 1. ���� ��� ��ü ��ȸ
	public void selectAll() {
		// service.selectAll()�� ȣ���Ͽ� ��ȯ ���� List��
		// printList(list) �޼ҵ��� �Ű������� �����Ͽ� ���
		
		List<Music> list = service.selectAll();
		//					 musicTable�� ��ȯ
		// service�� musicTable�� ��ȯ �޾ƿ� list ������ ����
		
		printList(list);

	}

	// ���޹��� List Ÿ�� ��ü�� ����� ��� Music ������ ����ϴ� �޼ҵ�
	public void printList(List<Music> list) {
		// printList �޼ҵ带 ���� ����
		// view�� �ߺ��Ǵ� �ڵ尡 ���� �߻��� ���� �����Ͽ�
		// �ڵ���� ���ҿ� ���뼺, ���������� ����� ���� �ۼ��� �޼ҵ�
		
		System.out.println();
		System.out.println("�� ��ȣ  /  �� ����  /  ����   / ���ƿ� ��");
		System.out.println("--------------------------------");

		// ����ϴ� for�� �ۼ�!
		for (Music musicList : list) {
			System.out.println(musicList);
			// �������� print ������ �ۼ� �ϸ� �ڵ����� .toString()�� ȣ���Ѵ�.
											   // -> object Ŭ������ �޼ҵ�
			// object Ŭ������ ��� Ŭ������ �ֻ��� �θ�
			// toString() �޼ҵ� ����
			// -> ��ӹ��� �ڽ��� �������̵��Ͽ�
			// 	    ��ü�� ������ �ִ� �ʵ� ������ ��ȯ�ϵ��� ���
		}
	}

	// 2. ���ǿ� �´� ��� ��ȸ
	public void selectConditionMenu() {
		int sel = 0;
		do {
			System.out.println();
			System.out.println("--- ���� �˻� ---");
			System.out.println("1. Ư�� �ܾ ���� ���Ե� �뷡 ��ȸ");
			System.out.println("2. Ư�� �ܾ ������ ���Ե� �뷡 ��ȸ");
			System.out.println("3. ���ƿ� ��ŷ������ ��ȸ");
			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				selectTitle();
				break;
			case 2:
				selectArtist();
				break;
			case 3:
				selectTopFavoriteCount();
				break;
			case 0:
				System.out.println("���� �޴���...");
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;

			}
		} while (sel != 0);
	}

	// 2-1. Ư�� �ܾ ���� ���Ե� �뷡 ��ȸ
	public void selectTitle() {
		System.out.println("-- ���� �˻� --");
		System.out.print("�˻� �� �Է� : ");
		String title = sc.nextLine();

		// �뷡 ������ �Է¹޾� service.selectTitle() �޼ҵ��� �Ű������� �����ϰ�,
		// ��ȯ ���� List�� printList(list) �޼ҵ��� �Ű������� �����Ͽ� ���
		List<Music> list = service.selectTitle(title); 
								// == searchList

		System.out.print("�˻� ��� : ");

		printList(list);

	}

	// 2-2. Ư�� �ܾ ������ ���Ե� �뷡 ��ȸ
	public void selectArtist() {
		System.out.println("-- ������ �˻� --");
		System.out.print("�˻� �� �Է� : ");
		String artist = sc.nextLine();

		// �������� �Է¹޾� service.selectArtist() �޼ҵ��� �Ű������� �����ϰ�,
		// ��ȯ ���� List�� printList(list) �޼ҵ��� �Ű������� �����Ͽ� ���
		System.out.print("�˻� ��� : ");
		printList(service.selectArtist(artist));
		//					== searchList

	}

	// 2-3. ���ƿ� ��ŷ������ ��ȸ
	public void selectTopFavoriteCount() {
		// service.selectTopFavoriteCount()�� ȣ���Ͽ� ��ȯ ���� List��
		// printList(list) �޼ҵ��� �Ű������� �����Ͽ� ���
		printList(service.selectTopFavoriteCount());
		
	}

	// 3. ���� ���� ����Ʈ �޴�
	public void myMusicListMenu() {
		int sel = 0;
		do {
			System.out.println();
			System.out.println("--- ���� ���� ����Ʈ ---");
			System.out.println("1. ���� ���� ����Ʈ ��ȸ");
			System.out.println("2. ���� ����Ʈ�� �� �߰�(�� ��ȣ)");
			System.out.println("3. ���� ����Ʈ���� ����(�� ��ȣ)");
			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				selectMyMusicList();
				break;
			case 2:
				addMusicList();
				break;
			case 3:
				removeMusicList();
				break;
			case 0:
				System.out.println("���� �޴���...");
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;

			}
		} while (sel != 0);
	}

	// 3-1. ���� ���� ����Ʈ ��ȸ
	public void selectMyMusicList() {
		List<Music> myList = new ArrayList<Music>();

		printList(myList);
		// service.selectMyMusicList()�� ȣ���Ͽ� ��ȯ ���� List��
		// printList(list) �޼ҵ��� �Ű������� �����Ͽ� ���
	}

	// 3-2. ���� ���� ����Ʈ�� �� �߰�(�� ��ȣ)
	public void addMusicList() {
		System.out.println();
		System.out.println("-- ���� ����Ʈ�� �� �߰� --");
		System.out.print("�� ��ȣ �Է� : ");
		int musicNo = sc.nextInt();
		sc.nextLine(); // ���ۿ� �����ִ� ���� ���� ����

		// �� ��ȣ�� �Է¹޾� service.addMusicList() �޼ҵ��� �Ű������� �����ϰ�,
		service.addMusicList(musicNo);

		// boolean ���� ��ȯ �޾� true�� "�߰� ����!"
		if (service.addMusicList(musicNo) == true) {
			System.out.print("�߰� ����!");
		} else {
			System.out.print("�߰� ���� ....(��ȣ�� �߸� �Է��Ͽ��ų�, �̹� ��Ͽ� �߰��� ���Դϴ�.)");
		}
		// false�� "�߰� ���� ....(��ȣ�� �߸� �Է��Ͽ��ų�, �̹� ��Ͽ� �߰��� ���Դϴ�.)" ���
	}

	// 3-3. ���� ���� ����Ʈ�� �� ����(�� ��ȣ)
	private void removeMusicList() {
		System.out.println();
		System.out.println("-- ���� ����Ʈ���� �� ���� --");
		System.out.print("�� ��ȣ �Է� : ");
		int musicNo = sc.nextInt();
		sc.nextLine();
		// �� ��ȣ�� �Է¹޾� service.removeMusicList() �޼ҵ��� �Ű������� �����ϰ�,
		service.removeMusicList(musicNo);
		
		// Music ��ü ���� �ּ� ���� ��ȯ �޾�
		// null�� �ƴϸ� (������ �� ����) + " �� ���ŵǾ����ϴ�."
		Music mi = service.removeMusicList(musicNo);
		if (mi != null) {
			System.out.print(mi + "���ŵǾ����ϴ�.");
		}else {
			System.out.print("���� ���� ....(��ȣ�� Ȯ�����ּ���.)");
		}
		// null�̸� "���� ���� ....(��ȣ�� Ȯ�����ּ���.)" ���
	}

	// 4. ���ƿ� ������
	public void incFavoriteCount() {
		System.out.println();
		System.out.println("-- ���ƿ� ���� --");
		System.out.print("�� ��ȣ �Է� : ");
		int musicNo = sc.nextInt();
		sc.nextLine();

		// �� ��ȣ�� �Է¹޾� service.incFavoriteCount() �޼ҵ��� �Ű������� ������ ���ƿ� �� ����.
		service.incFavoriteCount(musicNo);
		// (��ȯ�� ����)
	}

}
