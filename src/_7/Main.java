package _7;

//소수 판별하기

public class Main {

	public static void main(String[] args) {
		
		// 소수란 1과 자기자신을 가지는것
		int num = 13;
		
		boolean isPrimeNumber = true;
		
		
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				//primeNumber X
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + " 은 소수 입니다.");
		}
		else {
			System.out.println(num + " 은 소수가 아닙니다.");
		}
	}

}
