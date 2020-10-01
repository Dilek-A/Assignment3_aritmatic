package Assignment3_aritmatic;

public class Question7 {

	public static void main(String[] args) {
		
		int price, changeQuarter, changeDime, changeNickles;

		final int banknote$1dollar = 100;
		price = 50;
		changeQuarter = (banknote$1dollar - price)/25;
		changeDime = ((banknote$1dollar - price) - (changeQuarter*25))/10;
		changeNickles = (((banknote$1dollar - price) - (changeQuarter*25) - (changeDime*10)))/5;

		System.out.println("Your change is " + changeQuarter + " quarters, " + 
		changeDime + " dimes and " + changeNickles + " nickles");
		
	}

}
