class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, maxlen=0;
        int[] hash = new int[256]; 
        for(int i=0; i<256; i++){
            hash[i] = -1;
        }
        while(r<s.length()){
            char current = s.charAt(r);
            if(hash[current] != -1){
                if(hash[current] >= l){
                    l = hash[current]+1;
                }
            }
            int length = r-l+1;
            maxlen = Math.max(length, maxlen);
            hash[current] = r;
            r++;

        }
        return maxlen;
    }
}