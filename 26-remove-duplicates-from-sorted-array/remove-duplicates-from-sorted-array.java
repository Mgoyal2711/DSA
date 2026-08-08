class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[pointer]){
                nums[pointer+1] = nums[i];
                pointer++;
            }
        }
        return pointer+1;
    }
}