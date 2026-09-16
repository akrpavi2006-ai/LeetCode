class Solution {
    public String sortString(String s) {
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        String result="";
        while(result.length()<s.length()){
            for(int i=0;i<26;i++){
                if(count[i]>0){
                    result+=(char)('a'+i);
                    count[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(count[i]>0){
                    result+=(char)('a'+i);
                    count[i]--;
                }
            }
        }
        return result;
    }
}