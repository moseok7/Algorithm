package _9;

// �Էµ� ���� �� �ڸ��� ���� ���Ͻÿ�

public class Main {

	public static void main(String[] args) {
		
		int num = 1111;
		int result = 0;
		
		// 1232 => 123 => 12 => 1 => 0
		// 2         3     2    1 => 8
		
		for (int i = 0; i < 4; i++) {
			result += num % 10;
			num /= 10;
		}
		
		System.out.println(result);
	}

}
