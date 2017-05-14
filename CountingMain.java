package com.nadan.java.counting;

import java.util.Scanner;

public class CountingMain {

	public static void main(String[] args) {

		//스캐너를 통해 총 가격과 금액을 리턴받는다.
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
	
	
//	public void changeMachine(int money, int price){
//		
//		int change = money - price;
//		int[] unit = {10000, 5000, 1000, 500, 100 ,10};
//		int unit_length = unit.length;
//		for(int i=0; i<unit_length; i++){
//			change = printChange(change, unit[i]);
//		}
//		
//	}
//	
//	public int printChange(int change, int unit){
//		int count = change/unit;
//		System.out.println(unit+"원권"+count+"장");
//		change = change - count*unit;
//		return change;
//	}

}
