class Solution {
    public int strStr(String haystack, String needle) {
        // char[] arr = haystack.toCharArray();
        // char[] arr = needle.toCharArray();

        int index = haystack.indexOf(needle);

        if(index != -1){
            return index;
        }
        return -1;
    }
}