package Code.Numeric;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {

//		Original Code
//		===============================================================================================	
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int v1 = input.nextInt();
		int x2 = input.nextInt();
		int v2 = input.nextInt();
		int[] xArray = new int[10000];
		int[] vArray = new int[10000];

		if (x2 > x1 && v2 > v1) {
			System.out.println("NO");
		} else {
			for (int i = x1; i < 10000; i++) {
				if ((10000-i)==1) {
					System.out.println("NO");
					break;
				}
				x1 += xArray[i] + v1;
				x2 += vArray[i] + v2;
				if (x1 == x2) {
					System.out.println("YES");
					break;
				}
				if (x1 > x2) {
					System.out.println("NO");
					break;
				}

			}
		}
		input.close();

//		Googling Code
//		===============================================================================================		

//		Scanner input = new Scanner(System.in);
//        int x1 = input.nextInt();
//        int v1 = input.nextInt();
//        int x2 = input.nextInt();
//        int v2 = input.nextInt();
// 
//        if(x2>x1 && v2> v1){
//            System.out.println("NO");
//        }else{
//            while(x2 > x1){
//                x2 = x2 + v2;
//                x1 = x1 + v1;
// 
//                if(x1 == x2){
//                    System.out.println("YES");
//                    break;
//                }
// 
//                if(x1 > x2){
//                    System.out.println("NO");
//                    break;
//                }
//            }
//        }
//        input.close();
//		

	}
}
