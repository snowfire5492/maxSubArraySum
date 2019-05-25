
public class NaiveSolution {
	
	public int maxSubArraySum(int[] arr) {
		
		// null and empty string case
		// go thru given array 
		// at each element, go thru array in a contiguous manner to sum up value
		// compare each sum to the current max sub-array sum to find largest sum in given input
		// return the max value

		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Null or Empty Input");
			//return -404;
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; ++i) {
			
			int sum = arr[i];
			max = Math.max(sum, max);
			
			for(int j = i + 1; j < arr.length; ++j) {
				
				sum += arr[j];
				max = Math.max(sum, max);
			}
		}
		
		return max;
	}

}
