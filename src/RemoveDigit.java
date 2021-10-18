public class RemoveDigit {
    public static void main (String[]args){
        String details = "Rajesh Patel;s home number 0751254698 £50.00 Java & Selenium * * *";
        //Remove digits from the given string
        //String name is details
        String replaceString= details.replaceAll("[0-9]","");
        System.out.println(replaceString);
    }

}
