/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cliftonb
 */
public class Log {
    private LocalDateTime timestamp;
    private String message;

    public Log(LocalDateTime timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public LocalDate geDate() {
        return timestamp.toLocalDate();
    }
    
    public LocalTime getTime(){
        return timestamp.toLocalTime();
    }
    
    public boolean isDuringPeak(){
        LocalTime t12 = LocalTime.of(12, 0);
        LocalTime t3 = LocalTime.of(15, 0);
        
        return getTime().isAfter(t12) && getTime().isBefore(t3);
    }
    
    

    @Override
    public String toString() {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        return timestamp.format(outputFormatter) + " :: " + message;
    }
    
    
}
