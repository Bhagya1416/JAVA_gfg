class Solution {
    public static int largest(int[] arr) {
        // Corrected code:
        int max = arr[0]; // Initialize max with the first element
        for (int i = 1; i < arr.length; i++) { // Start loop from the second element
            if (arr[i] > max) { // Compare current element with max
                max = arr[i]; // Update max if current element is larger
            }
        }
        return max; // Return the largest element found
    }
}
