/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessment.Y2024.JuneExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class SalesUI {
    
    public static double johnSales = 0;
    public static double paulSales = 0;
    public static double sallySales = 0;
    
    public static double totalProfit = 0;
    
    public static double q4Sales = 0;
    
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("2024 SALES MADE");
        System.out.println("*************************************");
        System.out.println("*************************************");
        try {
            Scanner fileSc = new Scanner(new File("sales-2023"));
            while(fileSc.hasNext()){
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line);
                
                String name = lineSc.next();
                LocalDate dateOfSale = LocalDate.parse(lineSc.next(), dtf);
                String category = lineSc.next();
                String itemDescription = lineSc.next();
                double costPrice = lineSc.nextDouble();
                
                SaleItem item = new SaleItem(dateOfSale, category, itemDescription, costPrice);
                totalProfit += item.getProfit();
                
                if(item.calculateSaleQuarter() == 4){
                    q4Sales += item.getSalesPrice();
                }
                
                switch(name){
                    case "John":
                        johnSales += item.getSalesPrice();
                        break;
                    case "Paul":
                        paulSales += item.getSalesPrice();
                        break;
                    case "Sally":
                        sallySales += item.getSalesPrice();
                        break;
                }
                
                
                System.out.println(item.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SalesUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("2024 SALES SUMMARY");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("Total number of items sold: " + SaleItem.getTotalNumSales());
        System.out.println("Quarter 4 sales: " + q4Sales);
        System.out.println("Total annual profit: " + totalProfit);
        if (johnSales > paulSales && johnSales > sallySales) {
            System.out.println("John was the most successful salesperson with total sales: " + johnSales);
        } else if (paulSales > johnSales && paulSales > sallySales) {
            System.out.println("Paul was the most successful salesperson with total sales: " + paulSales);
        } else {
            System.out.println("Sally was the most successful salesperson with total sales: " + sallySales);
        }
        
    }
}
