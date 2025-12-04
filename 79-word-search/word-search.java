public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, vis))
                    return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] b, String w, int idx, int r, int c, boolean[][] vis) {
        if (idx == w.length()) return true;
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length) return false;
        if (vis[r][c] || b[r][c] != w.charAt(idx)) return false;
        vis[r][c] = true;
        boolean found =
            dfs(b, w, idx + 1, r + 1, c, vis) ||
            dfs(b, w, idx + 1, r - 1, c, vis) ||
            dfs(b, w, idx + 1, r, c + 1, vis) ||
            dfs(b, w, idx + 1, r, c - 1, vis);
        vis[r][c] = false;
        return found;
    }
}
