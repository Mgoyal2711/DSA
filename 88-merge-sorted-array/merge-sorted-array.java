class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;

        for(int j=0; j<nums2.length; j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        // for(int i=0; i<nums1.length; i++){
        //     System.out.print(nums1[i]);
        // }
    }
}