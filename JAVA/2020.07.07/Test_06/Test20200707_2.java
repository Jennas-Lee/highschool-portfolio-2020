package Test_06;

class Human {
	
	private String name;
	private int height;
	private int weight;
	
	Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}
	
	String getName() {
		return name;
	}
	
	int getHeight() {
		return height;
	}
	
	int getWeight() {
		return weight;
	}
	
	void gainWeight(int w) {
		weight += w;
	}
	
	void reduceWeight(int w) {
		weight -= w;
	}
	
}

public class Test20200707_2 {

	public static void main(String[] args) {
		
		Human gildong = new Human("È«±æµ¿", 170, 60);
		Human chulsu = new Human("±èÃ¶¼ö", 166, 72);
		
		System.out.println("ÀÌ¸§ : " + gildong.getName() + " | Å° : " + gildong.getHeight() + " | ¸ö¹«°Ô : " + gildong.getWeight());
		gildong.gainWeight(10);
		System.out.println("ÀÌ¸§ : " + gildong.getName() + " | Å° : " + gildong.getHeight() + " | ¸ö¹«°Ô : " + gildong.getWeight());
		gildong.reduceWeight(5);
		
		System.out.println("ÀÌ¸§ : " + chulsu.getName() + " | Å° : " + chulsu.getHeight() + " | ¸ö¹«°Ô : " + chulsu.getWeight());
		
	}

}
