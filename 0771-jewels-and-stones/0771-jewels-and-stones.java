class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                char jchr=jewels.charAt(i);
                char schr=stones.charAt(j);
                if(jchr==schr){
                    count++;
                }
            } 
        }return count;
    }
}