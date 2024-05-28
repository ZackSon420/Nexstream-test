import java.util.*;
public class largestValue {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, -28, 88, 200, 7 };
		int result=largestValue.findLargest(numbers);
		System.out.println(result);

	}
	public static int findLargest(int [] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		Arrays.sort(numbers);
		int largest=numbers[numbers.length-1];
		return largest;
	}


}
