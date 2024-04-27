package Strings;
public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Bob";
        String str2 = "James";
        
        System.out.println("The length of str1: " + str1.length());
        System.out.println("The second char of str1: " + str1.charAt(1));
        System.out.println("Are they equal? : " + str1.equals(str2));
        System.out.println("Str2 Upper : " + str2.toUpperCase());
        System.out.println("Str2 Lower : " + str2.toLowerCase());
        System.out.println("Str2  : " + str2);
        
        
        if(str1.compareTo(str2) > 0){
            System.out.println(str1 + " is more alphabetical");
        }
        else{
            System.out.println(str2 + " is more alphabetical");
        }
        
    }
}
