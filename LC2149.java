import java.util.ArrayList;

public class LC2149 {
    public static  int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>(); 
        ArrayList<Integer> neg = new ArrayList<>() ;

        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] >0){
                pos.add(nums[i] );
            }else{
                neg.add(nums[i]) ;
            }
        }
        //rearanging the array 
         for(int i=0 ;i< nums.length / 2 ; i++){
            nums[i*2] =pos.get(i) ;
            nums[2*i+1] =neg.get(i); 
         }
         return nums ;
        
    }
    public static void main(String[] args) {
        int nums[]= {1,2,-4,-5};


        int[]ans= rearrangeArray(nums);
        
        for (int i = 0; i < nums.length; i++) {
          System.out.print(ans[i]+" ");
        }
    }
}
