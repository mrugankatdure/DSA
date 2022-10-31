package strings.recursion;

public class ReverseString {

    public static void main(String[] args) {
        String s = "welcome";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {

        //base case here
        if(s.length() == 0) return s;

        return reverseString(s.substring(1)) + s.charAt(0);

    }
}
