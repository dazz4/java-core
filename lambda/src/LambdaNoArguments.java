interface MyNumber {
    double getValue();
}

public class LambdaNoArguments {
    public static void main(String[] args) {
        MyNumber myNumber;

        /*
            Using lambda without arguments.
        */

        myNumber = () -> 123.45;
        System.out.println(myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getValue());
    }
}
