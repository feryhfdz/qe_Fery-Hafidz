public class soal5 {
  public static int removeDuplicates(int[] nums) {
      if (nums.length == 0) {
        return 0;
      }

      int writeIndex = 1; // Mulai dengan satu karena elemen pertama pasti unik

      // Membandingkan elemen saat ini dengan elemen sebelumnya
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] != nums[i - 1]) {
              // Jika elemen saat ini berbeda dengan elemen sebelumnya
              // Salin elemen saat ini ke posisi yang unik
              nums[writeIndex] = nums[i];
              writeIndex++;
          }
      }
      return writeIndex;
  }

  public static void main(String[] args) {
      // Contoh penggunaan
      int[] input1 = {2, 3, 3, 3, 6, 9, 9};
      int[] input2 = {2, 2, 2, 11};

      System.out.println("Input: [2, 3, 3, 3, 6, 9, 9]");
      System.out.println("Output: " + removeDuplicates(input1));

      System.out.println("\nInput: [2, 2, 2, 11]");
      System.out.println("Output: " + removeDuplicates(input2));
  }
}
