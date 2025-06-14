package Corejavaprogamswithbulidinmethods;

public class ArraySortedCheck {

    // Method to check if array is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 5, 3, 2};

        System.out.println("Array1 is sorted: " + isSorted(array1));
        System.out.println("Array2 is sorted: " + isSorted(array2));
    }
}
