package My;

import java.util.*;

public class ComputerStore {
	public static void main (String args[]){
	List <Computer> catalogComputerList  = new ArrayList <Computer>();
	Computer comp1 = new Computer("LG 21' ", "HP Pavilion", "Asus G3", "Asus A7 ");
	Computer comp2 = new Computer("HP 17' ", "HP Envy", "Logitech", "Logitech 72 ");
	Computer comp3 = new Computer("Philips 24' ", "Lenovo H50", "Razer", "SteelSeries ");
	
	catalogComputerList.add(comp1);
	catalogComputerList.add(comp2);
	catalogComputerList.add(comp3);
		for (int i=0;i<catalogComputerList.size();i++) {
		System.out.println(catalogComputerList.get(i));
		}
		
		for (Computer i: catalogComputerList) {
		System.out.println(i);
		}
		ListIterator<Computer> list = catalogComputerList.listIterator();
		while (list.hasNext()){
			System.out.println(list.next());
		}
		HashMap <String,Computer> hm = new HashMap <String, Computer>();
		hm.put("First", comp1);
		hm.put("Second", comp2);
		hm.put("Third", comp3);
		System.out.println();
		
		for(Map.Entry<String, Computer> entry : hm.entrySet()){
			System.out.println(entry.getValue());
		}
		System.out.println();
		hm.forEach((k,v)->System.out.println(v));
	}
}
