
class Student {
	
	String name;
	int grade;
	int ban;
	int number;
	String telephone;
	
	void eat() {
		System.out.println("냠냠");
	}
	void sleep() {
		System.out.println("쿨쿨");
	}
	
}

public class Test20200625_1 {

	public static void main(String[] args) {
		
		Student han = new Student();
		han.name = "한승윤";
		han.grade = 2;
		han.ban = 6;
		han.number = 25;
		han.telephone = "010-0000-0000";
		
		han.eat();
		han.sleep();
		
		System.out.println("학생의 이름은 " + han.name + "이고");
		System.out.println("학생의 학년은 " + han.grade + "이고");
		System.out.println("학생의 반은 " + han.ban + "이고");
		System.out.println("학생의 번호는 " + han.number + "이고");
		System.out.println("학생의 전화번호는 " + han.telephone + "이다.");
		
	}

}
