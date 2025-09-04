public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuffer s = new StringBuffer(str);

        String rev = s.reverse().toString();

        if (str.equals(rev)) {
            System.out.println("It is a palindrome string");
        } else {
            System.out.println("It is not a palindrome string");
        }
    }
}