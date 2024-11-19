# reverse an array
class Solution {
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        // check overflow of 'd' size
        d = d%n;
        
        // reverse 0 to d elements: 1st 'd' elements
        reverse(arr, 0, d-1);
        // reverse d to n-1 elements: 1st n-d elements
        reverse(arr, d, n-1);
        // reverse 0 to n-1 elements: reverse the entire array
        reverse(arr, 0, n-1);
    }
}
