interface DoubleNumericArrayFunc {

    /*
        Method in the functional interface has to 'throws'
        an exception if we want to later 'throw' it in
        lambda expression.
    */

    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}

public class LambdaExceptions {
    public static void main(String[] args) throws EmptyArrayException{
        double[] values = { 1.0, 2.0, 3.0, 4.0};

        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if(n.length == 0)
                throw new EmptyArrayException();

            for (double v : n) sum += v;
            return sum / n.length;
        };

        System.out.println("The average is " + average.func(values));

        /*
            This causes an exception to be thrown because we are sending
            an empty array.
        */

        System.out.println("The average is " + average.func(new double[0]));
    }
}
