class Solution {
    public int maxDistinct(String s) {
        boolean[] a=new boolean[26];
        int count=0;
        for(char ch:s.toCharArray()){
            if(!a[ch-'a']){
                a[ch-'a']=true;
                count++;
            }
        }
        return count;
    }
}