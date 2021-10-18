public class Calculator{
    int a= 30;
    int b= 10;
    public static void addition(){
    //Creating the object
    Calculator calculator = new Calculator();
    System.out.println(calculator.a + calculator.b);}
    public static void substraction(){
    //Creating an object
    Calculator calculator = new Calculator();
    System.out.println(calculator.a - calculator.b);}
    public static void multiplication(){
    //Creating an object
    Calculator calculator = new Calculator();
    System.out.println(calculator.a * calculator.b);}
    public static void division(){
    //Creating an object
    Calculator calculator = new Calculator();
    System.out.println(calculator.a / calculator.b);}
    public static void main(String[]args){
        //Calling the static method addition() into the main method.
        Calculator.addition();
        //Calling the static method substraction() into the main method.
        Calculator.substraction();
        //Calling the static method multiplication() into the main method.
        Calculator.multiplication();
        //Calling the static method division() into the main method.
        Calculator.division();
    }
}
