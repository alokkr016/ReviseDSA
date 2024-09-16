package alok.string;

public class LengthOfLastWord {
    public int lengthOfLastWord(final String A) {
        String str[] = A.trim().split("\\s");
        return str[str.length - 1].length();
    }

    public static void main(String[] args) {
        String str = " hello world ";

        System.out.println(new LengthOfLastWord().lengthOfLastWord(str));
    }
}
