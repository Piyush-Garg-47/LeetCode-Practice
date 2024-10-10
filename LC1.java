import java.util.HashMap;

public class LC1 {
    public static int[] twoSum(int[] nums, int target){
        int n =nums.length;
        int ans [] = new int[2];
        ans[0] = ans[1] =-1 ;
        HashMap<Integer , Integer> map = new HashMap<>() ; 
        for(int i = 0 ; i< n ; i++){
            int arr = nums[i] ;
            int moreneeded = target - arr ; 
            if(map.containsKey(moreneeded)){
                ans[0] =map.get(moreneeded);
                ans[1] = i ;
                return ans ; 
            }
            map.put(nums[i] , i );
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans  = twoSum( nums, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");
    }
}
