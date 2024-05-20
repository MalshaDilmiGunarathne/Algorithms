public class InsertionSortAdd {

    public static void main(String[] args) {
        int[] arr = {2, 6, 11, 13};
        int elementToAdd = 9;
        int position = 0;
        
        // Find the position to insert the new element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > elementToAdd) {
                position = i;
                break;
            }
            if(i==arr.length-1){
            	position=arr.length;
            }
        }
        
        // Shift elements to make space for the new element
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Insert the new element at the correct position
        arr[position] = elementToAdd;
        
        // Print sorted array
        System.out.println("Sorted array after adding " + elementToAdd + " in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
