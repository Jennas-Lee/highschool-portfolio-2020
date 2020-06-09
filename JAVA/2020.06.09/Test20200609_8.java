// 2020.06.09
// 20617

import java.util.Scanner;

public class Test20200609_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하시오: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.print("학생 " + i + "의 성적을 입력하시오: ");
			int t=sc.nextInt();
			if(t>100 || t<0) {
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--;
			} else {
				sum+=t;
			}
		}
		System.out.println("성적 평균은 " + (sum/n*1.0) + "입니다.");
	}

}
