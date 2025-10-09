class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
            int m = mana.length;
            long[] prePrev = new long[n];
            prePrev[0] = (long) skill[0] * mana[0];
            for (int i = 1; i < n; i++) {
                prePrev[i] = prePrev[i - 1] + (long) skill[i] * mana[0];
            }

            long S = 0L;
            long[] preCurr = new long[n];

            for (int j = 1; j < m; j++) {
                preCurr[0] = (long) skill[0] * mana[j];
                for (int i = 1; i < n; i++) {
                    preCurr[i] = preCurr[i - 1] + (long) skill[i] * mana[j];
                }

                long maxDelta = Long.MIN_VALUE;
                for (int k = 0; k < n; k++) {
                    long leftSum = prePrev[k];
                    long rightPrefix = (k > 0 ? preCurr[k - 1] : 0L);
                    long delta = leftSum - rightPrefix;
                    if (delta > maxDelta) maxDelta = delta;
                }

                S += maxDelta;
                long[] tmp = prePrev;
                prePrev = preCurr;
                preCurr = tmp;
            }

            return S + prePrev[n - 1];
    }
}