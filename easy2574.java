import java.util.Arrays;

public class easy2574 {
    public static int[] leftRightDifference(int[] nums){
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        
        if (n > 1) {
            // Initialize leftSum array
            leftSum[0] = 0;
            leftSum[1] = nums[0];
            for (int i = 2; i < n; i++) {
                leftSum[i] = leftSum[i-1] + nums[i-1];
            }
            
            // Initialize rightSum array
            rightSum[n-1] = 0;
            rightSum[n-2] = nums[n-1];
            for (int i = n-3; i >= 0; i--) {
                rightSum[i] = rightSum[i+1] + nums[i+1];
            }
        } else {
            // Handle the single element case
            leftSum[0] = 0;
            rightSum[0] = 0;
        }

        // Calculate result array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
     public static void main(String[] args) {
        int nums [] = {1};
          System.out.println(Arrays.toString(leftRightDifference(nums)));
     }
}
