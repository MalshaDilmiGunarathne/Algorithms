public class MergeSort {
    
    // Main function that sorts the array
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            // Split the array into two halves
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            // Recursively sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(array, left, right);
        }
    }

    // Function to merge two sorted halves
    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge arrays while there are elements in both
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Collect remaining elements from left array
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Collect remaining elements from right array
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Given Array");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("\nSorted array");
        printArray(array);
    }
}
