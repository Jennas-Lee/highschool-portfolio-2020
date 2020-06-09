// 2020.06.09
// 20617

import java.util.Scanner;

public class Test20200609_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] hex2bin = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
		};
		
		System.out.print("16진수 문자열을 입력하시오: ");
		String str = sc.next().toString();
		System.out.print("\"" + str + "\"에 대한 이진수는 ");
		char[] arr=str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			int n;
			if(arr[i]>57) n=arr[i]-87;
			else n=arr[i]-48;
			System.out.print(hex2bin[n] + " ");
		}
		System.out.print("입니다.");
	}

}
