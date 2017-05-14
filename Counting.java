package com.nadan.java.counting;

public class Counting {
	
	//처음 메소드를 다룰 때 알아야 할 것 하나가 같은 클래스 내부에서는 메소드를 이름으로 호출할 수 있다는 것이다.
	
	//처음부터 제어문을 쓸 수 있는 것이 아니다. 처음에는 처리할 일을 나열하고, 제어문을 쓸 필요성을 느끼면
	//그 때 쓰면 된다. 그리고 점점 익숙해지면 처음부터 제어문을 쓸 수 있게 된다.
	
	//주어진 총 가격과 금액으로 할 수 있는 일이 무엇일까. 잔돈을 구하고 그 잔돈을 처리하는 일을 해야 한다.
	//changeMachine에서 다 처리할 수 있지만 너무 복잡해 질 수 있기 때문에 잔돈 처리는 따로 메소드로 처리했다.
	public void changeMachine(int money, int price){
		
		//printChange에 넣어줄 잔돈
		int change = money - price;
		//금액권은 어떠한 패턴이 없이 일정한 수로 정해져 있기 때문에 배열에 넣어서 하나씩 꺼내 쓴다.
		int[] unit = {10000, 5000, 1000, 500, 100 ,10};
		int unit_length = unit.length;
		for(int i=0; i<unit_length; i++){
			//여기서 메소드의 중요한 속성 하나 더 알 것은, 메소드는 호출되면 일단 그 할 일을 한다.
			//그리고 리턴 값은 따로 처리할 수 있다.
			//여기서는 printChange가 금액권을 알려주고 change에 잔돈을 리턴한다.
			change = printChange(change, unit[i]);
		}
		
	}
	
	//잔돈과 구하고 싶은 금액권을 넣어주면 몇 장인지 알려주고 다음 금액권을 구하기 위해 잔돈을 리턴한다.
	public int printChange(int change, int unit){
		//금액권-int형을 나누기 하고 형 변환을 하지 않으면 그대로 int형으로 리턴된다.
		//잘라내기 종종 쓰이는 듯 하다
		int count = change/unit;
		System.out.println(unit+"원권"+count+"장");
		//잔돈
		change = change - count*unit;
		return change;
	}
	
	
}
