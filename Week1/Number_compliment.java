class Solution {
    public int findComplement(int num) {
        int threshold = 1;
        while(num > threshold-1) threshold*=2;
        return num^(threshold-1);
    }
}