/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessment.Y2024.JuneExam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class SaleItem {
    private LocalDate dateOfSale;
    private String category;
    private String itemDescription;
    private double costPrice;
    
    public static final double MARKUP = 26.7;
    
    private static int totalNumSales = 0;
    private static double totalSalesValue = 0;
    
    public SaleItem(LocalDate inDOS, String inC, String inID, double inCP){
        //save the parameters internally
        this.dateOfSale = inDOS;
        this.category = inC;
        this.itemDescription = inID;
        this.costPrice = inCP;
        
        //increase the number of sales by one
        totalNumSales ++;
        
        //add to the total sales made
        totalSalesValue += getSalesPrice();
    }
    
    public String getSaleItemID(){
        //get date in MMMyy format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMyy");
        String output = dateOfSale.format(dtf) + "-";
        
        //get first 3 characters
        output += category.toUpperCase().substring(0,4) + "-";
        
        //get initials of description
        Scanner sc = new Scanner(itemDescription);
        while(sc.hasNext()){
            output += sc.next().toUpperCase().charAt(0);
        }
        
        return output;
    }
    
    public int calculateSaleQuarter(){
        int month = dateOfSale.getMonthValue();
        return (int)Math.ceil(month/3.0);
        
        //OR
        //if(month >= 1 && month <= 3) {return 1}
        //else if(month >= 4 && month <= 6) {return 2}
        //else if(month >= 7 && month <= 9) {return 3}
        //else {return 4}
    }
    
    public double getCostPrice(){
        return this.costPrice;
    }
    
    public double getSalesPrice(){
        return this.costPrice * (100+MARKUP)/100;
    }
    
    public double getProfit(){
        return getSalesPrice() - getCostPrice();
    }
    
    public String toString(){
        return getSaleItemID() + " profit:" + getProfit() + " salesPrice: " + getSalesPrice();
    }

    public static int getTotalNumSales(){
        return totalNumSales;
    }
    
    public static double getTotalSalesValue(){
        return totalSalesValue;
    }



}
