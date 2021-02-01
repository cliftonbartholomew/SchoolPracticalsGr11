/*
 * To change: doesnt check for duplicates
 */
package Strings.Challenges;

/**
 *
 * @author Cliftonb
 */
public class Passwords {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            String pass = getPassword();
            System.out.println("Password " + i + " : " + pass + " : " + pass.length() + " : " + checkPass(pass));
        }
    }
    
    private static boolean checkPass(String pass){
        boolean upper = false, lower = false, num = false;
        for(char c: pass.toCharArray()){
            if(Character.isUpperCase(c)){
                upper = true;
            }
            else if(Character.isLowerCase(c)){
                lower = true;
            }
            else if(Character.isDigit(c)){
                num = true;
            }
        }
        
        return upper && lower && num;
    }
    
    public static String getPassword(){
        boolean containsUpper = false;
        boolean containsLower = false;
        boolean containsNumber = false;
        byte numFalse = 3;
        
        String password = "";
        
        //0 -> num; 1 -> upper; 2 -> lower
        byte choice;
        
        while(!containsUpper || !containsLower || !containsNumber || password.length() < 8){
            //randomly choose whether num, upper or lower
            choice = (byte)(Math.random() * 3); //random number from 0 to 2
            
            //check if restrictions reached by char 7
            if(numFalse > 0 && password.length() == 7){
                password = password.substring(0, 6);
                
                //reset booleans (case where 6 upper + 1 lower changes to 6 upper + 1 number must reset lower to false
                containsLower = containsLower(password);
                containsUpper = containsUpper(password);
                containsNumber = containsNum(password);

                continue;
            }
            
            switch (choice){
                case 0 -> {
                    //add a number
                    int numRan = (int)(Math.random() * 10); //random number from 0-9
                    password += (char)('0' + numRan);
                    
                    if(!containsNumber){
                        containsNumber = true;
                        numFalse--;
                    }
                }
                case 1 -> {
                    //add an upper
                    int upperRan = (int)(Math.random() * 26); //random number from 0-25
                    password += (char)('A' + upperRan);
                    
                    if(!containsUpper){
                        containsUpper = true;
                        numFalse--;
                    }
                }
                case 2 -> {
                    //add a lower
                    int lowerRan = (int)(Math.random() * 26);//random number from 0-25
                    password += (char)('a' + lowerRan);
                    
                    if(!containsLower){
                        containsLower = true;
                        numFalse--;
                    }
                }
            }
        }
        return password;
    }
 
    
    private static boolean containsUpper(String pass){
        for(char c: pass.toCharArray()){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    private static boolean containsLower(String pass){
        for(char c: pass.toCharArray()){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    private static boolean containsNum(String pass){
        for(char c: pass.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
