class Solution {
    public boolean wordPattern(String pattern, String s) {
        int answer = 0;
        char[] arr = pattern.toCharArray();
        String[] arr2 = s.split(" ");
        int n = arr.length;
        if(n != arr2.length) return false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]  && !arr2[i].equals(arr2[j]))
                    return false;
                if (arr[i] != arr[j] && arr2[i].equals(arr2[j]))
                    return false;
            }
        }
        return true;
    }
}