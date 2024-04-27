/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.November;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ItemManager {
    private Item[] itemArray = new Item[100];
    private int size = 0;
    
    public ItemManager(){
        try {
            Scanner fileSc = new Scanner(new File("items.txt"));
            
            while(fileSc.hasNext()){
                String line = fileSc.nextLine();
                
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                String playerID = lineSc.next();
                String itemID = lineSc.next();
                String desc = lineSc.next();
                String rarity = lineSc.next();
                String value = lineSc.next();
                
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dateFound = LocalDate.parse(lineSc.next(), dtf);
                
                Item i = new Item(playerID, itemID, desc, rarity, value, dateFound);
                itemArray[size] = i;
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ItemManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String toString(){
        String output = "";
        for (int i = 0; i < size; i++) {
            output+=itemArray[i] + "\n";
        }
        return output;
    }
    
    public void sortByDateFound(){
        for (int i = 0; i < size; i++) {
            int smallestIndex = i;
            for (int j = smallestIndex + 1; j < size; j++) {
                if(itemArray[smallestIndex].getDateFound().isAfter(itemArray[j].getDateFound())){
                    smallestIndex = j;
                }
            }
            
            Item temp = itemArray[i];
            itemArray[i] = itemArray[smallestIndex];
            itemArray[smallestIndex] = temp;
        }
    }
    
    public int findItem(String itemID){
        for (int i = 0; i < size; i++) {
            if(itemArray[i].getItemID().equals(itemID)){
                return i;
            }
        }
        return -1;
    }
    
    public void insertItem(Item item, int index){
        for(int i = size; i > index; i--){
            itemArray[i] = itemArray[i-1];
        }
        itemArray[index] = item;
        size++;
    }
    
    public void deleteItem(int index){
        for(int i = index; i < size-1; i++){
            itemArray[i] = itemArray[i+1];
        }
        size--;
    }
    
    public String exchangeItems(String playerOneID, String playerTwoID, String itemOneID, String itemTwoID){
        int itemOneIndex = findItem(itemOneID);
        int itemTwoIndex = findItem(itemTwoID);
        
        if(itemOneIndex == -1 ){
            return "Item 1 not found";
        }
        if(itemTwoIndex == -1){
            return "Item 2 not found";
        }
        
        if(!itemArray[itemOneIndex].getPlayerID().equals(playerOneID)){
            return "Player 1 does not own item 1";
        }
        if(!itemArray[itemTwoIndex].getPlayerID().equals(playerTwoID)){
            return "Player 2 does not own item 2";
        }
        
        Item itemOne = itemArray[itemOneIndex];
        Item itemTwo = itemArray[itemTwoIndex];
        
        LocalDate today = LocalDate.now();
        
        Period itemOnePeriod = Period.between(itemOne.getDateFound(),today);
        Period itemTwoPeriod = Period.between(itemTwo.getDateFound(),today);
        
        double itemOneTradeValue = itemOne.getCopperValue();
        itemOneTradeValue+= itemOneTradeValue*(itemOnePeriod.getYears()*0.05);
        
        double itemTwoTradeValue = itemTwo.getCopperValue();
        itemTwoTradeValue+= itemTwoTradeValue*(itemTwoPeriod.getYears()*0.05);
        
        itemOne.setPlayerID(playerTwoID);
        itemTwo.setPlayerID(playerOneID);
        
        String out = "Player " + playerOneID + " trading " + itemOne.getDescription() + " to Player " + playerTwoID + " for item " + itemTwo.getDescription();
        if(itemOneTradeValue > itemTwoTradeValue){
            out += "\n" + itemOne.getDescription() + " is more valuable @ " + itemOneTradeValue + " to " + itemTwoTradeValue;
        }
        else{
            out += "\n" + itemTwo.getDescription() + " is more valuable @ " + itemTwoTradeValue + " to " + itemOneTradeValue;
        }
        
        return out;
        
    }
}
