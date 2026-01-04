public class program13 {}

//Q13- container with most water

//solution 1

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        int maxim=0;
        int h=0;
        int d=0;
        while(l<r){
            d=r-l;
            if(height[l]<height[r]){
                h=height[l];
            }
            else{
                h=height[r];
            }
            area=d*h;
            maxim=Math.max(area,maxim);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }    
       return maxim;    
}
}      