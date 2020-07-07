package Test_06;

class Student {
	
	public String name;
	int grade;
	int ban;
	private String telephone;
	
	void getTelephone(String p) {
		telephone = p;
	}
	String printTelephone() {
		return telephone;
	}
	
}

public class Test20200707_1 {

	public static void main(String[] args) {
		
		Student kim = new Student();
		kim.name = "김현우";
		kim.grade = 2;
		kim.ban = 6;
		kim.getTelephone("010-1234-5678");
		
		System.out.println("이름 : " + kim.name + " | 학년 : " + kim.grade + " | 반 : " + kim.ban + " | 전화번호 : " + kim.printTelephone());
		
	}
	
}
