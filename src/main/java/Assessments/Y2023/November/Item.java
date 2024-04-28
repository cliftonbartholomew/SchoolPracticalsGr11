/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.November;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class Item {
    private String playerID;
    private String itemID;
    private String description;
    private String rarity;
    private String value;
    private LocalDate dateFound;
    
    public static int numRareItems = 0;

    public Item(String playerID, String itemID, String description, String rarity, String value, LocalDate dateFound) {
        this.playerID = playerID;
        this.itemID = itemID;
        this.description = description;
        this.rarity = rarity;
        this.value = value;
        this.dateFound = dateFound;
        
        if(this.rarity.equalsIgnoreCase("rare")){
            numRareItems++;
        }
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getItemID() {
        return itemID;
    }

    public String getDescription() {
        return description;
    }

    public String getRarity() {
        return rarity;
    }

    public String getValue() {
        return value;
    }

    public LocalDate getDateFound() {
        return dateFound;
    }

    public static int getNumRareItems() {
        return numRareItems;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }
    
    public String toString(){
        return description + "(" + itemID +") Owned by " + playerID + " found on " + dateFound + " " + rarity + " " + value;
    }
    
    public int getCopperValue(){
        Scanner sc = new Scanner(value);
        int unit = sc.nextInt();
        String type = sc.next();
        
        return switch (type) {
            case "gp" -> unit * 100;
            case "sp" -> unit * 10;
            default -> unit;
        };
    }
}
