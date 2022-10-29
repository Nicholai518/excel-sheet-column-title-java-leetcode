class Solution {
    public String convertToTitle(int columnNumber) {

        // used to build column
        StringBuilder stringBuilder = new StringBuilder();

        // there is a valid column
        while (columnNumber != 0) {
            columnNumber--;
            stringBuilder.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        // reverse
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
