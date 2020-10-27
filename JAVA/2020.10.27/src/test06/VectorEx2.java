package test06;

import java.util.*;

class Monster {
    String name;
    double hp;

    public Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() { return "{ " + name + ", " + hp + " }"; }
}

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Monster> vc1 = new Vector<>();
		
		vc1.add(new Monster("Mon1", 100));
		vc1.add(new Monster("Mon2", 200));
		vc1.add(new Monster("Mon3", 300));
		
		System.out.println("∫§≈Õ¿« ≈©±‚: " + vc1.size());
		System.out.println(vc1);
	}

}
