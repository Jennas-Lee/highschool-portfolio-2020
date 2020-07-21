package test06;

class ID {
	
	static int counter = 0;
	private int id;
	
	ID() { id = ++counter; }
	
	int getID() { return id; }
	
}

public class Test0721_2 {

	public static void main(String[] args) {

		ID a = new ID();
		ID b = new ID();
		
		
		System.out.println("a의 식별번호 : " + a.getID());
		System.out.println("b의 식별번호 : " + b.getID());
		
		System.out.println("ID.counter = " + ID.counter);
		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);
		
	}

}
