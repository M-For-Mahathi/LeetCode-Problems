class Solution {
    public int secondHighest(String s) {
        int largest = -1, secondLargest = -1;
        char[] charArray = s.toCharArray();

        for (char i : charArray){
            if (Character.isDigit(i)) {
                int digit = i - '0';
                if (digit > largest){
                    secondLargest = largest;
                    largest = digit;
                }
                else if (digit < largest && digit > secondLargest){
                    secondLargest = digit;
                }
            }
        }
        return secondLargest;
    }
}