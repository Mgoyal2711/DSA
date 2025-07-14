class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int ans = 1;

            for (int j = 0; j<=i; j++) {
                row.add(ans);
                // ans = ans * (numRows - i);
                // ans = ans / i;
                ans = ans * (i - j) / (j + 1);

            }

            temp.add(row);
        }
        return temp;
    }
}