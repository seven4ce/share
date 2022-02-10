package Code.Hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FormingMagicSquare {

	public static int formingMagicSquare(List<List<Integer>> s, BufferedReader bufferedReader) throws NumberFormatException, IOException {
		// Write your code here
		Scanner input = new Scanner(System.in);
		int[][][] possiblePermutations = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, // 1

				{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } }, // 2

				{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } }, // 3

				{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } }, // 4

				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, // 5

				{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } }, // 6

				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } }, // 7

				{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },// 8
		};

		int[][] given = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
//			given[i][j] = input.nextInt();
				
//				IntStream.range(0, 3).forEach(k -> {
//					try {
//						s.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
//								.collect(toList()));
//						System.out.println("====" + s);
//					} catch (IOException ex) {
//						throw new RuntimeException(ex);
//					}
//				});
				
				String in = bufferedReader.readLine().replaceAll("\\s+$ ", "");
				System.out.println("====>>>> in : "+in);
				given[i][j] = input.nextInt();
				
//			System.out.println("====>>>> given[i][j] : "+given[i][j]);
//			System.out.println("====>>>> s : "+s);
			}
		}

		int minCost = Integer.MAX_VALUE;
		for (int permutation = 0; permutation < 8; permutation++) {
			int permutationCost = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					permutationCost += Math.abs(given[i][j] - possiblePermutations[permutation][i][j]);
					System.out.println("====>>>> s : " + s);
					System.out.println("====>>>> given[i][j] : " + given[i][j]);
					System.out.println("====>>>> possiblePermutations[permutation][i][j] : "
							+ possiblePermutations[permutation][i][j]);
//					permutationCost += Math.abs(s - possiblePermutations[permutation][i][j]);
				}
			}

			minCost = Math.min(minCost, permutationCost);
		}
		System.out.println(minCost);

		return minCost;
	}

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\IT190131\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\Basic Java\\src\\resource\\INPUT.txt";
		String outPut = "C:\\Users\\IT190131\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\Basic Java\\src\\resource\\OUTPUT.txt";

		File file = new File(filePath);
		FileReader fileReader = new FileReader(file);

		File outPutFile = new File(outPut);
		FileWriter OutPutFileReader = new FileWriter(outPutFile);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bufferedWriter = new BufferedWriter(OutPutFileReader);
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<List<Integer>> s = new ArrayList<>();

//		IntStream.range(0, 3).forEach(i -> {
//			try {
//				s.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
//						.collect(toList()));
//				System.out.println("====" + s);
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		});
		
		
		int result = FormingMagicSquare.formingMagicSquare(s, bufferedReader);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
		
//		Scanner input = new Scanner(System.in);
//        int[][][] possiblePermutations = {
//            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1
//
//            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2
//
//            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3
//
//            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4
//
//            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5
//
//            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6
//
//            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7
//
//            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
//        };
//
//        int[][] given = new int[3][3];
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//                given[i][j] = input.nextInt();
//        }
//
//        int minCost = Integer.MAX_VALUE;
//        for (int permutation = 0; permutation < 8; permutation++)
//        {
//            int permutationCost = 0;
//            for (int i = 0; i < 3; i++)
//            {
//                for (int j = 0; j < 3; j++)
//                    permutationCost += Math.abs(given[i][j] - possiblePermutations[permutation][i][j]);
//            }
//            minCost = Math.min(minCost, permutationCost);
//        }
//        System.out.println(minCost);
		
	}

}