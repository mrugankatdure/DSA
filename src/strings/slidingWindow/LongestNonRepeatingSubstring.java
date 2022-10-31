package strings.slidingWindow;

import java.util.HashMap;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {

        String s = "abbcd"; //dcba
       // bruteForce(s);
        hashMapMethodExtraSpace(s);
    }

    private static void hashMapMethodExtraSpace(String s) {
        int maxLen = 0;
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for(int right = 0, left = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            if(characterIntegerHashMap.containsKey(currentChar) &&
            characterIntegerHashMap.get(currentChar) >= left){
                left = characterIntegerHashMap.get(currentChar) + 1;
            }
            maxLen = Math.max(maxLen, (right - left) + 1);
            characterIntegerHashMap.put(currentChar, right);

        }
        System.out.println(maxLen);


    }

    private static void bruteForce(String s) {
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = i; j < s.length(); j++ ) {
                if(stringBuilder.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                stringBuilder.append(s.charAt(j));
                maxLen = Math.max(maxLen, stringBuilder.length());
            }
        }
        System.out.println(maxLen);
    }
}
