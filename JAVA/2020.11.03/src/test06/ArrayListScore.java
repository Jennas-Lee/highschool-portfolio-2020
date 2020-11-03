package test06;

import java.util.*;

public class ArrayListScore {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		
		System.out.println("학점을 입력하세요 : ");
		for(int i=0; i<6; i++) {
			String s = scanner.next();
			list.add(s);
		}
		for(int i=0; i<6; i++) {
			switch(list.get(i)) {
				case "A":
					sum += 4.0;
					break;
				case "B":
					sum += 3.0;
					break;
				case "C":
					sum += 2.0;
					break;
				case "D":
					sum += 1.0;
					break;
				default:
					sum += 0.0;
			}
		}
		System.out.println("평균 : " + (sum/6.0));
	}

}
