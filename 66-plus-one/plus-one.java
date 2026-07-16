class Solution {
    public int[] plusOne(int[] digits) {
        // int n = digits.length;
        // for(int i=n-1; i>=0; i--){
        //     if (digits[i] < 9) {
        //         digits[i] = digits[i] + 1;
        //         return digits;
        //     }    
        //     digits[i] = 0;
        // }
        // int[] arr = new int[n + 1];
        // arr[0] = 1;
        // return arr;
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : digits){
            list.add(num);
        }

        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i)<9){
                list.set(i, list.get(i)+1);

                int[] arr = new int[list.size()];
                for(int j=0; j<list.size(); j++){
                    arr[j] = list.get(j); 
                }

                return arr;
            }
            list.set(i,0);
        }

        list.add(0,1);
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}