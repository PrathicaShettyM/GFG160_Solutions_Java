# majority vote
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            int num = ele.getKey();
            int freq = ele.getValue();
            
            if(freq > (n/3)){
                ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
