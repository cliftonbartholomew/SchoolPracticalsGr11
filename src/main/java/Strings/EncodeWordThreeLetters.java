package Strings;



import javax.swing.*;


public class EncodeWordThreeLetters {
    public static void main (String[] args){
        
      //gets user input
      String input = JOptionPane.showInputDialog("Please enter a word.");
      input = input.toUpperCase();
      String result = "";
      char ch = 'a';
      int num = 0; 
      int shift =1;
                   
        if (input.length() <= 3){       
        
        //reverses the word
        String reverse = "";
            for(int j = input.length() - 1; j >= 0; j--){
               //NOTE TO SELF: if it wasn't length - 1 (out of bounds)
               reverse = reverse + input.charAt(j);                
            }
         
	    //adds a letter (from caesarCipher code we previously did) 
            for(int i = 0; i < reverse.length(); i++){
               ch = reverse.charAt(i);
               num = (int) ch;
               num = num + shift;
               ch = (char) num;
               result = result + ch;
            } 
          System.out.println(input + " becomes: " + result);
        }
        else{
        //if the word is more than 3 letters
            String startWord = input.substring(0,3);
            String endWord = input.substring(3);
            String newWord = endWord + startWord;
            
	    //adds a letter (from caesarCipher code we previously did)        
            for(int i = 0; i < newWord.length(); i++){
               ch = newWord.charAt(i);
               num = (int) ch;
               num = num + shift;
               ch = (char) num;
               result = result + ch;
            }
          System.out.println(input + " becomes " + result);
        }//end if-else statement
        
    }//end public static void main
}//end public class