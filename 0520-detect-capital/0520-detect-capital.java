class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(word.charAt(0)==Character.toUpperCase(word.charAt(0))){
            String remaining=word.substring(1);
            if(remaining.equals(remaining.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}