import java.util.Set;
import java.util.HashSet;


public class program9 {}

//Q9- longest consecutive subsequence

//solution 1
class Solution1 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer>s1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s1.add(nums[i]);
        }
        int longest=0;
        int start=nums[0];
        int length=0;
        for(int i:s1){
            if(s1.contains(i-1)!=true){
                start=i;
                length=1;
            }
            while(s1.contains(start+1)==true){
                start++;
                length++;
            }
            longest=Math.max(length,longest);
        }
        return longest;
    }
}
