class Solution {
    public boolean isPalindrome(int x) {
        // StringBuilder sb = new StringBuilder();
        // sb.append(x);
        // String reverse = sb.reverse().toString();
        // if(sb != reverse){
        //     return false;
        // }else return true;
        if(x < 0){
            return false;
        }
        String s = Integer.toString(x);
        int length = s.length();
        for(int i=0; i<length; i++){
            if(s.charAt(i) != s.charAt(length-1-i)){
                return false;
            }
        }return true;


    }
}