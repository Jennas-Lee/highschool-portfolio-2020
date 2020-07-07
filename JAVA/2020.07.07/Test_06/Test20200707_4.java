package Test_06;

import java.util.Scanner;

class Car {
	
	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tank;
	private double fuel;
	private double sfc;
	
	Car(
			String name,
			String number,
			int width,
			int height,
			int length,
			double tank,
			double fuel,
			double sfc
			) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tank = tank;
		this.fuel = (fuel <= tank) ? fuel : tank;
		this.sfc = sfc;
		x = 0.0;
		y = 0.0;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double getFuel() {
		return fuel;
	}
	
	void putSpec() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + number);
		System.out.println("너비 : " + width + "mm");
		System.out.println("높이 : " + height + "mm");
		System.out.println("길이 : " + length + "mm");
		System.out.println("용량 : " + tank + "L");
		System.out.println("연료량 : " + fuel + "L");
		System.out.println("연비 : " + sfc + "km/L");
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		double f = dist / sfc;
		if(f > fuel) {
			return false;
		} else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}
	
	void refuel(double df) {
		if(df > 0) {
			fuel += df;
			if(fuel > tank) {
				fuel = tank;
			}
		}
	}
	
}

public class Test20200707_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car k3 = new Car("K3", "01가1234", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		k3.putSpec();
		while(true) {
			System.out.printf("현재 위치 : (%.2f, %.2f)\n", k3.getX(), k3.getY());
			System.out.printf("남은 연료 : %.2f\n", k3.getFuel());
			System.out.print("이동하시겠습니까? [0...NO/1...YES] : ");
			if(sc.nextInt() == 0) {
				break;
			}
			System.out.print("x 방향으로 이동할 거리 : ");
			double dx = sc.nextDouble();
			System.out.print("y 방향으로 이동할 거리 : ");
			double dy = sc.nextDouble();
			
			if(!k3.move(dx, dy)) {
				System.out.println("연료가 부족합니다.");
			}
		}
		
	}

}
