package greed.coffe;

public class CoffeeSelectMenu {
	
	public CoffeeDTO[] sslectAllCoffee() {

		return new CoffeeDTO[] {
				new CoffeeDTO(1, "아메리카노", "3000원",  5),
				new CoffeeDTO(2, "라떼", "4000원",  10),
				new CoffeeDTO(3, "에소프레스", "5000원",  3),
			
		};
	}

	

	
	

}
//coffee[0] = new CoffeeDTO(1, "아메리카노","3000원",5);
//coffee[1] = new CoffeeDTO(2, "라떼","4000원",10);
//coffee[2] = new CoffeeDTO(3, "에소프레스","5000원",3);