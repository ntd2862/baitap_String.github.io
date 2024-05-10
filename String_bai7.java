import java.util.Scanner;

public class String_bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập xâu s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Nhập xâu s2: ");
        String s2 = scanner.nextLine();

        while (s1.contains(s2)) {
            int index = s1.indexOf(s2);
            s1 = s1.substring(0, index) + s1.substring(index + s2.length());
        }

        System.out.println("Xâu sau khi loại bỏ s2 trong s1: " + s1);
    }
}
