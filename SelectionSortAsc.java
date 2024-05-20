public class SelectionSortAsc {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 7};
        selectionSort(arr);
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = selectMin(i, arr, n);
            
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int selectMin(int i, int[] arr, int n) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        return minIdx;
    }
}
