import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------");
		System.out.print("가격을 입력하세요 ");
		int input1 = scanner.nextInt();
		
		System.out.println("--------------");
		System.out.print("낼 돈을 입력하세요 ");
		int input2 = scanner.nextInt();
		
		System.out.println("--------------");
		CalChange cal = new CalChange();
		cal.change(input2, input1);
		
		scanner.close();

		
	}
}
