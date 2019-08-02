interface NumericTest2 {
    boolean func(int n, int d);
}

public class LambdaTwoArguments {
    public static void main(String[] args) {

        /*
            Using lambda with two arguments.
        */

        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        /*
            Invoking func(int n, int d) method from the functional interface.
        */

        if(isFactor.func(10, 2))
            System.out.println("2 is a factor of 10");

        if(!isFactor.func(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
