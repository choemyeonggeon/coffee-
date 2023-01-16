package greed.coffe;

public class CoffeeDTO {
	private int num;
	private String menu;
	private String price;
	private int time;
	
	public CoffeeDTO() {}
	

	public CoffeeDTO(int num, String menu, String price, int time) {
		super();
		this.num = num;
		this.menu = menu;
		this.price = price;
		this.time = time;
	}


	public int getNum() {
		return num;
	}

	public String getMenu() {
		return menu;
	}

	public String getPrice() {
		return price;
	}

	public int getTime() {
		return time;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setTime(int time) {
		this.time = time;
		
	}	public String getInformation() {
			return "CoffeeDTO [num=" +num +
					", menu=" + menu +
					", price=" + price +
					", time= " + time +
					"]";
	
	
	}

}
