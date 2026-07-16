class PalindromeNumber {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int original = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (original == rev)
            System.out.println(original + " is a palindrome");
        else
            System.out.println(original + " is not a palindrome");
    }
}