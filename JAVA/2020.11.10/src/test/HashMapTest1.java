package test;

import java.util.*;

class Student {
	String name;
	String _class;
	String num;
	String score;
	
	public Student(String name, String _class, String num, String score) {
		this.name = name;
		this._class = _class;
		this.num = num;
		this.score = score;
	}
}

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요");

		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String t = scanner.nextLine();
			String[] ta = t.split(", ");
			Student ts = new Student(ta[0], ta[1], ta[2], ta[3]);
			map.put(ta[0], ts);
		}
		System.out.println("=============================================");
		for(String key : map.keySet()) {
			System.out.println("이름: " + map.get(key).name);
			System.out.println("학과: " + map.get(key)._class);
			System.out.println("학번: " + map.get(key).num);
			System.out.println("학점평균: " + map.get(key).score);
			System.out.println("=============================================");
		}
		while(true) {
			System.out.print("학생이름 >> ");
			String t = scanner.nextLine();
			if(t.equals("stop")) {
				break;
			} else {
				Student s = map.get(t);
				if(s == null) {
					System.out.println("해당 학생이 없습니다.");
				} else {
					System.out.println("평균점수: " + s.score);
				}
				System.out.println("=============================================");
			}
		}
		
		scanner.close();
	}

}
