class Solution {
    public int countCommas(int n) {
        long ans = 0;

        for (long commas = 1, start = 1000; start <= n; commas++) {
            long end = start * 1000 - 1;
            long count = Math.min((long) n, end) - start + 1;

            ans += count * commas;
            start *= 1000;
        }

        return (int) ans;
    }
}