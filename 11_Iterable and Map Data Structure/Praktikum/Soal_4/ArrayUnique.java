import java.util.ArrayList;
import java.util.List;

public class ArrayUnique {
    public static int[] findUnique(int[] arr1, int[] arr2) {
        List<Integer> uniqueList = new ArrayList<>();

        // Menyimpan elemen unik dari arr pertama
        for (int num : arr1) {
            if (!contains(arr2, num)) {
                uniqueList.add(num);
            }
        }

        // Mengonversi list ke dalam array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    // Metode untuk memeriksa apakah suatu angka terdapat dalam arr
    private static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {1, 3, 5, 10, 16};

        int[] result1 = findUnique(input1, input2);

        System.out.println("Input: " + arrayToString(input1) + " dan " + arrayToString(input2));
        System.out.println("Output: " + arrayToString(result1));

        int[] input3 = {3, 8};
        int[] input4 = {2, 8};

        int[] result2 = findUnique(input3, input4);

        System.out.println("\nInput: " + arrayToString(input3) + " dan " + arrayToString(input4));
        System.out.println("Output: " + arrayToString(result2));
    }

    // Metode pembantu untuk mencetak arr sebagai string
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
