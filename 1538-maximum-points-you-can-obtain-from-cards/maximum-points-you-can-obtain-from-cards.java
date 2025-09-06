class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0;
        int rSum =0;
        int sum=0;
        for(int i=0; i<k; i++){
            lSum += cardPoints[i];
            
        }
        sum = lSum;
        int rIndex = cardPoints.length -1;
        for(int j=k-1; j>=0; j--){
            lSum -= cardPoints[j];
            rSum = rSum + cardPoints[rIndex];
            rIndex--;
            sum = Math.max(sum,lSum + rSum);
        }
        
        return sum;
    }
}