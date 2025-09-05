class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        for (int i = 0; i < m; i++){
            int fall = n-1;
            for (int j = n-1; j >= 0; j--){
                if (box[i][j] == '*')
                    fall = j-1;
                else if (box[i][j] == '#'){
                    box[i][j] = '.';
                    box[i][fall] = '#';
                    fall --;
                }
            }
        }

        char[][] res = new char[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                res[j][m-1-i] = box[i][j];
            }
        }
        return res;

    }
}