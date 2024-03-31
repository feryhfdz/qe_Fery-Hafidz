public class soal6 {
    public static int findMaxSubarraySum(int[] arr, int k) {
        // Initialize variables to track current window sum and maximum sum seen so far.
        int windowSum = 0;
        int maxSum = 0;
    
        // Iterate through the array.
        for (int i = 0; i < arr.length; i++) {
          // Add the current element to the window sum.
          windowSum += arr[i];
    
          // If the window size is equal to 'k', update the maxSum if necessary.
          if (i == k - 1) {
            maxSum = windowSum;
          }
    
          // Otherwise, subtract the first element of the window from the window sum and continue.
          else if (i >= k) {
            windowSum -= arr[i - k];
          }
        }
    
        return maxSum;
      }

  public static void main(String[] args) {
      // Contoh penggunaan
      int[] input1 = {2, 1, 5, 1, 3, 2};
      int k1 = 3;

      int[] input2 = {2, 3, 4, 1, 5};
      int k2 = 2;

      int maxSum1 = findMaxSubarraySum(input1, k1);
      int maxSum2 = findMaxSubarraySum(input2, k2);

      System.out.println("Input: [2, 1, 5, 1, 3, 2], k=" + k1);
      System.out.println("Output: " + maxSum1);

      System.out.println("\nInput: [2, 3, 4, 1, 5], k="+ k2);
      System.out.println("Output: " + maxSum2);
  }
}

