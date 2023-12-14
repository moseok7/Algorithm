package _4;

// 10진수 값 2진수로 변환하기
public class Main {

	public static void main(String[] args) {
		
		int inputNum = 19;
		int bin[] = new int[100];
		
//		19 / 2  9 ... 1
//		 9 / 2  4 ... 1
//		 4 / 2  2 ... 0
//		 2 / 2  1 ... 0
//		 1 / 2  0 ... 1
//		 
//		 19 --> 11001 
		 
		 int i = 0;
		 int mok = inputNum;
		 
		 
		 while (mok > 0) {
			 bin[i] = mok % 2;
			 mok /= 2;
			 i++;
		 }
		 
		 i--;
		 for (; i>=0; i--) {
			 System.out.print(bin[i]);
		 }
		 
		 
	}

}
