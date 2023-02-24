package strings.DP;

public class DistinctOccurences {


    public static void main(String[] args) {

        String s1 = "helelo", s2 = "hel"; // op -> 2 , ba, b |a|n| a = b  a

        int occurrences = countDistinctOccurrences(s1, s2, s1.length(), s2.length());
        System.out.println(occurrences);

    }

    private static int countDistinctOccurrences(String s1, String s2, int l1, int l2) {

        //base cases here
        if(l1 == 0 && l2 != 0) return 0;
        if(l1 == 0 || l2 == 0) return 1;

        if(s1.charAt(l1 - 1) == s2.charAt(l2 - 1)) {
            //if last 2 chars of both strings match then recur for 2 cases

           return countDistinctOccurrences(s1.substring(0, l1-1), s2, l1 -1, l2) + countDistinctOccurrences(s1.substring(0,l1-1), s2.substring(0, l2-1), l1-1, l2-1);
        } else {
           return countDistinctOccurrences(s1.substring(0, l1-1), s2, l1 -1, l2);
        }


    }
}
