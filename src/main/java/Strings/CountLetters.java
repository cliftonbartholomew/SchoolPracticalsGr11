package Strings;
import javax.swing.JOptionPane;
public class CountLetters {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter your message").toLowerCase();
        
        int[] countLetters = new int[26];
        
        for(int i = 0; i< input.length(); i++){
            
            if(Character.isLetter(input.charAt(i))){
                char currentLetter = input.toLowerCase().charAt(i);
                int position = (int)currentLetter - 97;
                countLetters[position]++;
            }
        }
        
        for(int i = 97; i < 123; i ++){
            System.out.println((char)i + " : " + countLetters[i - 97]);
        }
    }
}