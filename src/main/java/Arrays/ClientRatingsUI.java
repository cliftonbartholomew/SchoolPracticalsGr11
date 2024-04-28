/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class ClientRatingsUI {
    public static void main(String[] args) {
        ClientRatings ratings = new ClientRatings();
        System.out.println(ratings.toString());
        ratings.sort();
        boolean hasFiddy = ratings.contains(50);
    }
}
