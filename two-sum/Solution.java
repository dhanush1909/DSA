import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Solution 1 - Using 2 loops O(n*n)
       // for(int i=0;i<nums.length;i++) {
       //     for(int j=i+1;j<nums.length;j++) {
       //         if(nums[i] + nums[j] == target) {
       //             return new int[]{i,j};
       //         }
       //     }
       // } 
       //  return null;
        
        
        // Solution 2 - failed attempt, tried using sort by it alters the index
        // int n = nums.length;
        // Arrays.sort(nums);
        // int i=0, j=n-1;
        // while(i<n && j>=0) {
        //     int sum = nums[i] + nums[j];
        //     if(i != j && sum == target) {
        //         return new int[]{i,j};
        //     }
        //     if(sum > target)
        //         j--;
        //     else
        //         i++;
        // }
        // return null;
        
        //Soution 3 - 2 phase hash map
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i];
        //     if (map.containsKey(complement) && map.get(complement) != i) {
        //         return new int[] { i, map.get(complement) };
        //     }
        // }
        // return null;
        
        //solution 4 - one phase hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}