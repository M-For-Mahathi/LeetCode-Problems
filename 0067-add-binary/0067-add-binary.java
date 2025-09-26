class Solution {
    public String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        StringBuilder res = new StringBuilder();
        int c = 0, i = A.length - 1, j = B.length - 1;

        while (i>=0 || j>=0 || c>0){
            int x = i>=0 ? A[i--] - '0' : 0;
            int y = j>=0 ? B[j--] - '0' : 0;
            int s = x+y+c;
            res.insert(0, ((char)(s%2 + '0')));
            c = s/2;
        }
        
        return res.toString();
    }
}