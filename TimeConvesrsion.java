package Code.String;

import java.util.Scanner;

public class TimeConvesrsion {
	
	
	/*
	 * Sample Input 0
	 * 
	 * 07:05:45PM 
	 * 
	 * Sample Output 0
	 * 
	 * 19:05:45
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String time = input.next();
		int hour = Integer.parseInt(time.substring(0, 2)) % 12;
		if (time.contains("PM"))
			hour += 12;
		System.out.printf("%02d%s", hour, time.substring(2, 8));
		input.close();
	}

}
