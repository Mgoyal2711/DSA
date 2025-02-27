import java.util.Arrays;

class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] arr = new int[n + 1];  // Allocate size (n+1) for safe access
        Arrays.fill(arr, -1);        // Fill array with -1 to mark uncomputed values
        arr[0] = 0;
        arr[1] = 1;

        return helper(arr, n);
    }

    private int helper(int[] arr, int n) {
        if (arr[n] != -1) {  // Check if the value is already computed
            return arr[n];
        }

        arr[n] = helper(arr, n - 1) + helper(arr, n - 2); // Correct Fibonacci formula
        return arr[n];
    }
}