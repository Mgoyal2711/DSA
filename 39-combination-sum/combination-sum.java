import java.util.*;
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] c, int idx, int t, List<Integer> cur, List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (idx == c.length || t < 0) return;
        cur.add(c[idx]);
        backtrack(c, idx, t - c[idx], cur, res);
        cur.remove(cur.size() - 1);
        backtrack(c, idx + 1, t, cur, res);
    }
}
