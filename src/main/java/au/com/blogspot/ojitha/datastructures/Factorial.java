package au.com.blogspot.ojitha.datastructures;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {
    public static BigInteger factorial(int n){
        return IntStream.rangeClosed(1,n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
