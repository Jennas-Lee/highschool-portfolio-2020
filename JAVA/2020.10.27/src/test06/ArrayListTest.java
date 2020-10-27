package test06;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");
		list.set(2, "GRAPE");
		list.remove(3);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}