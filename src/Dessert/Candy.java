package Dessert;

public class Candy extends DessertItem {
	
	double weight;
	
	int price_per_pound; 
	
	
	public Candy(String a, double b, int c) {  
		
		this.weight = b;
		this.price_per_pound = c;
		name = a; 

	}
	
	public int getCost() {
		
		double item_in_lbs = Math.round(weight * price_per_pound);
		 
		
		return (int) item_in_lbs; 
	}
	
	public void price_pound() {  
		
		//This function will print out at whatever parameters are inputed for the objects of Candy (these calls are in Checkout.java)
		//For example, "Candy corn = new Candy("Candy Corn", 3.00, 109)" should print out "3.00 lbs. @ 1.09 /lb."
	
	 DessertShoppe k = new DessertShoppe();
	
	 String price = k.cents2dollarsAndCents(price_per_pound); 
	
	 System.out.println(String.format("%.2f", weight) + " lbs. @ " + price + " /lb." );
	 
	}
	

}
