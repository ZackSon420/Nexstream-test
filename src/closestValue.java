public class closestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers =  { -9, 8, 2, -5, 7 };
		int result = closestValue.closestToZero(numbers);
		System.out.println(result);

	}
	
	public static int closestToZero(int [] numbers) {
		if (numbers == null || numbers.length == 0) {
            return 0;
        }
		int closest= numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if (Math.abs(numbers[i]) < Math.abs(closest) || 
		        (Math.abs(numbers[i]) == Math.abs(closest) && numbers[i] > closest))
			{
				closest=numbers[i];
			}
		}
		return closest;
	}

}
