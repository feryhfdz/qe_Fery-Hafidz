import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = "76523752";
        String input2 = "1122";

        // Menemukan angka unik untuk setiap string
        ArrayList<Integer> uniqueNumbers1 = findUniqueNumbers(input1);
        ArrayList<Integer> uniqueNumbers2 = findUniqueNumbers(input2);

        // Menampilkan hasil
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + uniqueNumbers1);

        System.out.println("\nInput: \"" + input2 + "\"");
        System.out.println("Output: " + uniqueNumbers2);
    }

    private static ArrayList<Integer> findUniqueNumbers(String input) {
        // HashMap untuk menyimpan frekuensi angka
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Menghitung frekuensi setiap angka
        for (char c : input.toCharArray()) {
            int num = Character.getNumericValue(c);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Menyimpan angka yang hanya muncul sekali
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                uniqueNumbers.add(num);
            }
        }

        return uniqueNumbers;
    }
}