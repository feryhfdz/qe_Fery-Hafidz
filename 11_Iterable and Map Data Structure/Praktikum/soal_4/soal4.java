import java.util.Arrays;
import java.util.HashSet;

public class soal4 {

    public static int[] findUniqueElements(int[] arrayy1, int[] arrayy2) {
        HashSet<Integer> set = new HashSet<>(); // Set untuk menyimpan elemen unik dari arr1
        for (int num : arrayy2) {
            set.add(num); // Menambahkan elemen arr2 ke set
        }

        int[] uniqueElements = new int[arrayy1.length]; // Array untuk menyimpan elemen unik
        int index = 0;
        for (int num : arrayy1) {
            if (!set.contains(num)) { // Jika elemen tidak ada di set
                uniqueElements[index++] = num; // Tambahkan ke array uniqueElements
            }
        }

        return Arrays.copyOf(uniqueElements, index); // Mengembalikan array uniqueElements
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        System.out.println("Input " + Arrays.toString(arr1) + " dan " + Arrays.toString(arr2) );
        System.out.println(Arrays.toString(findUniqueElements(arr1, arr2)));

        arr1 = new int[]{3, 8};
        arr2 = new int[]{2, 8};
        System.out.println("\nInput " + Arrays.toString(arr1) + " dan " + Arrays.toString(arr2) );
        System.out.println(Arrays.toString(findUniqueElements(arr1, arr2)));
    }
}
