# next permutation
class Solution {
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    void nextPermutation(int[] arr) {
        int n = arr.length;
        // find the pivot position
        int pivot = -1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        // if pivot not found, then it is the last permutation
        // so reverse the entire array
        if(pivot == -1){
            reverse(arr, 0, n-1);
            return;
        }
        
        // swap the pivot position with the largest element to the right
        for(int i = n-1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot);
                break;
            }
        }
        
        // reverse from pivot+1th position to end
        reverse(arr, pivot+1, n-1);
        
        return;
    }
}
