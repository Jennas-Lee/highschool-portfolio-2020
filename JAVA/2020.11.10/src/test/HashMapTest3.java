package test;

import java.util.*;

public class HashMapTest3 {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** 고객의 포인트 관리시스템입니다 ***");
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String n = scanner.next();
			if(n.equals("stop")) {
				System.out.println("포인트 입력이 종료됩니다.");
				break;
			} else {
				double s = scanner.nextDouble();
				if(map.get(n) == null) {
					map.put(n, s);
				} else {
					double t = map.get(n);
					map.replace(n, t + s);
				}
				System.out.println("(" + n + ", " + map.get(n) + ")");
			}
		}
		
		scanner.close();
	}

}
