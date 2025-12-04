class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        per(nums, 0, res);
        return res;
    }
    void per(int[] nums, int idx, ArrayList<List<Integer>> res) {
        if (idx == nums.length) { 
            List<Integer> per = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) { 
                per.add(nums[i]); 
            }
            res.add(per); 
            return; 
        }
        for (int i = idx; i < nums.length; i++) { 
            swap(nums, idx, i); 
            per(nums, idx + 1, res); 
            swap(nums, idx, i);
        }
    }
    void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
