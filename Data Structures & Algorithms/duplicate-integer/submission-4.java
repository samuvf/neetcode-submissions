class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsWhithoutDuplicates = new HashSet<>();
        for(int n : nums) {
            numsWhithoutDuplicates.add(n);
        }
        return nums.length > numsWhithoutDuplicates.size();
    }
}