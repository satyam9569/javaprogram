public class Permutation {
    
    // Function to print permutations of array
    public static void permute(int arr[], int l, int r) {
        if (l == r) {
            // Print the permutation when the left index equals the right index
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = l; i <= r; i++) {
                // Swap elements at indices l and i
                swap(arr, l, i);
                
                // Recursively call permute with the next index
                permute(arr, l + 1, r);
                
                // Backtrack to restore the array to its original state
                swap(arr, l, i);
            }
        }
    }
    
    // Utility method to swap two elements in the array
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        permute(arr, 0, n - 1);
    }
}
