import java.util.Arrays;

public class meduim189 {
    public static void rotate(int[] nums, int k){
      int  n = nums.length ;
      k = n% k ;
       int temp = nums[0] ;
    for(int i = 1 ; i< k ; i++){
      nums[i-1] = nums[i] ; 
    }
    nums[n-1] = temp ;
    
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7} ; 
        int k = 3 ; 
      rotate(nums, k);
      for(int i = 0 ; i< nums.length ; i++){
        System.out.print(nums[i] + " ");
      }
    }
}
