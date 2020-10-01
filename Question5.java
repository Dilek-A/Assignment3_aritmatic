package Assignment3_aritmatic;

public class Question5 {

	public static void main(String[] args) {
		
		int hours,minutes,seconds,inputSeconds;
		inputSeconds = 86399;
		seconds = inputSeconds%60;
		minutes = inputSeconds/60%60;
		hours = inputSeconds/3600%24;
		System.out.println("input second is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
		

	}

}
