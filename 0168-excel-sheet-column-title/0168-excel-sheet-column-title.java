class Solution {
    public String convertToTitle(int n) {
     StringBuilder res = new StringBuilder();
     while (n != 0){
        n --;
        int r = n%26;
        n /= 26;
        char letter = (char)('A' + r);
        res.append(letter);
     }
     return res.reverse().toString();
    }
}