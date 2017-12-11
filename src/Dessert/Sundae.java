package Dessert;

public class Sundae extends IceCream {
	
	int cost2;
	
	public Sundae(String c, int e, String f, int g) {
		
		super(c, e); 
		 
		cost1 = e;
		cost2 = g;
		
		//name = c + f; 
		
		name = f + " Sundae with \n" + c;
		
	
	}
	
	public int getCost() {
		
		int cost3 = cost1 + cost2;
		return cost3; 
	}
	

}
