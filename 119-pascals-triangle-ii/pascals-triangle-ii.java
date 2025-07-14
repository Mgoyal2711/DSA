class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        for (int j = 0; j <= rowIndex; j++) {
            row.add((int)ans);
            ans = ans * (rowIndex - j) / (j + 1);
        }
        return row;
    }
}