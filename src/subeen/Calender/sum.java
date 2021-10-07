package subeen.Calender;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a + b;
		System.out.println(a + "," + b);
		//System.out.println("두 수의 합은 " + sum + "입니다!");
		System.out.printf("두 수의 합은 %d 입니다!", sum);
		
		scanner.close();
		
	}

}
