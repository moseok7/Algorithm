package _10;

// �Էµ� ��(N) ��ŭ N�� N���� ���·� ������µǴ� ���� �簢���� ����϶�

public class Main {

	public static void main(String[] args) {
		
//	ex) n = 3
//		1 2 3
//		4 5 6
//		7 8 9
		int n = 5;
		int num = 1;
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%3d", num);
				num++;
			}
			System.out.println();
		}
		
	}

}
