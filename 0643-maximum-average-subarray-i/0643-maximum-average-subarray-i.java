class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int windowSum=sum;
        int max=sum;
        for(int i=k;i<nums.length;i++){
            windowSum=windowSum-nums[i-k]+nums[i];
            if(windowSum>max){
                max=windowSum;
            }
        }
        return (double) max/k;
    }
}