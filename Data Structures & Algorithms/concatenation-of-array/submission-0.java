class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int n2 = n * 2;
        int[] result = new int[n2];
        int i = 0;
        int k = 0;
        while (k < n2) {
            result[k] = nums[i];
            i = (i + 1) % n;
            k++;
        }
        return result;
    }
}