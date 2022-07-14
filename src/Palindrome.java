
public class Palindrome {

    public static void main(String[] args) {
        boolean result = isPalindrome("abckba");
        System.out.println(result);
    }
    public static boolean isPalindrome(String text) {

//        If there is no string or the length is 0, It's not a Palindrome.
        if(text == null || text.length() == 0) {
            return false;
        }

//        Convert the text to Lower Case
        String check = text.toLowerCase();

//        Define loop parameters for ease of code
        int start = 0;
        int finish = check.length() - 1;

//        General Check for a Palindrome (lowercase letters matching)
        while (start < finish) {
            if (check.charAt(start) != check.charAt(finish)) {
                return false;
            }
            start++;
            finish--;
        }
        return true;
    }

}
