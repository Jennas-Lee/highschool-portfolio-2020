package test06;

import java.util.*;

public class VectorRain {

	public static void main(String[] args) {
		Vector<Integer> rain = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("강수량을 입력하세요. 0을 입력하면 중지됩니다. : ");
			int t = scanner.nextInt();
			double sum = 0.0;
			rain.add(t);
			System.out.println("현재 입력된 모든 강수량");
			for(int u : rain) {
				System.out.print(u + ", ");
				sum += u;
			}
			System.out.println("\n현재 입력된 강수량의 평균 : " + (sum/rain.size()));
			if(t == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			} else {
				continue;
			}
		}
	}

}
