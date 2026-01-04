import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class program12 {}

//Q12- 3sum

//solution 1
class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l1=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                  continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(total>0){
                    k--;
                }
                else if(total<0){
                    j++;
                }
                else{
                    l1.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return l1;
    }
}
