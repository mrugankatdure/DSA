package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {

    public static void main(String[] args) {

        String s = "tacact"; // [1,4]
        String t = "cat";

        List<Integer> indicesList = findAllAnagrams(s, t);
        System.out.println(indicesList);
        //brute force approach
        //findAllAnagramsUsingBF(s,t);

    }

    private static void findAllAnagramsUsingBF(String s, String t) {

        int strtIndex;
        ArrayList<Integer> indicesList = new ArrayList<>();
        for(int i=0; i < s.length(); i++){
            strtIndex = 0;
            for(int j=0; j < t.length(); j++){

                if(t.charAt(j) == s.charAt(i)){
                    //do something
                }

            }
            strtIndex = i;
            indicesList.add(strtIndex);
        }


    }

    private static List<Integer> findAllAnagrams(String s, String t) {

        List<Integer> indicesList = new ArrayList<>();
        boolean isAnagram;

        if(s.length() < t.length()) return indicesList;

        int ptr1 = 0;
        int ptr2 = 0;

        int[] charCnt1 = new int[26];
        int[] charCnt2 = new int[26];

        for(int i = 0; i < t.length(); i++){
            charCnt1[t.charAt(i) - 'a']++;
        }

        //sliding window technique O(N)
        while(ptr1 < s.length()){

            while(ptr2 < t.length()){
                charCnt2[s.charAt(ptr1) - 'a']++;
                ptr1++;
                ptr2++;
            }

            isAnagram = checkIfAnagram(charCnt1, charCnt2, t);
            if(isAnagram){
                indicesList.add(ptr1 - t.length() + 1);
            }

            //ptr1 = ptr2;
            ptr2 = 0;
        }
        return indicesList;
    }

    private static boolean checkIfAnagram(int[] charCnt1, int[] charCnt2, String t){

        boolean isAnagram = true;
        for(int i=0; i<t.length(); i++){

            if(charCnt1[t.charAt(i) - 'a'] != charCnt2[t.charAt(i) - 'a']){
                isAnagram = false;
                break;
            }
        }
        Arrays.fill(charCnt2, 0);
        return isAnagram;
    }
}
