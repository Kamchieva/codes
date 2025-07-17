class Solution {
    public int longestConsecutive(int[] nums) {
        // Add each number to a HashSet.
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
 
       // {99, 100, 4, 200, 1, 3, 2}
 
       // [1, 2, 3, 4] [99, 100] [200]
 
        // T: O(n)
        // S: O(n)
   
        int longest_streak = 0;
        for (int n : set) {
            // if (n is the beginning of a streak)
            // Lookup works in O(1).
            if (!set.contains(n - 1)) {
                int streak_start = n;
                int streak_end = n;
 
                // Walk the streak to the last element.
                while (set.contains(streak_end + 1)) {
                    streak_end++;
                }
 
                // Update the value of the longest streak with the length of the current one.
                longest_streak = Math.max(longest_streak, streak_end - streak_start + 1);
            }
        }
        return longest_streak;
    }
}
