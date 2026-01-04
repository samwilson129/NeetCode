public class program10 {}

//Q10- valid palindrome

//solution 1
class Solution1 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left=0;
        int right=s.length()-1;
        while(right>left){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
}}

