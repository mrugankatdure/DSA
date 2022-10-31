package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {


    public static void main(String[] args) {


        String[] strs = {"tan", "nat", "cat", "tac", "tap"}; //[(tan,nat) (cat,tac) (tap)]

        HashMap<String, List<String>> listHashMap = new HashMap<>();

        for(String s: strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(! listHashMap.containsKey(key)){
                List<String> keyList = new ArrayList<>();
                keyList.add(s);
                listHashMap.put(key, keyList);
            }else {
                listHashMap.get(key).add(s);
            }
        }
        System.out.println(listHashMap);
    }
}
