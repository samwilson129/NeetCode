import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class program5 {}

//Q5- top k frequent elements

//solution 1
class Solution1 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[]bucket=new ArrayList[nums.length+1];
        for(int num:h1.keySet()){
            int freq=h1.get(num);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[]res=new int[k];
        int idx=0;
        for(int i=bucket.length-1;i>=0 && idx<k;i--){
            if(bucket[i]!=null){
            for(int num:bucket[i]){
                res[idx++]=num;
                if(idx>k){
                    break;
                }
            }
            }
        }
        return res;
    }
}