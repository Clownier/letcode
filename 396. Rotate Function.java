class Solution {
    public int maxRotateFunction(int[] A) {
        int res = 0;
        int length = A.length;
        if(0 == length||1 == length) return res;
        int F = 0;
        int sum = 0;
        for(int i = 0; i < length;i++){
            F += i*A[i];
            sum += A[i];
            res = F;
        }
        for(int i = 1;i<length;i++){
            F = F + sum - length*A[length-i];
            res = Math.max(res,F);
        }
        return res;
    }
}