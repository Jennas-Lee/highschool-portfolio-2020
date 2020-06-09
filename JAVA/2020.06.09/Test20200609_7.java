// 2020.06.09
// 20617

import java.util.Scanner;

public class Test20200609_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int n=sc.nextInt();
			if(n%10==0) arr[n/10-1]++;
			else arr[n/10]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i*10+1) + "-" + ((i+1)*10) + ":");
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
