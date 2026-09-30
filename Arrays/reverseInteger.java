package Arrays;
class reverseInteger {
    public int reverse(int value) {
        int rev = 0;
        while(value != 0) {
            int digit = value % 10;
            value /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println("digit");
    }
}

// Outputs - Reversing the number Which is give by the User
