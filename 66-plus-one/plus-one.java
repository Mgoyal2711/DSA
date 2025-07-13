class Solution {
    public int[] plusOne(int[] digits) {
        // int x = digits.length;
        // int[] arr = new int[x + 1];
        // int n = arr.length;
        // for (int i = 0; i < x; i++) {
        //     if (digits[x - 1] < 9) {
        //         digits[x - 1] = digits[x - 1] + 1;
        //         return digits;
        //     }
        //     if (digits[x - 1] == 9) {
        //         for (int j = 0; i < arr.length; j++) {
        //             arr[i] = digits[i];
        //         }
        //         int n = arr.length;
        //         arr[n - 1] = 0;
        //         arr[n - 2] = 1;
        //         return arr;
        //     }
        // }
        // if(digits[x-1] < 9){
        //     return digits;
        // }else {
        //     return arr;
        // }

        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }    
            digits[i] = 0;
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return arr;
        
    }
}