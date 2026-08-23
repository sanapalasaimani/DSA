class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        String s1=s.toLowerCase();
        for(int i=0;i<s1.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))) sb.append(s1.charAt(i));
        }
        int p1=0,p2=sb.length()-1;
        while(p1<=p2){
            if(sb.charAt(p1)!=sb.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
}