class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> map = new TreeMap<>();
        for (int p : power) map.put(p, map.getOrDefault(p, 0L) + p);

        long prev1 = 0, prev2 = 0, prev3 = 0;
        int prevKey1 = -3, prevKey2 = -3, prevKey3 = -3;

        for (int key : map.keySet()) {
            long currDamage = map.get(key);
            long bestPrev = 0;

            if (key - prevKey1 > 2) bestPrev = prev1;
            else if (key - prevKey2 > 2) bestPrev = prev2;
            else if (key - prevKey3 > 2) bestPrev = prev3;

            long curr = currDamage + bestPrev;

            // shift window
            prev3 = prev2; prevKey3 = prevKey2;
            prev2 = prev1; prevKey2 = prevKey1;
            prev1 = Math.max(prev1, curr); prevKey1 = key;
        }

        return prev1; 
    }
}