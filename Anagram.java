import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1.length != ch2.length) {
            System.out.println("It is not a Anagram string");
            System.exit(0);
        } else {
            boolean flag = true;
            for (int i = 0; i < ch1.length && i < ch2.length; i++) {
                if (ch1[i] != ch2[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("It is a Anagram string");
            else
                System.out.println("It is not a Anagram string");
        }

    }
}
