package Test_06;

class Xcar {
	
	private int num;
	private double gas;
	
	void setNumGas(int n, double g) {
		if(g > 0 && g < 1000 ) {
			num = n;
			gas = n;
		} else {
			System.out.println(g + "은(는) 올바른 연료량이 아닙니다.");
			System.out.println("연료량을 변경할 수 없습니다.");
		}
	}
	
	void show() {
		System.out.println("차량번호는 " + num + "입니다.");
		System.out.println("연료량은  " + gas + "입니다.");
	}
	
}

public class Test20200707_3 {
	
	public static void main(String[] args) {
		
		Xcar car1 = new Xcar();
		car1.setNumGas(1234, -10.2);
		car1.show();
		car1.setNumGas(1234, 10.2);
		car1.show();
		
	}
	
}
