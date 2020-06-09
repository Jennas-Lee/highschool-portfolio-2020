// 2020.06.09
// 20617

import java.util.Arrays;

public class Test20200609_3 {

	public static void main(String[] args) {
		int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		Arrays.sort(arr);
		
		
		for(int k:arr) {
			System.out.print(k + ", ");
		}
		System.out.println("\n3ÀÇ À§Ä¡: " + Arrays.binarySearch(arr, 3));
		
	}

}
