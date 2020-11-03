package test06;

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

public class StudentScore {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			String name, _class, num, score;
			System.out.println((i+1) + "번 학생 정보");
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("학과 : ");
			_class = scanner.nextLine();
			System.out.print("학번 : ");
			num = scanner.nextLine();
			System.out.print("학점 : ");
			score = scanner.nextLine();
			Student t = new Student(name, _class, num, score);
			list.add(t);
		}
		
		System.out.println("=====학생정보 출력=====");
		for(int i=0; i<4; i++) {
			Student t = list.get(i);
			System.out.println((i+1) + "번 학생 정보");
			System.out.println("이름 : " + t.name);
			System.out.println("학과 : " + t._class);
			System.out.println("학번 : " + t.num);
			System.out.println("학점 : " + t.score);
		}
		
		System.out.println("=====학생이름 검색=====");
		System.out.print("이름 : ");
		for(int i=0; i<4; i++) {
			Student t = list.get(i);
			if(t.name.equals(scanner.nextLine())) {
				System.out.println(t.name + "의 학점 : " + t.score);
				break;
			} else {
				continue;
			}
		}
		
		scanner.close();
	}
}
