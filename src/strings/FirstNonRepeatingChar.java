package strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "test"; //op -> h [t,e,s,r
        bruteForce(s);

        // O(N) optimized
        char uniqueChar = '_';
        for (char c: s.toCharArray()){

            if(s.indexOf(c) == s.lastIndexOf(c)){
                //System.out.println(s.charAt(j));
                uniqueChar = c;
                break;
            }
        }

        System.out.println(uniqueChar);


    }

    private static void bruteForce(String s) {

        char uniqueChar = '_';

        for(int i = 0; i < s.length(); i++){
            boolean seenDuplicate = false;
            for(int j = 0; j < s.length(); j++){

                if(s.charAt(j) == s.charAt(i) && i != j){
                    seenDuplicate = true;
                    break;
                }
            }
            if(!seenDuplicate){
                if(s.indexOf(String.valueOf(uniqueChar)) != -1
                        && s.indexOf(String.valueOf(uniqueChar)) < i){
                    break;
                }
                uniqueChar = s.charAt(i);
            }
        }

        System.out.println(uniqueChar);
    }
}
