public class Calculator {
    private int a;
    private int b;

    public Calculator(Object a, Object b) {
        if(!(a instanceof Integer)){
            throw new NumberFormatException("Either a or b is non-integer value");
        }
        if(!(b instanceof Integer)){
            throw new NumberFormatException("Either a or b is non-integer value");
        }
        this.a=(Integer) a;
        this.b=(Integer) b;
    }


    public void add() {
        if (a < 0 || b < 0) {
            throw new ArithmeticException(String.format("One of the number is negative: %d, %d", a, b));
        }
        System.out.println(a + b);
    }

    public void sub() {
        if (a < 0 || b < 0) {
            throw new ArithmeticException(String.format("One of the number is negative: %d, %d", a, b));
        }
        System.out.println(a - b);
    }

    public void mul() {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(String.format("One of the number is zero: %d, %d", a, b));
        }
        System.out.println(a * b);

    }

    public void div() {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(String.format("One of the number is zero: %d, %d", a, b));
        }
        System.out.println(a / b);
    }
}

