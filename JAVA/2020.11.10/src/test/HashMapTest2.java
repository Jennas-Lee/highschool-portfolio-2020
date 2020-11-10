package test;

import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("자바 장학금 관리시스템입니다.");
		for(int i=0; i<5; i++) {
			System.out.print("학생의 이름과 학점을 입력하세요 >> ");
			String n = scanner.next();
			double s = scanner.nextDouble();
			map.put(n, s);
		}
		System.out.print("장학생 선발 기준 점수를 입력하세요 >> ");
		double limit = scanner.nextInt();
		System.out.print("장학생 명단: ");
		for(String key : map.keySet()) {
			if(map.get(key) >= limit) {
				System.out.print(key + " ");
			}
		}
		
		scanner.close();
	}

}
