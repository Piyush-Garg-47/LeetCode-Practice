import java.util.*;

public class LC75 {
    public static int  majorityElement(int []nums){
        int n = nums.length;
        // Brute force approach of this qustion 
        // for(int i = 0 ; i<n ; i++){
        //     int count = 0 ; 
        //     for(int  j =0 ;j<n ;j++){
        //         if(nums[j] == nums[i]){
        //             count++;
        //          }
        //      }
        //      if(count > (n/2)){
        //         return nums[i]; 
        //      }
        //  }

        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0 ;i< n ;i++){
            int value =map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1) ;  
        }

        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
         return -1 ; 
      }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(nums);
        System.out.println("The majority element is: " + ans);
    }
}
