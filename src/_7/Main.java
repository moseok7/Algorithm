package _7;

//�Ҽ� �Ǻ��ϱ�

public class Main {

	public static void main(String[] args) {
		
		// �Ҽ��� 1�� �ڱ��ڽ��� �����°�
		int num = 13;
		
		boolean isPrimeNumber = true;
		
		
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				//primeNumber X
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + " �� �Ҽ� �Դϴ�.");
		}
		else {
			System.out.println(num + " �� �Ҽ��� �ƴմϴ�.");
		}
	}

}
