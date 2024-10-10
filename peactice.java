
import java.io.*;
import java.util.Arrays;
class Test
{
static private void getElements(int[] arr, int n)
{
	for(int i = n-1 ; i >= 0 ; i--){
        if(arr[i] != arr[i+1]){
           System.out.println(arr[i]);
           break ; 
        }
    }
}
public static void main(String[] args)
{
	int[] arr = {1, 2,6,7, 5};
	int n = arr.length;
	getElements(arr, n);
}
}
