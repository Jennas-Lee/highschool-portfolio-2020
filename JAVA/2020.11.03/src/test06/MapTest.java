package test06;

import java.util.*;

class Student_smc{
	int number;
	String name;
	
	public Student_smc(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student_smc> st = new HashMap<String, Student_smc>();
		st.put("100", new Student_smc(100, "홍길동"));
		st.put("200", new Student_smc(200, "강감찬"));
		st.put("300", new Student_smc(300, "이순신"));
		
		System.out.println(st);
		st.remove("20090002");
		
		st.put("20090003", new Student_smc(20090003, "최자영"));
		System.out.println(st.get("20090003"));
		for(Map.Entry<String, Student_smc> s : st.entrySet()) {
			String key = s.getKey();
			Student_smc value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}

}
