import java.util.Scanner;
class PalindromeProblem {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int inputValue = 0;
        while (x > inputValue) {
            inputValue = inputValue * 10 + x % 10;
            x /= 10;
        }
        return x == inputValue || x == inputValue / 10;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = obj.nextInt();
        
        boolean result = isPalindrome(x);
        
        System.out.println("Is palindrome: " + result);
        obj.close();
    }
}