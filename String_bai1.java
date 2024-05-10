public class String_bai1 {

    public static void main(String[] args) {
        System.out.println("Palindrome numbers with 6 digits:");
        listSixDigitPalindromes();
    }


    public static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
        String reversed = new StringBuilder(strNum).reverse().toString();
        return strNum.equals(reversed);
    }


    public static void listSixDigitPalindromes() {
        for (int i = 100000; i <= 999999; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }
}
