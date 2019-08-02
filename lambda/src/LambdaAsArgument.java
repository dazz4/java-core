interface StringFunc<T> {
    T func(T n);
}

public class LambdaAsArgument {

    /*
        Static stringOP method with functional interface as argument.
    */

    private static <T> T stringOp(StringFunc<T> sf, T s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        /*
            Passing lambda expression as argument.
        */

        String stringOut = stringOp(n -> "Test", "Drive");
        System.out.println(stringOut);

        Integer numberOut = stringOp(n -> 10 * n, 10);
        System.out.println(numberOut);
    }
}
