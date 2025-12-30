import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class program4 {}

//Q4- group anagrams

//solution 1
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> h1=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] word=strs[i].toCharArray();
            Arrays.sort(word);
            String og=new String(word);
            if(h1.containsKey(og)!=true){
                h1.put(og,new ArrayList<>());
            }
            h1.get(og).add(strs[i]);
        }
        return new ArrayList<>(h1.values());
    }
}