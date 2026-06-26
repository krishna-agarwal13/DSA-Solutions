class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
      
        int[] leftIncreasing = new int[n];
        int[] rightDecreasing = new int[n];
      
        Arrays.fill(leftIncreasing, 1);
        Arrays.fill(rightDecreasing, 1);
      
        for (int i = 1; i < n; ++i) {
            if (arr[i] > arr[i - 1]) {
                leftIncreasing[i] = leftIncreasing[i - 1] + 1;
            }
        }
      
        int maxMountainLength = 0;
      
        for (int i = n - 2; i >= 0; --i) {
            if (arr[i] > arr[i + 1]) {
                rightDecreasing[i] = rightDecreasing[i + 1] + 1;
              
                if (leftIncreasing[i] > 1) {
                    int currentMountainLength = leftIncreasing[i] + rightDecreasing[i] - 1;
                    maxMountainLength = Math.max(maxMountainLength, currentMountainLength);
                }
            }
        }
      
        return maxMountainLength;
    }
}