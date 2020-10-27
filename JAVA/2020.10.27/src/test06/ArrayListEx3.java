package test06;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Pear");
		list.add("Grape");
		
		int index = list.indexOf("Mango");
		
		System.out.println("MangoÀÇ À§Ä¡ : " + index);
	}

}
