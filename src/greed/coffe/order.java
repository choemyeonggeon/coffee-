package greed.coffe;


public class order {
	public void makingorder() {
		
		CoffeeDTO[] coffee = new CoffeeDTO[3];
		
		coffee[0] = new CoffeeDTO(1, "아메리카노","3000원",5);
		coffee[1] = new CoffeeDTO(2, "라떼","4000원",10);
		coffee[2] = new CoffeeDTO(3, "에소프레스","5000원",3);
		
		CoffeeInsertMenu coffeeInsertmenu = new CoffeeInsertMenu();
		coffeeInsertmenu.insert(coffee);
	}
	public void printAllcoffees() {
			CoffeeDTO[] orderCoffees = new CoffeeSelectMenu().sslectAllCoffee();
			
			System.out.println("==========주문된 커피 목록 ==============");
			for(CoffeeDTO coffee : orderCoffees) {
				System.out.println(coffee.getInformation());
			}
		System.out.println("---------------------------");
		System.out.println("총" + orderCoffees.length + "명의 커피가 주문되어 있습니다.");
		
	}
	public void sorry() {
		CoffeeDTO[] orderCoffees = new CoffeeSelectMenu().sslectAllCoffee();
		
		System.out.println("==========주문된 커피 목록 ==============");
		for(CoffeeDTO coffee : orderCoffees) {
			System.out.println("주문이 취소 되었습니다.");
			
			
			
		
				
				
			}
	
		}
	}




