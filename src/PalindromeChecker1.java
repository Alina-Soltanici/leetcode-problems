public class PalindromeChecker1 {
    public static boolean checkIfIntegerIsPalindrome(int number) {
        if(number < 0) return false;

        int original = number;
        int reversedNumber = 0;

        while(number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number/=10;
        }
        return original == reversedNumber;
    }
}
