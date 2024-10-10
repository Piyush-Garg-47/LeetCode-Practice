public class LC53 {
    public  static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String args[]) {
        int[] nums = {-3,-2,0,-1};
        int  maxSum = maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
