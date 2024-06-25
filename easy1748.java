import java.util.*;

public class easy1748 {
     public static int sumOfUnique(int[] nums) {
     Arrays.sort(nums) ;
      int sum = 0 ;
      for(int i = 0 ; i<=nums.length ; i++){
          for(int j = i ; j<=nums.length ; j++){
              if(nums[i] != nums[j]){
            sum += nums[i] ;
          
           }else{
            break ; 
           }
          }
          
      }
       return sum ;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,2} ;
      System.out.println(sumOfUnique(nums));
    }
}
