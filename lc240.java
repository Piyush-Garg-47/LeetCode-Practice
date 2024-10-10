public class lc240 {
    public static boolean binarySearch(int[] row, int target) {
        int low = 0;
        int high = row.length - 1; // Correct the high initialization to the last valid index
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (row[mid] == target) {
                return true;  // Found the target
            } else if (row[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;  // Target not found in the current row
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        // Iterate through each row and apply binary search
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix[i], target)) {
                return true;  // Return true if the target is found in any row
            }
        }
        
        return false;  // If the target is not found in any row
    }
     public static void main(String[] args) {
        // Initialize the matrix and target
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 11;

    
        
        // Call the searchMatrix method and print the result
        boolean result = searchMatrix(matrix, target);
        System.out.println("Is target " + target + " found in the matrix? " + result);
    }
}
