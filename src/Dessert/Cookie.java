package Dessert;

public class Cookie extends DessertItem {
	
	int number;
	
	int price_per_dozen; 
	
	
	public Cookie(String b, int g, int h) { 
		
		number = g;
		
		price_per_dozen = h;
		
		name = b;
	
		
	}

	public int getCost() {
		
		int cost = (number * price_per_dozen) / 12;
		
		return cost; 
	}
	
	public void price_pound() { 		//functions almost the same as the "price_pound()" method from Candy.java 
		
		 DessertShoppe p = new DessertShoppe();
		
		 String priced = p.cents2dollarsAndCents(price_per_dozen);
		
		 System.out.println(number + " @ " + priced + " /dz." );
		 
		}

}
