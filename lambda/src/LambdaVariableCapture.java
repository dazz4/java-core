interface MyFunc {
    int func(int n);
}

public class LambdaVariableCapture {
    public static void main(String[] args) {

        /*
            This variable will be actually declared as final even
            though there is no final keyword. It's because we are
            using it in the lambda expression.
        */

        int num = 10;

        MyFunc myFunc = n -> {
            int v = num + n;

            /*
                This is illegal, you can't modify variable
                that is outside of lambda expression.

                num++;
            */

            return v;
        };

        /*
            This would be illegal as well because it would
            remove final status from num variable.

            num = 9;
        */

        System.out.println(myFunc.func(10));
    }
}
