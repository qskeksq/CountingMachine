public class CalChange {
	
//	�ʱⰪ
	public void change(int money, int price){
		
		int change = money - price; //�ʱⰪ ����
	
		int[] unit = {5000, 1000, 500, 100, 10};
		for(int i=0; i<unit.length; i++){
			change = printChange(change, unit[i]);
		}
		
	}
	
	public int printChange(int change, int unit){
		int count = change/unit; //�� �� �̳�
		System.out.println(unit+"�� ��"+count+"��");
		change = change - (unit*count);
		return change;
	}

	
	

}
