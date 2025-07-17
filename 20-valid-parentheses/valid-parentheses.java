class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();

        Stack<Character> brac = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == '{') || (arr[i] == '(') || (arr[i] == '[')) {
                brac.push(arr[i]);
            } else {
                if (brac.isEmpty()){
                    return false;
                }
                char top = brac.pop();
                if ((arr[i] == '}' && top != '{') || (arr[i] == ')' && top != '(') || (arr[i] == ']' && top != '[')){
                    return false;
                }    
            }
        }
        return brac.isEmpty();
    }
}