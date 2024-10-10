import java.util.*;

public class meduimGFG {
     public static int SumofMiddleElements(int []arr1, int [] arr2) {
        // code here
        int n1 = arr1.length, n2 = arr2.length;
        int m1 = (n1 + n2) / 2 - 1; // Calculate the index of the first middle element
        int m2 = m1 + 1; // The index of the second middle element
        
        int sum = 0;
        int count = 0;
        int i = 0, j = 0;
        int mid1 = 0, mid2 = 0;

        while (i < n1 && j < n2) {
            int currentElement;
            if (arr1[i] <= arr2[j]) {
                currentElement = arr1[i++];
            } else {
                currentElement = arr2[j++];
            }

            if (count == m1) mid1 = currentElement;
            if (count == m2) mid2 = currentElement;

            count++;
        }

        // If one of the arrays is exhausted
        while (i < n1) {
            if (count == m1) mid1 = arr1[i];
            if (count == m2) mid2 = arr1[i];
            i++;
            count++;
        }

        while (j < n2) {
            if (count == m1) mid1 = arr2[j];
            if (count == m2) mid2 = arr2[j];
            j++;
            count++;
        }

        sum = mid1 + mid2;
        return sum;
    }
    public static void main(String[] args) {
        int []arr1 = {1, 2, 4, 6, 10};
        int []arr2 = {4, 5, 6, 9, 12};
         int sum = SumofMiddleElements(arr1, arr2) ;
         
         System.out.println(sum);
        
    }
}
