package _8;

//�Էµ� ���� ���丮�� ���ϱ�

public class Main {

	public static void main(String[] args) {
		
		int num = 5;
		int result = 1;
		
		// 5! = 5 * 4 * 3 * 2 * 1
		// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
		
		for (int i = 1; i <= num; i++) {
			result *= i; // result = result * i
		}
		
		System.out.println(result);
	}

}
