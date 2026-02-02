class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int miss = n;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
    // return miss;?
}