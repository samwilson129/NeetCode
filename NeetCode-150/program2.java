import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class program2 {}

//Q2- valid anagram

//solution 1
class Solution1 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>h1=new HashMap<>();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(h1.get(ch)==null || h1.get(ch)<=0){
                return false;
            }
            else{
                h1.put(ch,h1.getOrDefault(ch,0)-1);
            }
        }
        return true;
    }
}

//solution 2
class Solution2 {
    public boolean isAnagram(String s, String t) {
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        if(Arrays.equals(tarr,sarr)){
            return true;
        }
        return false;
    }
}