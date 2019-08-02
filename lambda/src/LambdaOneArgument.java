interface NumericTest {
    boolean test(int n);
}

public class LambdaOneArgument {
    public static void main(String[] args) {

        /*
            Using lambda with one argument.
        */

        NumericTest isEven = n -> (n % 2) == 0;
        NumericTest isNonNeg = n -> n >= 0;

        /*
            Invoking func(int n) method from the functional interface.
        */

        if(isEven.test(10))
            System.out.println("10 is even");

        if(!isEven.test(9))
            System.out.println("9 is not even");

        if(isNonNeg.test(1))
            System.out.println("1 is non-negative");

        if(!isNonNeg.test(-1))
            System.out.println("-1 is negative");
    }
}
