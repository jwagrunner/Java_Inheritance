package Dessert;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.util.Vector;


public class Checkout extends Object {
	
	DessertShoppe kl = new DessertShoppe(); 
	private Candy c;
	private Cookie d;
	private IceCream e; 
	private Sundae f;
	
public Checkout() { 
		
	}


Vector<DessertItem> vector = new Vector<DessertItem>(7);

public void enterItem(DessertItem item) {
	
	vector.addElement(item);
	
}

public int numberOfItems() {
	
	return vector.size();  //returns size of the vector

}

public void clear() {
	vector.clear(); 
}

public int totalCost() {
	
	int a = vector.get(0).getCost();
	int b = vector.get(1).getCost();
	int p = vector.get(2).getCost();
	int o = vector.get(3).getCost();

	int u = a + b + o + p;
	
	if (vector.size() == 6) {
		
		a = vector.get(0).getCost();
		b = vector.get(1).getCost();
		p = vector.get(2).getCost();
		o = vector.get(3).getCost(); 
		int y = vector.get(4).getCost();
		int z = vector.get(5).getCost();
		
		u = a + b + o + p + y + z; 
		
		
	}
	
	 
	return u;
}

public int totalTax() {
	
	
	double tax = Math.round((totalCost() * DessertShoppe.TAX_RATE)/(100));  //takes the total cost and multiply by it by tax rate
	
	return (int) tax; 
	
}
	


public java.lang.String toString() {
	
	if (vector.size() == 4) {
	
	System.out.println();
	System.out.println("    M & M Dessert Shoppe");
	System.out.println("    --------------------");
	
	System.out.println();
	Candy candy = new Candy("Peanut Butter Fudge", 2.25, 399); 
	candy.price_pound();
	
	
	int q = vector.get(0).getCost(); 
	DessertShoppe pbfc = new DessertShoppe();       //prints out string for Peanut Butter Fudge and Cost
	String pbfcost = pbfc.cents2dollarsAndCents(q); 
	String pbf = vector.get(0).getName(); 
	System.out.println(pbf + "      " + pbfcost);
	
	int we = vector.get(1).getCost();					//prints out string for Vanilla Ice Cream and Cost
	DessertShoppe vicc = new DessertShoppe();
	String viccost = vicc.cents2dollarsAndCents(we);
	String vic = vector.get(1).getName();
	System.out.println(vic + "        " + viccost);
	
	int re = vector.get(2).getCost();					//prints out string for Hot Fudge Sundae and Cost
	DessertShoppe hfsc = new DessertShoppe();
	String hfscost = hfsc.cents2dollarsAndCents(re);
	String hfs = vector.get(2).getName();
	System.out.println(hfs + "     " + hfscost);
	
	Cookie oat = new Cookie("Oatmeal Raisin Cookies", 4, 399);
	oat.price_pound();
	
	int qe = vector.get(3).getCost();					//prints out string for Oatmeal Raisin Cookies and Cost
	DessertShoppe orcc = new DessertShoppe();
	String orccost = hfsc.cents2dollarsAndCents(qe);
	String orc = vector.get(3).getName();
	System.out.println(orc + "   " + orccost);
	
	int ty = (int) totalTax();						//prints out the total tax as a string
	DessertShoppe tt = new DessertShoppe();
	String ttax = tt.cents2dollarsAndCents(ty);
	System.out.println();
	System.out.println("Tax                       " + ttax);
	
	int ta = totalCost() + (int) totalTax();		//prints the total cost as a string 
	DessertShoppe tc = new DessertShoppe();
	String tcost = tc.cents2dollarsAndCents(ta);
	System.out.println("Total Cost              " + tcost); 
	//System.out.println(String.format("%-20d %5d", 90));
}
	
else if (vector.size() == 6) { //this will work when there are six items entered
	
	    System.out.println();
		System.out.println("     M & M Dessert Shoppe");
		System.out.println("     --------------------");
		System.out.println();
		
		int qq = vector.get(0).getCost(); 
		DessertShoppe pbfcc = new DessertShoppe();       
		String pbfcostt = pbfcc.cents2dollarsAndCents(qq); 
		String pbff = vector.get(0).getName(); 
		System.out.println(pbff + "      " + pbfcostt);
		
		int wee = vector.get(1).getCost();					
		DessertShoppe viccc = new DessertShoppe();
		String viccostt = viccc.cents2dollarsAndCents(wee);
		String vicccc = vector.get(1).getName();
		System.out.println(vicccc + "         " + viccostt);
		
		Candy fudge = new Candy("Gummy Worms", 1.33, 89); 
		fudge.price_pound();
		
		
		int ree = vector.get(2).getCost();					
		DessertShoppe hfscc = new DessertShoppe();
		String hfscostt = hfscc.cents2dollarsAndCents(ree);
		String hfss = vector.get(2).getName();
		System.out.println(hfss + "               " + hfscostt);
		
		Cookie chip = new Cookie("Chocolate Chip Cookies", 4, 399);
		chip.price_pound();
		
		int qee = vector.get(3).getCost();					
		DessertShoppe orccc = new DessertShoppe();
		String orccostt = orccc.cents2dollarsAndCents(qee);
		String orccz = vector.get(3).getName();
		System.out.println(orccz + "    " + orccostt);
		
		Candy taffy = new Candy("Salt Water Taffy", 1.50, 209); 
		taffy.price_pound();
		
		int qeee = vector.get(4).getCost();					
		DessertShoppe orcccc = new DessertShoppe();
		String orccosttt = orcccc.cents2dollarsAndCents(qeee);
		String orcczz = vector.get(4).getName();
		System.out.println(orcczz + "          " + orccosttt);
		
		Candy corn = new Candy("Candy Corn", 3.00, 109); 
		corn.price_pound();
		
		int qeeee = vector.get(5).getCost();					
		DessertShoppe orccccc = new DessertShoppe();
		String orccostttt = orccccc.cents2dollarsAndCents(qeeee);
		String orcczzz = vector.get(5).getName();
		System.out.println(orcczzz + "                " + orccostttt);
		
		int tyy = (int) totalTax();						
		DessertShoppe ttc = new DessertShoppe();
		String ttaxx = ttc.cents2dollarsAndCents(tyy);
		System.out.println();
		System.out.println("Tax                        " + ttaxx);
		
		int taa = totalCost() + (int) totalTax();							 
		DessertShoppe tcc = new DessertShoppe();
		String tcostz = tcc.cents2dollarsAndCents(taa);
		System.out.println("Total Cost               " + tcostz);
		
	}
	
	
	return "";
	
}



}




 
	
