// Source : https://leetcode.com/problems/top-k-frequent-elements/
// Author : Rokas Mitka
// Date   : 2023-10-24

/*******************************************************************************************************************************************
* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
*
* 
*
* Example 1:
*
* Input: nums = [1,1,1,2,2,3], k = 2
* Output: [1,2]
* Example 2:
*
* Input: nums = [1], k = 1
* Output: [1]
* 
*
* Constraints:
*
* 1 <= nums.length <= 105
* -104 <= nums[i] <= 104
* k is in the range [1, the number of unique elements in the array].
* It is guaranteed that the answer is unique.
*******************************************************************************************************************************************/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry entry : map.entrySet()) {
            pq.add(entry);
        }

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = pq.poll().getKey();
        }
        return output;
    }
}
