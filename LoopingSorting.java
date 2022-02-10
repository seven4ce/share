package Code.Numeric;

public class LoopingSorting {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 4, 5, 6, 7, 1, 8 };

		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i]+" ");
		}
	}
}
