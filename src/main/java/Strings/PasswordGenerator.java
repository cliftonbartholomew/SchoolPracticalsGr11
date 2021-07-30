package Strings;


public class PasswordGenerator{
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        //Create 10 passwords
        for (int i = 0; i < 10; i++)
        {
             //Only go to next password once a valid password is generated.
             boolean valid = false; 
             while (valid == false) 
             {
                 String password = "";
                 
                 //Conditions to check against per password
                 int upperCase = 0;
                 int lowerCase = 0;         
                 int digits = 0;
                 
                 //Create a password of length 8
                 for (int j = 0; j < 8; j++)
                 {
                   //Get a random char from the characters string
                   char ch = characters.charAt((int) Math.round(Math.random()*(characters.length()- 1))); 
                   
                   //refetch the char if it already exists in the password
                   while (password.toUpperCase().contains(("" + ch).toUpperCase()))
                   {
                       ch = characters.charAt((int) Math.round(Math.random()*(characters.length()- 1))); 
                   }
                   
                   //add the char to the password
                   password += ch; 
                   
                   //Increment the counters
                   if (Character.isUpperCase(ch))   //("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains("" + letter)) 
                   {
                       upperCase++;                      
                   }

                   else if (Character.isLowerCase(ch))   //("abcdefghijklmnopqrstuvwxyz".contains("" + letter)) 
                   {
                       lowerCase++;                      
                   }

                   else if (Character.isDigit(ch))       //("0123456789".contains("" + letter)) 
                   {
                       digits++;                         
                   }
                }//end password generated
                
                 //Check if all the condition are met for this password
                if (upperCase > 0 && lowerCase > 0 && digits > 0) 
                {
                   valid = true; 
                    System.out.println(password);
                }
             }
        }



    }
}