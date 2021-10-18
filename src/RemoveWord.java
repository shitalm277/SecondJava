public class RemoveWord {
    public static void main (String[]args){
        String details = "Rajesh Patel's home number 0751254698 £50.00 Java & Selenium * * *";
        //Remove word Java from given string
        //String name is details
        String replaceString= details.replaceAll("Java","");
        System.out.println(replaceString);
    }
}