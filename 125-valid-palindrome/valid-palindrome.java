class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        String news = str.toLowerCase();

        for(int i=0; i<news.length(); i++){
            if(news.charAt(i) != news.charAt(news.length()-1-i)){
                return false;
            }
        }return true;
    }
}