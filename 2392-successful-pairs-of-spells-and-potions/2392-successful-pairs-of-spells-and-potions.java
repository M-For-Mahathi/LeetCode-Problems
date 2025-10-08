    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            Arrays.sort(potions);
            int n = spells.length;
            int m = potions.length;
            int[] pairs = new int[n];

            for (int i = 0; i < n; i++){
                int spell = spells[i];
                
                int l = 0, r = m-1, index = m;
                while (l <= r){
                    int mid = l + (r-l)/2;
                    if ((long)spell * potions[mid] >= success){
                        index = mid;
                        r = mid-1;
                    }else{
                        l = mid+1;
                    }
                }
                pairs[i] = m - index;
            }
            return pairs;
        }
    }