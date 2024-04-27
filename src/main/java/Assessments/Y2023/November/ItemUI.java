/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.November;

import java.time.LocalDate;

/**
 *
 * @author Cliftonb
 */
public class ItemUI {
    public static void main(String[] args) {
        ItemManager im = new ItemManager();
        System.out.println(im.toString());
        System.out.println("Number of Rare Items Found: " + Item.numRareItems);
        im.sortByDateFound();
        System.out.println(im.toString());
        Item i = new Item("RJ23", "W9","Winged Boots" ,"Rare", "12 gp", LocalDate.of(2023, 11, 7));
        im.insertItem(i, 1);
        im.deleteItem(0);
        System.out.println(im.toString());
        
        String receipt = im.exchangeItems("MC26", "AF61", "BD", "B2");
        System.out.println(receipt);
    }
}
