// 2020.06.09
// 20617

public class Test20200609_1 {

	public static void main(String[] args) {
		double arr[] = {1.0, 2.0, 3.0, 4.0};
		double s=0, m=0;
		
		for(int i=0; i<4; i++) {
			s+=arr[i];
			if(arr[i]>m) m=arr[i];
		}
		
		
		System.out.println("합은 " + s);
		System.out.println("최대값은 " + m);
	}

}
