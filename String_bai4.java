import java.util.Scanner;

public class String_bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một xâu ký tự: ");
        String input = scanner.nextLine();

        String longestWord = findLongestWord(input);
        int position = input.indexOf(longestWord);

        System.out.println("Từ dài nhất trong xâu là: " + longestWord);
        System.out.println("Xuất hiện ở vị trí: " + position);
    }

    public static String findLongestWord(String input) {
        String[] words = input.split("\\s+");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
