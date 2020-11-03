package test06;

import java.util.*;

public class VectorScanner {
	public static void main(String[] args) {
		Vector<Integer> num = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			int t = scanner.nextInt();
			if(t == -1) {
				break;
			} else {
				num.add(t);
				continue;
			}
		}
		for(int t : num) {
			if(max < t)
				max = t;
		}
		System.out.println("가장 큰 수는 : " + max);
	}
}
