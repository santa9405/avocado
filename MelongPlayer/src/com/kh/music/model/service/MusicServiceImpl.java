package com.kh.music.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.vo.Music;

public class MusicServiceImpl implements MusicService {

	private Scanner sc = new Scanner(System.in);

	private List<Music> musicTable = null; // ���� �����Ͱ� ����Ǿ� �ִ� ����Ʈ
	private List<Music> myList = new ArrayList<Music>(); // ���� ���� ����Ʈ

	private int seqMusicNo = 1; // ������ �߰��� �� ���� ������ ��ȣ�� �ο��ϴ� ����. (DB ������ó�� ���, PK�� �����Ѵٰ� ��������!)

	public MusicServiceImpl() {
		// �⺻�����ڷ� MusicServiceImpl ��ü�� ������ ���
		// musicTable ��ü ���� �� ���� ������ 10�� �߰�
		musicTable = new ArrayList<Music>();
		musicTable.add(new Music(seqMusicNo++, "Dynamite", "BTS", 100));
		musicTable.add(new Music(seqMusicNo++, "���� �� ����� �ƴϴ�", "��â��", 150));
		musicTable.add(new Music(seqMusicNo++, "Lovesick Girls", "BLACKPINK", 60));
		musicTable.add(new Music(seqMusicNo++, "DON'T TOUCH ME", "ȯ�ҿ�����", 10));
		musicTable.add(new Music(seqMusicNo++, "��⸦ ���� (�������� �׳� X ���)", "���", 50));
		musicTable.add(new Music(seqMusicNo++, "������ �뷡", "���ĵ� ����", 80));
		musicTable.add(new Music(seqMusicNo++, "���� ���� �ʳ׿�", "�����", 120));
		musicTable.add(new Music(seqMusicNo++, "�������� (Dingga)", "������", 200));
		musicTable.add(new Music(seqMusicNo++, "When We Disco (Duet with ����)", "������", 5));
		musicTable.add(new Music(seqMusicNo++, "I CAN��T STOP ME", "TWICE(Ʈ���̽�)", 80));
	}

	// 1. ���� ��� ��ü ��ȸ
	@Override
	public List<Music> selectAll() {
// ����������       ��ȯ��	           �޼ҵ��
		return musicTable;
	}

	// 2-1. Ư�� �ܾ ���� ���Ե� �뷡 ��ȸ
	@Override
	public List<Music> selectTitle(String title) {

		// �˻��� ���� �������� ��� ������ ���ο� List�� ���� �� ����
		List<Music> searchList = new ArrayList<>(); // �б⸸ �ϴ� ��� ArrayList�� ȿ���� ���� ����

		// musicTable�� �ִ� �뷡�� ��
		// ���� �޾ƿ� title�� �������� ���ԵǾ� �ִ� �뷡���� �˻�
		for (Music musicList : musicTable) {
			if (musicList.getTitle().contains(title)) {
				// if ("Dynamite".contains("a")) {
				// musicTable���� ���������� �ϳ��� ������ music ��ü�� ����
				// title�̶�� �ܾ ���ԵǾ� ���� ���
				searchList.add(musicList);
			}
		}

		return searchList;
	}

	// 2-2. Ư�� �ܾ ������ ���Ե� �뷡 ��ȸ
	@Override
	public List<Music> selectArtist(String artist) {

		List<Music> searchList = new ArrayList<>();
		// -> Ÿ�� �߷�(���������� �ۼ��� ���׸��� ����
		// <> ���ο� �ۼ��� Ÿ���� �߷��Ͽ� ������ �ܰ迡�� �ڵ� �߰�)

		for (Music music : musicTable) {

			// ���� ������ music ��ü�� �������� ���� �ҹ��ڷ� ��ȯ ��
			// �Ű������� ���� artist�� �ҹ��� ��ȯ ���� ���� �Ǿ��ִ� ���
			if (music.getArtist().toLowerCase().contains(artist.toLowerCase())) {
				// BTS -> "bts".contains("bt")
				searchList.add(music);
			}
		}
		
		return searchList;
	}

	// 2-3. ���ƿ� ��ŷ������ ��ȸ
	@Override
	public List<Music> selectTopFavoriteCount() {

		// musicTable List�� ���� �����Ͽ� list ������ ����
		// ��? ������ musicTable�� ������ �����ϱ� ���ؼ�
		List<Music> list = new ArrayList<>(musicTable);

		// ���� ���� ��������
		for (int i = 1; i < list.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {

				// if (arr[j + 1] < arr[j]) {
				if (list.get(j + 1).getFavoriteCount() // ���� ����� ���ƿ� ���� ���� ����� ���ƿ� ������ �۴ٸ�
						> list.get(j).getFavoriteCount()) {
					Music temp = list.get(j + 1);
					// arr[j+1] = arr[j];
					list.set(j + 1, list.get(j));

					// arr[j] = temp;
					list.set(j, temp);
				}
			}
		}
		
		Collections.sort(list);

		return list;
	}

	// 3-1. ���� ���� ����Ʈ ��ȸ
	@Override
	public List<Music> selectMyMusicList() {

		return myList;
	}

	// 3-2. ���� ���� ����Ʈ�� �� �߰�(�� ��ȣ)
	@Override
	public boolean addMusicList(int musicNo) {

		for (Music list : musicTable) {
			if (list.getMusicNo() == musicNo) {
				return myList.add(list);
			}

		}

		return false;
	}

	// 3-3. ���� ���� ����Ʈ�� �� ����(�� ��ȣ)
	@Override
	public Music removeMusicList(int musicNo) {

		List<Music> music = new ArrayList<>(musicNo);

		Music result = null; // ���� �Ǵ� ���� �ѹ��� ������ ���� ����

		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getMusicNo() == musicNo) {
				return result = myList.remove(i);
			}
		}

		return null;
	}

	// 4. ���ƿ� ������
	@Override
	public void incFavoriteCount(int musicNo) {

	}

}
