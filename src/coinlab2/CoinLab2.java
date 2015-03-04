/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinlab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diandre
 */
public class CoinLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        final int PENNY_VALUE = 1;
        // TODO: Ask the user for D.
        String input = JOptionPane.showInputDialog("Enter the amount of change");

        int d = Integer.parseInt(input);
        System.out.println("The user entered: " + d);

        // TODO: Compute the amount of change.
        // TODO: Calculate the number of quarters.
        int quarterCount = d / QUARTER_VALUE;
        System.out.println("I now have " + quarterCount + " quarter(s).");

        d %= QUARTER_VALUE;
        System.out.println("I have " + d + " left to go.");

        // TODO: Calculate the number of dimes.
        int dimeCount = d / DIME_VALUE;
        System.out.println("I now have " + dimeCount + " dime(s).");
        d %= DIME_VALUE;
       

        // TODO: Calculate the number of nickels.
        int nickelCount = d / NICKEL_VALUE;
        System.out.println("I now have " + nickelCount + " nickel(s).");
        d %= NICKEL_VALUE;
        // What's left in d is the amount of pennies.
        int pennyCount = d / PENNY_VALUE;
        System.out.println("I now have " + pennyCount + " pennie(s)");
        // TODO: Print the number of coins in each category.
        // TODO: Print the total number of coins.
        
    }
    
}
