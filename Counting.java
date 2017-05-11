package com.nadan.java.counting;

public class Counting {
	
	public void changeMachine(int money, int price){
		
		int change = money - price;
		int[] unit = {10000, 5000, 1000, 500, 100 ,10};
		int unit_length = unit.length;
		for(int i=0; i<unit_length; i++){
			change = printChange(change, unit[i]);
		}
		
	}
	
	public int printChange(int change, int unit){
		int count = change/unit;
		System.out.println(unit+"¿ø±Ç"+count+"Àå");
		change = change - count*unit;
		return change;
	}
	
	
}
