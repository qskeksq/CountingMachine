package com.nadan.java.counting;

import java.util.Scanner;

public class CountingMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------");
		System.out.print("������ �Է��ϼ��� ");
		int price = scanner.nextInt();
		
		System.out.println("------------");
		System.out.print("�ݾ��� �Է��ϼ��� ");
		int money = scanner.nextInt();
		
		System.out.println("------------");
		System.out.println("�Ž����� : "+(money-price));
		System.out.println("------------");
		
		Counting c = new Counting();
		c.changeMachine(money, price);
		
		scanner.close();
		
	}

}
