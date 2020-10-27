package test06;

import java.util.*;

public class AlphabetHistogramApp {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(2);
		vec.add("Apple");
		vec.add("Orange");
		vec.add("Mango");
		
		System.out.println("∫§≈Õ¿« ≈©±‚: " + vec.size());
		Collections.sort(vec);
		
		for(String s: vec)
			System.out.println(s + " ");
	}

}
