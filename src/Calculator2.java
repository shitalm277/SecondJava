public class Calculator2 {

    //instance variable or non-static variables - declared globally without static keyword
    int a = 20;
    int b = 40;

    //no return type non parameterised static method
    public void addition() {
        System.out.println(a + b);
    }

    public void subtraction() {
        System.out.println(a - b);
    }

    public void multiply() {
        System.out.println(a * b);
    }

    public void division() {
        System.out.println(b / a);
    }

    public static void main(String args[]) {
        Calculator2 calculator2 = new Calculator2();//create the object
        calculator2.addition(); // calling static method addition() inside the main method
        calculator2.subtraction();
        calculator2.multiply();
        calculator2.division();
    }
}



