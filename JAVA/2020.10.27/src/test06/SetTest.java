package test06;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		if(set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
	}

}
