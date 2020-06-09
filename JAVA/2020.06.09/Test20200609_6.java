// 2020.06.09
// 20617

import java.util.Random;

public class Test20200609_6 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		String type[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String number[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		int typeNum = rand.nextInt(4);
		int numberNum = rand.nextInt(13);
		
		System.out.println(type[typeNum] + "ÀÇ " + number[numberNum]);
	}

}
