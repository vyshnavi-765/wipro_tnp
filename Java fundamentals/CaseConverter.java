class CaseConverter {
    public static void main(String[] args) {

        char ch = 'a';   // Change the value as needed

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "-->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "-->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Invalid Character");
        }
    }
}