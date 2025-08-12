class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();

        for (String operation : operations) {
            if (operation.equals("C")) {
                record.remove(record.size() - 1);
            } else if (operation.equals("D")) {
                record.add(record.get(record.size() - 1) * 2);
            } else if (operation.equals("+")) {
                int size = record.size();
                record.add(record.get(size - 1) + record.get(size - 2));
            } else {
                record.add(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        for (int score : record) {
            sum += score;
        }
        return sum;
    }
}