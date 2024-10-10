import java.util.HashMap;
import java.util.Map;

public class easy136{
    public static int getSingleElement(int []arr){
        int n = arr.length;
        // HashMap<Integer , Integer> mpp = new HashMap<>() ;
        // for (int i = 0; i < n; i++){
        //     int value =mpp.getOrDefault(arr[i], 0);
        //     mpp.put(arr[i] , value+1) ;
        // }
        // for(Map.Entry<Integer , Integer> it: mpp.entrySet()){
        //     if(it.getValue()==1){
        //         return it.getKey() ; 
        //     }
        // }
        int xor = 0 ;
        for(int i =0 ; i< n ;i++){
            xor = xor^arr[i] ; 
        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}