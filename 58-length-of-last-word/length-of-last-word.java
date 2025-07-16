class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");

        String lastWord  = arr[arr.length-1];
        int count =0;

        char[] arr2 = lastWord.toCharArray();
        for(int i=0; i<arr2.length; i++){
            count++;
        }
        return count;

    }
}