class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < n; i++){
            int a = nums[i];
            int b = target - a;

            if (index.containsKey(b)){
                return new int[]{index.get(b), i};
            }
            index.put(a, i);
        }
        return new int[]{};
    }
}