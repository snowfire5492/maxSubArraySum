
public class ImprovedSolutionAlt {
	
public int maxSubArraySum(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return 0;
		}
	
		int max = 0;
		int result = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; ++i) {
			
			max = Math.max(arr[i], arr[i] + max);
			
			result = Math.max(max, result);

		}
		
		return result;
	}

}
