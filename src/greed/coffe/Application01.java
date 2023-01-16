package greed.coffe;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		order cfe = new order();
		
		while(true) {
			System.out.println("=======키오스크=======");
			System.out.println("1.메뉴표보고 선택하기");
			System.out.println("2.메뉴 확인");
			System.out.println("3.메뉴 취소");
			System.out.println("9.키오스크 종료");
			System.out.println("메뉴 선택하기");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				cfe.makingorder();
				break;
			case 2 :
				cfe.printAllcoffees();
				break;
			case 3 :
				cfe.sorry();
				break;
	
			case 9 :
			System.out.println("주문을 종료합니다.");
			default :
				System.out.println("잘못된 번호를 입력하셨습니다.");
				break;
		}
		
	}
	}
}
