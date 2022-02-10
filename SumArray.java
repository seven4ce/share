package Code.Numeric;

import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		String line = input.next();
//		line = line.concat(input.nextLine());
//		String[] numberStr = line.split("\\s+");
//		int sum = 0;
//		int[] arrayMember = new int[n];
//		for (int i = 0; i < n; i++) {
//
//			arrayMember[i] = Integer.parseInt(numberStr[i]);
//
//			sum = sum + arrayMember[i];
//
//			System.out.println("sum : " + sum);
//			System.out.println("===================== ");
//		}
	
		
        int num=input.nextInt();
        int sum=0;
        
        for(int i=0;i<num;i++) {
            sum=sum+input.nextInt();
        }
        System.out.println(sum);
        input.close();
		
	}
}
