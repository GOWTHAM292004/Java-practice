public class Factorial_Trailing_Zero {
    class Solution {
    public int trailingZeroes(int n) {
        int zerocount=0;
        while(n>0){
            n=n/5;
            zerocount+=n;
        }
        return zerocount;
    }
}
}
