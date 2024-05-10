import java.util.Scanner;

public class String_bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một xâu ký tự: ");
        String inputString = scanner.nextLine();

        String resultString = chuyenXenKe(inputString);
        System.out.println("Kết quả sau khi chuyển đổi: " + resultString);

        scanner.close();
    }

    public static String chuyenXenKe(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                result.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
