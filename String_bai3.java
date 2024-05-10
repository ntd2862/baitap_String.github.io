import java.util.Scanner;

public class String_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một xâu ký tự: ");
        String inputString = scanner.nextLine();

        String normalizedString = chuanHoaXau(inputString);
        System.out.println("Xâu sau khi chuẩn hoá: " + normalizedString);

        scanner.close();
    }

    public static String chuanHoaXau(String input) {
        String[] words = input.trim().toLowerCase().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        return result.toString().trim();
    }
}
