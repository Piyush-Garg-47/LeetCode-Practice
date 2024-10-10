public class leetcode1752 {
    public static  boolean check(int[] nums) {
        int count = 0;
               int n = nums.length;
       
               // Count the number of places where the current number is greater than the next number
               for (int i = 0; i < n; i++) {
                   if (nums[i] > nums[(i + 1) % n]) {
                       count++;
                   }
               }
       
               // The array can only be a sorted array rotated if there is at most one such place
               return count <= 1;
           }
           public static void main(String[] args) {
            int nums[] = {3,4,5,1,2} ; 
            System.out.println( check(nums));
           }
    
}
