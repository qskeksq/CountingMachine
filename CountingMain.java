package com.nadan.java.counting;

import java.util.Scanner;

public class CountingMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------");
		System.out.print("가격을 입력하세요 ");
		int price = scanner.nextInt();
		
		System.out.println("------------");
		System.out.print("금액을 입력하세요 ");
		int money = scanner.nextInt();
		
		System.out.println("------------");
		System.out.println("거스름돈 : "+(money-price));
		System.out.println("------------");
		
		Counting c = new Counting();
		c.changeMachine(money, price);
		
		scanner.close();
		
	}

}
