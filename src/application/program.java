package application;

import java.util.ArrayList;
import java.util.List;

public class program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Jose");
		list.add("Joao");
		list.add("Fabio");
		list.add("Lucia");
		list.add("Matheus");
		list.add(2,"Marco");
		list.remove("Joao");
		
		for (String x : list ) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		System.out.println("Index of Jose: " + list.indexOf("Jose")); 
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("---------------------------");
		for (String x : list ) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		System.out.println("Index of Jose: " + list.indexOf("Jose")); 
		
	}

}
