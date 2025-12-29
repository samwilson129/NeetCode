import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class program1{}

//Q1-contains duplicate

//solution 1
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }}

//solution 2
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>s1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s1.contains(nums[i])){
                return true;
            }
            else{
                s1.add(nums[i]);
            }
        }
        return false;
    }}

