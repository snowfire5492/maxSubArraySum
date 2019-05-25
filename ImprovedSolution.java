
public class ImprovedSolution {
	
	public int maxSubArraySum(int[] arr) {
		
		// handle null and length == 0 case
		
		// create an empty array size n + 1 
		
		// go thru result array starting at i = 1
		
		// place element from arr[i -1] into result array at index i. 
		// note: skipping 0 index in new array so must decrease value by 1 in original array
		
		// if previous element in result array is > 0 than add value to current index sum
		// note: only want values > 0 since we are looking for a maximum sum and anything 
		// 		<= 0 would either not help achieve a maximum value or hinder it.
		
		// compare result at current index against max value to find largest sum in array 
		
		// return max value
		
		if(arr == null || arr.length == 0) {
			return 0;
		}
		
		int subSum1 = 0;
		int subSum2 = 0;
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; ++i) {
			
			subSum2 = arr[i];
			
			if(subSum1 > 0) {
				subSum2 += subSum1;
			}
			
			max = Math.max(max, subSum2);
			
			subSum1 = subSum2;
			
		}
		
		return max; 
	}

}
