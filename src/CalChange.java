public class CalChange {
	
//	초기값
	public void change(int money, int price){
		
		int change = money - price; //초기값 설정
	
		int[] unit = {5000, 1000, 500, 100, 10};
		for(int i=0; i<unit.length; i++){
			change = printChange(change, unit[i]);
		}
		
	}
	
	public int printChange(int change, int unit){
		int count = change/unit; //몇 장 이냐
		System.out.println(unit+"원 권"+count+"장");
		change = change - (unit*count);
		return change;
	}

	
	

}
