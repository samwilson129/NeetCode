public class program14 {}

//Q14- trapping rainwater

//solution 1
class Solution1 {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=height[left];
        int rightmax=height[right];
        int water=0;
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,left);
                water+=leftmax-height[left];
            }
            else{
                right--;
                rightmax=Math.max(rightmax,right);
                water+=rightmax-height[right];
            }
        }
        return water;
    }
}