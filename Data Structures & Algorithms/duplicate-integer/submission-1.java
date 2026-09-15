class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : nums) {
            if (arr.contains(n)) return true;
            arr.add(n);
        }

        return false;
    }
}