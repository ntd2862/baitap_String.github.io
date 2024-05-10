import java.util.Arrays;

public class String_bai6 {
    public static void main(String[] args) {
        String sentence = "Nhập một câu không quá 20 từ";
        String[] words = sentence.split(" ");
        Arrays.sort(words);

        System.out.println("Các từ theo thứ tự Alphabet:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
