package subeen.Calender;

import java.util.Scanner;

public class Calendar2 {

	private static final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return maxDays[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		Calendar2 cal = new Calendar2();
		
//		System.out.println("반복횟수를 입력하세요");
//		int repeat = scanner.nextInt();
//		
//		for(int i = 0; i<repeat; i++) {
//			System.out.println("월을 입력하세요");
//			System.out.print(">");
//			int month = scanner.nextInt();
//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getmaxDaysOfMonth(month));	
//		}
//		
//		int repeat = scanner.nextInt();
//		System.out.println("월을 입력하세요");
//		System.out.print(">");
//		int month = scanner.nextInt();
//		if(!(month == -1)) {
////			while() {
////				System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getmaxDaysOfMonth(month));	
////			}
//		} else {
//			System.out.println("Have a nice day!");
//		}
//		
//		
		//System.out.println("끝났습니다.");
		//cal.printSampleCalendar();

		scanner.close();
	}

}
