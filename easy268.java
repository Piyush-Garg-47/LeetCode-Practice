import java.util.*;
public class easy268 {
    public static int missingNumber(int[] nums) {
    //   int n =nums.length +1 ;
    //   int hash[] = new int[n + 1];
    //   for (int i = 0; i < n- 1; i++)
    //   hash[nums[i]]++;
    //   for (int i = 1; i <= n; i++) {
    //     if (hash[i] == 0) {
    //         return i;
    //     }
    //    }
    // return -1;
    int n =nums.length ; 
    int sum = (n*(n+1)) /2 ; 
    int s2=0 ;
    for(int i =0  ; i<n ; i++){
      s2 +=nums[i] ; 
    }
    return sum - s2 ;
    }
    public static void main(String[] args) {
        int nums[] = {0,1} ;
        int ans = missingNumber(nums);
        System.out.println("the missing number is " +ans);
    }
}
