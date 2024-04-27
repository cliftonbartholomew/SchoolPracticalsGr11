/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.JuneExam;

/**
 *
 * @author Cliftonb
 */
public class ISPConnection {
    private String ip;
    private String clientID;
    private String isp;
    private String date;

    public ISPConnection(String ip, String clientID, String isp, String date) {
        this.ip = ip;
        this.clientID = clientID;
        this.isp = isp;
        this.date = date;
    }
    
    public boolean validIP(){
        String[] parts = ip.split("\\.");
        for(String part: parts){
            int num = Integer.parseInt(part);
            if(num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }
    
    public String toString(){
        return ip + "\t" + isp + "\t" + clientID + "\t" + displayDate();
    }
    
    public String displayDate(){
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6));
        
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        return "20" + year + "-" + months[month-1] + "-" + day;
        
    }
    
    private char toHex(int num){
        char [] hexSymbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' ,'A', 'B', 'C', 'D', 'E', 'F'};
        
        return hexSymbols[num];
        
    }
    
    public String getHexIP(){
        String[] parts = ip.split("\\.");
        String output = "";
        for(String part: parts){
            int num = Integer.parseInt(part);
            int tens = num/16;
            int units = num%16;
            
            output += toHex(tens) +""+ toHex(units)+ ":";
            
        }
        return output.substring(0, output.length()-1);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getClientId() {
        return clientID;
    }

    public void setClientId(String clientId) {
        this.clientID = clientId;
    }



    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

}
