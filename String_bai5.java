import java.util.Scanner;

public class String_bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập họ tên theo cấu trúc họ...đệm...tên: ");
        String fullName = scanner.nextLine();


        String reorderedName = reorderFullName(fullName);


        System.out.println("Biểu diễn mới của họ tên: " + reorderedName);

        scanner.close();
    }


    public static String reorderFullName(String fullName) {
        String[] parts = fullName.split("\\s+");
        if (parts.length < 3) {

            return fullName;
        }


        String firstName = parts[parts.length - 1];

        String lastName = parts[0];

        StringBuilder middleName = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            middleName.append(parts[i]).append(" ");
        }


        middleName.deleteCharAt(middleName.length() - 1);


        return firstName + " " + lastName + " " + middleName.toString();
    }
}
