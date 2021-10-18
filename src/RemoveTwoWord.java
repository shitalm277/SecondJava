public class RemoveTwoWord {
    public static void main (String[]args){
        String details = "Rajesh Patel's home number 0751254698 £50.00 Java & Selenium * * *";
        //Tried removing two words on the same project
        // Remove word Java from the given string
        //Remove word "Patel's" from the given string
        //String name is details
        String replaceString= details.replaceAll("Java", "");
        String replaceString1= details.replaceAll("Patel's", "");
        System.out.println(replaceString);
        System.out.println(replaceString1);
    }
}
