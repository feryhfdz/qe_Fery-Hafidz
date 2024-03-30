public class MaxSubSum {
  public static int findMaxSubSum(int[] arr, int k) {
      if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
          return 0;
      }

      int maxSum = 0;
      int windowSum = 0;

      // Menghitung jumlah elemen pertama dalam jendela awal
      for (int i = 0; i < k; i++) {
          windowSum += arr[i];
      }

      maxSum = windowSum;

      // Menggeser jendela ke kanan dan memperbarui jumlahnya
      for (int i = k; i < arr.length; i++) {
          windowSum = windowSum - arr[i - k] + arr[i];
          maxSum = Math.max(maxSum, windowSum);
      }

      return maxSum;
  }

  public static void main(String[] args) {
      // Contoh penggunaan
      int[] input1 = {2, 1, 5, 1, 3, 2};
      int k1 = 3;

      int[] input2 = {2, 3, 4, 1, 5};
      int k2 = 2;

      int result1 = findMaxSubSum(input1, k1);
      int result2 = findMaxSubSum(input2, k2);

      System.out.println("Input: [2, 1, 5, 1, 3, 2], k=3");
      System.out.println("Output: " + result1);

      System.out.println("\nInput: [2, 3, 4, 1, 5], k=2");
      System.out.println("Output: " + result2);
  }
}

