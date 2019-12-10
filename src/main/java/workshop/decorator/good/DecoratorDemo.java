package workshop.decorator.good;

public class DecoratorDemo {
    public static void main( String[] args ) {
        I[] array = { new X(new A()), new Y(new X(new A())) };

        for (I anArray : array) {
            anArray.doIt();
            System.out.print("  ");
        }
    }
}
