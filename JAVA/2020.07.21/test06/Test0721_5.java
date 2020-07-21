package test06;

class Box {
	
	int w, l, h, v;
	
	Box(int w, int l, int h) {
		this.w = w;
		this.l = l;
		this.h = h;
		v = w * l * h; 
	}
	
	Box whoLargest(Box box1, Box box2) {
		if(box1.v > box2.v)
			return box1;
		else
			return box2;
	}
	
	String sameVolume(Box box1, Box box2) {
		if(box1.v == box2.v)
			return "부피가 동일합니다.";
		else
			return "부피가 다릅니다.";
	}
	
	boolean compare(Box box1, Box box2) {
		if(box1.w == box2.w && box1.l == box2.l && box1.h == box2.h)
			return true;
		else
			return false;
	}
	
}

public class Test0721_5 {

	public static void main(String[] args) {
		
		Box box1 = new Box(10, 20, 50);
		Box box2 = new Box(10, 30, 30);
		
		Box largest = box1.whoLargest(box1, box2);
		System.out.println("큰 상자의 크기");
		System.out.println("가로 : " + largest.w);
		System.out.println("세로 : " + largest.l);
		System.out.println("높이 : " + largest.h);
		System.out.println("부피 : " + largest.v);
		System.out.println(box1.sameVolume(box1, box2));
		System.out.println(box1.compare(box1, box2) == true ? "크기가 동일합니다." : "크기가 다릅니다.");
		
	}

}
