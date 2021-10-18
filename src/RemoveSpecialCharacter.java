public class RemoveSpecialCharacter {
    public static void main(String[]args){
        String details = "Rajesh Patel's home number 0751254698 £50.00 Java & Selenium * * *";
        //string name is details
        //Remove special character from the given string
        String replaceString= details.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(replaceString);
    }
}
