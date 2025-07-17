import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {



        BigInteger num = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num.add(num2);
        // BigInteger sum2 = new BigInteger("sum");

        String binary = sum.toString(2);

        return binary;
    }
}