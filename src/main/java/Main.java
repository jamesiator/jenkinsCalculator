public class Main {
    public static void main(String[] args) {
        //support for add, subtract, multiply, divide, fibonacci, and binary
        String cmd = args[0];
        Calculator calc = new Calculator();
        if (cmd.equals("add")) {
            
            int a  = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("Answer: " + a + " + " + b + " = " + calc.add(a,b));

        } else if (cmd.equals("subtract")) {

            int a  = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("Answer: " + a + " - " + b + " = " + calc.subtract(a, b));

        } else if (cmd.equals("multiply")) {

            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("Answer: " + a + " * " + b + " = " + calc.multiply(a, b));

        } else if (cmd.equals("divide")) {

            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("Answer: " + a + " / " + b + " = " + calc.divide(a, b));

        } else if (cmd.equals("fibonacci")) {

            int a = Integer.parseInt(args[1]);
            System.out.println("Answer: " + a + "-th term of fibonacci sequence = " + calc.fibonacciNumberFinder(a));
 
        } else if (cmd.equals("binary")) {

            int a = Integer.parseInt(args[1]);
            System.out.println("Answer: " + a + " in binary = " + calc.intToBinaryNumber(a));

        } else {
            System.out.println("Invalid argument");
        }
    }
}
