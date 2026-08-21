class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a=s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]>a[j]){
                a[i]=a[j];
            }
            else if(a[i]<a[j]){
                a[j]=a[i];
            }
            i++;
            j--;
        }
        return new String(a);
    }
}