import java.util.Map;
import java.util.HashMap;
public class program3 {}

//Q3- two sum

//solution 1
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(target==nums[i]+nums[j] && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
}}

//solution 2
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(h1.containsKey(complement)){
                return new int[]{i,h1.get(complement)};
            }
            else{
                h1.put(nums[i],i);
            }
        }
        return new int[]{0,0};
}}