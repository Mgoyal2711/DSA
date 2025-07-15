class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                if (arr[i] == 'I' && arr[i + 1] == 'V') {
                    sum = sum + 4;
                    i++;
                    continue;
                }
                if (arr[i] == 'I' && arr[i + 1] == 'X') {
                    sum = sum + 9;
                    i++;
                    continue;
                }
                if (arr[i] == 'X' && arr[i + 1] == 'L') {
                    sum = sum + 40;
                    i++;
                    continue;
                }
                if (arr[i] == 'X' && arr[i + 1] == 'C') {
                    sum = sum + 90;
                    i++;
                    continue;
                }
                if (arr[i] == 'C' && arr[i + 1] == 'D') {
                    sum = sum + 400;
                    i++;
                    continue;
                }
                if (arr[i] == 'C' && arr[i + 1] == 'M') {
                    sum = sum + 900;
                    i++;
                    continue;
                }
            }
            if (arr[i] == 'I') {
                sum = sum + 1;
            }
            if (arr[i] == 'V') {
                sum = sum + 5;
            }
            if (arr[i] == 'X') {
                sum = sum + 10;
            }
            if (arr[i] == 'L') {
                sum = sum + 50;
            }
            if (arr[i] == 'C') {
                sum = sum + 100;
            }
            if (arr[i] == 'D') {
                sum = sum + 500;
            }
            if (arr[i] == 'M') {
                sum = sum + 1000;
            }
        }
        return sum;
    }
}
