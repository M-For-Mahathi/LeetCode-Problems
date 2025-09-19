class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            q.offer(i);
        }
    Arrays.sort(deck);
    for (int a:deck){
        int i = q.poll();
        res[i] = a;
        q.offer(q.poll());
    }
    return res;
    }
}