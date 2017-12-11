package Dessert;

public class IceCream extends DessertItem {
	
	int cost1;
	
	public IceCream(String c, int e) {
		
		cost1 = e;
		
		name = c; 
		
	}

	public int getCost() {
		
		return cost1; 
	}

}
