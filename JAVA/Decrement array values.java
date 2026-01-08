class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 1; // or arr[i]--;
        }
        return arr;
    }
}
