import java.util.Arrays;

public class TwoSum {
    public static int[] findPair(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Melakukan iterasi sampai pointer bertemu
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // Jika ditemukan pasangan yang sesuai, kembalikan indeksnya
                return new int[]{left, right};
            } else if (sum < target) {
                // Jika jumlahnya terlalu kecil, pindahkan pointer kiri ke kanan
                left++;
            } else {
                // Jika jumlahnya terlalu besar, pindahkan pointer kanan ke kiri
                right--;
            }
        }

        // Jika tidak ditemukan pasangan yang sesuai, kembalikan array kosong
        return new int[0];
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        int[] input1 = {1, 2, 3, 4, 6};
        int target1 = 6;

        int[] input2 = {2, 5, 9, 11};
        int target2 = 11;

        int[] result1 = findPair(input1, target1);
        int[] result2 = findPair(input2, target2);

        System.out.println("Input: " + Arrays.toString(input1) + ", target=" + target1);
        System.out.println("Output: " + Arrays.toString(result1));

        System.out.println("\nInput: " + Arrays.toString(input2) + ", target=" + target2);
        System.out.println("Output: " + Arrays.toString(result2));
    }
}

