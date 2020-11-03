package test06;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		String nation, sch_key;
		int ingu;
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			nation = scanner.next();
			if(nation.equals("stop")) {
				break;
			} else {
				ingu = scanner.nextInt();
				nations.put(nation, ingu);
			}
		}
		System.out.println("검색할 나라 이름을 입력하세요.(예: Korea)");
		while(true) {
			nation = scanner.next();
			if(nation.equals("stop")) {
				break;
			} else {
				int tmp = nations.get(nation);
				if(tmp == 1) {
					System.out.println(nation + "은(는) 없는 단어입니다.");
				} else {
					System.out.println(tmp);
				}
			}
		}
	}

}
