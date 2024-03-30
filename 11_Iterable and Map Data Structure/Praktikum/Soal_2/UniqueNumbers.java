import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {
  public static List<Integer> findUniqueNumbers(String input) {
    int[] frequency = new int[10]; // Array untuk menyimpan frekuensi kemunculan angka 0-9

    // Menghitung frekuensi kemunculan setiap angka dalam input
    for (char digit : input.toCharArray()) {
      frequency[digit - '0']++;
    }

    // Membuat list untuk menyimpan angka yang hanya muncul sekali
    List<Integer> uniqueNumbers = new ArrayList<>();

    // Memeriksa setiap angka, jika hanya muncul sekali maka dimasukkan ke dalam list
    for (int i = 0; i < 10; i++) {
        if (frequency[i] == 1) {
          uniqueNumbers.add(i);
        }
    }
    return uniqueNumbers;  
    }

    public static void main(String[] args) {
        // Contoh input
        String input1 = "76523752";
        String input2 = "1122";

        List<Integer> output1 = findUniqueNumbers(input1);
        List<Integer> output2 = findUniqueNumbers(input2);

        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + output1);

        System.out.println("\nInput: \"" + input2 + "\"");
        System.out.println("Output: " + output2);
    }
}
