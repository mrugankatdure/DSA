package strings;

public class Anagrams {

    public static void main(String[] args) {

        String s1 = "cat", s2 = "tac";
        int[] asciiCnt = new int[26];
        boolean isAnagram = true;

        for(int i=0; i < s1.length(); i++ ){
            asciiCnt[s1.charAt(i) - 'a']++;
            asciiCnt[s2.charAt(i) - 'a']--;
        }

        for(int count: asciiCnt){
            if(count < 0){
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram);

    }

}
