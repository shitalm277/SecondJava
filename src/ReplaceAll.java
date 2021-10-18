public class ReplaceAll {
    public static void main (String[]args){
        String details = "Rajesh Patel's home number 0751254698 £50.00 Java & Selenium * * *";
        //Remove space from given string
        //String name is details
        String replaceString= details.replaceAll("\\s","");
        System.out.println(replaceString);
    }
}
