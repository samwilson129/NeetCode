import java.util.List;
import java.util.ArrayList;
public class program6 {}

//Q6 encode and decode strings

//solution 1
class Solution1 {

    public String encode(List<String> strs) {
        String result="";
        for(String word:strs){
            result=result+word.length()+"#"+word;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String>l1=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            j++;
            l1.add(str.substring(j,j+length));
            i=j+length;
        }
        return l1;
    }
}

