interface SomeFunc<T> {
    T func(T t);
}

public class LambdaGeneric {
    public static void main(String[] args) {

        /*
            Creating object reference with type parameter.
        */

        SomeFunc<String> generic1 = (n) -> "My name is: " + n;
        SomeFunc<Integer> generic2 = (n) -> n * 100;

        /*
            Invoking func method from the functional interface.
            Notice different argument types.
        */

        System.out.println(generic1.func("John Smith"));
        System.out.println(generic2.func(10));
    }
}
