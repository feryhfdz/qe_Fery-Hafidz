import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class soal1 {
    public static void main(String[] args) {
        //input 1
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};
        String[] mergedArray1 = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray1));

        //input 2
        String[] array3 = {"lee", "jin"};
        String[] array4 = {"kazuya", "panda"};
        String[] mergedArray2 = mergeArrays(array3, array4);
        System.out.println(Arrays.toString(mergedArray2));
    }

    public static String[] mergeArrays(String[] arrays1, String[] arrays2) {
        // Gunakan LinkedHashSet untuk mempertahankan urutan dan menghilangkan duplikat
        Set<String> set = new LinkedHashSet<>(); 
        set.addAll(Arrays.asList(arrays1));
        set.addAll(Arrays.asList(arrays2));
        return set.toArray(new String[0]);
    }
}
