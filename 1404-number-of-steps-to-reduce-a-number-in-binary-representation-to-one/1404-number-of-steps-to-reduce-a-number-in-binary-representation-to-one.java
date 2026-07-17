import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger number = new BigInteger(s, 2);

        int count = 0;
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.valueOf(2);

        while (!number.equals(one)) {
            if (number.mod(two).equals(BigInteger.ZERO)) {
                number = number.divide(two);
            } else {
                number = number.add(one);
            }
            count++;
        }

        return count;
    }
}