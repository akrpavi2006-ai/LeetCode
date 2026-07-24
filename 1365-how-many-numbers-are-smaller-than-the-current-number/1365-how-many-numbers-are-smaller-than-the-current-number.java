class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    arr.add(nums[i]);
                }
            }
            ans[i]=arr.size();
        }
        return ans;
    }
}