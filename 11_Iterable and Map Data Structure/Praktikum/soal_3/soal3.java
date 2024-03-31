import java.util.Arrays;

public class soal3 {
    public static int[] findPair(int[] arrayy, int target) {
        int left = 0;
        int right = arrayy.length - 1;

        while (left < right) {
            int Sum = arrayy[left] + arrayy[right];
            if (Sum == target) {
                return new int[]{left, right};
            } else if (Sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = findPair(input1, target1);
        
        System.out.println("Input: " + Arrays.toString(input1) + ", target: " + target1);
        System.out.println("Output: " + Arrays.toString(result1));

        int[] input2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findPair(input2, target2);

        System.out.println("\nInput: " + Arrays.toString(input2) + ", target: " + target2);
        System.out.println("Output: " + Arrays.toString(result2));
    }
}

