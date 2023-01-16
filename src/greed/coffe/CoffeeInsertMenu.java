package greed.coffe;

public class CoffeeInsertMenu {
public static void insert(CoffeeDTO[] coffees) {
		
		System.out.println("커피메뉴를 등록합니다.");
		
		for(int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i].getMenu()+"를 주문했습니다.");
		}
	
	}

}
