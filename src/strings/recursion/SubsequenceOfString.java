package strings.recursion;

public class SubsequenceOfString {
    public static void main(String[] args) {

        String s1 = "abcde", s2 = "bc"; //check if s2 is subsequence of s1
        System.out.println(isSubsequence(s1, s2));

    }


    private static boolean isSubsequence(String s1, String s2) {

        //base case here
        if(s1.length() == 0 || s2.length() == 0) return true;
        if(s2.length() == 0 && s1.length() != 0) return false;
        // check if last character of s2 matches with s1
        if(s2.charAt(s2.length()-1) == s1.charAt(s1.length()-1)) {
            //recur without last char of s1
            return isSubsequence(s1.substring(0,s1.length()-1), s2.substring(0,s2.length() - 1));
        } else {
            return isSubsequence(s1.substring(0,s1.length()-1), s2);
        }


    }
}
