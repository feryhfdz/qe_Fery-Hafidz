public class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {
      if (nums == null || nums.length == 0) {
        return 0;
      }

      int uniqueCount = 1; // Mulai dengan satu karena elemen pertama pasti unik

      // Membandingkan elemen saat ini dengan elemen sebelumnya
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] != nums[i - 1]) {
              // Jika elemen saat ini berbeda dengan elemen sebelumnya
              // Salin elemen saat ini ke posisi yang unik
              nums[uniqueCount] = nums[i];
              uniqueCount++;
          }
      }
      return uniqueCount;
  }

  public static void main(String[] args) {
      // Contoh penggunaan
      int[] input1 = {2, 3, 3, 3, 6, 9, 9};
      int[] input2 = {2, 2, 2, 11};

      int result1 = removeDuplicates(input1);
      int result2 = removeDuplicates(input2);

      System.out.println("Input: [2, 3, 3, 3, 6, 9, 9]");
      System.out.println("Output: " + result1);

      System.out.println("\nInput: [2, 2, 2, 11]");
      System.out.println("Output: " + result2);
  }
}
