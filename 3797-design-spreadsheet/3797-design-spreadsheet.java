class Spreadsheet {
    private int[][] grid;
    private int rows;

    public Spreadsheet(int rows) {
        this.rows = rows;
        this.grid = new int[rows][26]; // rows × 26 columns (A–Z)
    }
    
    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }
    
    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1); // remove '='
        String[] parts = formula.split("\\+");
        int sum = 0;
        for (String part : parts) {
            sum += evaluateOperand(part);
        }
        return sum;
    }
    
    private int evaluateOperand(String s) {
        if (Character.isDigit(s.charAt(0))) {
            return Integer.parseInt(s);
        } else {
            int[] pos = parseCell(s);
            return grid[pos[0]][pos[1]];
        }
    }
    
    private int[] parseCell(String cell) {
        char colChar = cell.charAt(0);
        int col = colChar - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        return new int[]{row, col};
    }
}
