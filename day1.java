# second largest number
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int smx = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[n-1]){
                smx = arr[i];
                break;
            }
        }
        if(smx == Integer.MIN_VALUE) return -1;
        return smx;
    }
}
