package Code.Numeric;

import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {

//		Orignal Code
//		===============================================================================================
//		Scanner input = new Scanner(System.in);
//		int s = 0, t = 0, a = 0, o = 0, nApple = 0, nOrange = 0, apple = 0, orange = 0, na = 0, no = 0;
//
//		String st[] = input.nextLine().split(" ");
//
//		s = Integer.parseInt(st[0]);
//		t = Integer.parseInt(st[1]);
//
//		String ao[] = input.nextLine().split(" ");
//		a = Integer.parseInt(ao[0]);
//		o = Integer.parseInt(ao[1]);
//
//		String n[] = input.nextLine().split(" ");
//		nApple = Integer.parseInt(n[0]);
//		nOrange = Integer.parseInt(n[1]);
//
//		String arrayAple[] = input.nextLine().split(" ");
//		String arrayOrange[] = input.nextLine().split(" ");
//
//		for (int i = 0; i < nApple; i++) {
//			na = a + Integer.parseInt(arrayAple[i]);
//			if (na >= s && na <= t) {
//				apple++;
//			}
//		}
//		for (int i = 0; i < nOrange; i++) {
//			no = o + Integer.parseInt(arrayOrange[i]);
//			if (no >= s && no <= t) {
//				orange++;
//			}
//		}
//		System.out.println(apple);
//		System.out.println(orange);
//		input.close();

//		Orignal Code
//		===============================================================================================	
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int t = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		int m = input.nextInt();
		int n = input.nextInt();
		int[] apple = new int[m];
		int app = 0;
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = input.nextInt();
			if (a + apple[apple_i] >= s && a + apple[apple_i] <= t) {
				app++;
			}
		}
		int[] orange = new int[n];
		int or = 0;
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = input.nextInt();
			if (b + orange[orange_i] >= s && b + orange[orange_i] <= t) {
				or++;
			}
		}

		System.out.println(app);
		System.out.println(or);
		input.close();
	}
}
