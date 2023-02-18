public class Main {
    public static void main(String[] args) {

        try{
            Calculator calc=new Calculator(1,2);

            try {
                calc.add();
            } catch (ArithmeticException exc) {
                System.out.println(exc.getMessage());
            }
            try {
                calc.sub();
            } catch (ArithmeticException exc) {
                System.out.println(exc.getMessage());
            }
            try {
                calc.mul();
            } catch (ArithmeticException exc) {
                System.out.println(exc.getMessage());
            }
            try {
                calc.div();
            } catch (ArithmeticException exc) {
                System.out.println(exc.getMessage());
            }
        }
        catch(NumberFormatException exc){
            System.out.println(exc.getMessage());
        }

        System.out.println("The end");
    }
}
