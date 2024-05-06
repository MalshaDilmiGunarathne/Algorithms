public class BubbleSortAsc {
    public static void main(String args[]) {
        int arr[] = {3, 2, 5, 1, 7};
        int n = arr.length;
        
        // Bubble sort algorithm
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        // Print sorted array
        System.out.println("Sorted array:");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}