package trie;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"florist","flower","floor"}; //op: flo

        //character by character matching (not using trie DS)
        lCP(arr);

        //using trie DS

    }

    private static void lCP(String[] arr) {

        /**
         *  Time complexity -> O(arr * minlen)
         */

        int minLen = findMinimumLength(arr);
        String firstStr = arr[0];
        StringBuilder builder = new StringBuilder();
        for(int k = 1; k < arr.length; k++){

            for(int m = 0; m < minLen; m++){
                char currChar = arr[k].charAt(m);
                if(firstStr.charAt(m) != currChar){
                    break;
                }
                if(builder.indexOf(String.valueOf(currChar)) == -1){
                    builder.append(arr[k].charAt(m));
                }
            }
        }
        System.out.println(builder);
    }

    private static int findMinimumLength(String[] arr) {

        int minLen = arr[0].length();
        for(int i = 1; i < arr.length; i++){

            if(arr[i].length() < minLen){
                minLen = arr[i].length();
            }
        }
        return minLen;
    }


}
