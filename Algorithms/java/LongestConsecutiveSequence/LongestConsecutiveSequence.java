// Source : https://leetcode.com/problems/longest-consecutive-sequence/
// Author : Rokas Mitka
// Date   : 2023-11-05

/*****************************************************************************************************************
* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
*
* You must write an algorithm that runs in O(n) time.
*
* 
*
* Example 1:
* 
* Input: nums = [100,4,200,1,3,2]
* Output: 4
* Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
* Example 2:
* 
* Input: nums = [0,3,7,2,5,8,4,6,0,1]
* Output: 9
* 
*
* Constraints:
*
* 0 <= nums.length <= 105
* -109 <= nums[i] <= 109
*****************************************************************************************************************/

lass Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();

        for (int num : nums) {
            num_set.add(num);
        }
        int max_sequence_length = 0;

        for (int i=0; i<nums.length; i++) {
            int current_num = nums[i];
            int current_sequence_length = 1;

            if (!num_set.contains(current_num-1)) {
                while (num_set.contains(current_num + 1)) {
                    current_num += 1;
                    current_sequence_length += 1;
                }

                max_sequence_length = Math.max(max_sequence_length, current_sequence_length);
            }
        }

        return max_sequence_length;
    }
}
