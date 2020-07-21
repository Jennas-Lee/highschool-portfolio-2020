package test06;

class Human {
	
	private static int counter = 0;
	private int height;
	private int weight;
	private int id;
	private String name;
	
	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
	}
	String getName() { return name; }
	int getHeight() { return height; }
	int getWeight() { return weight; }
	
	void gainWeight(int w) { weight += w; }
	void reduceWeight(int w) { weight -= w; }
	
	int getId() { return id; }
	
	void putData() {
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
	}
	
}

public class Test0721_1 {

	public static void main(String[] args) {
		
		Human gildong = new Human("홍길동", 178, 77);
		Human chulsu = new Human("김철수", 166, 68);
		
		gildong.putData();
		System.out.println("번호 : " + gildong.getId());
		
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호 : " + chulsu.getId());
		
	}

}
