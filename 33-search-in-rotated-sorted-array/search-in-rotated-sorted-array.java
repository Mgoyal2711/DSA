class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}