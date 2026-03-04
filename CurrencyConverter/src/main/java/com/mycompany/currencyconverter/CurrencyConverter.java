/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.currencyconverter;

import java.util.Scanner;
public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usdAmount;
        
        System.out.println("Enter amount in USD: ");
        usdAmount = input.nextInt();
        
        System.out.println("Amount in Euro: " + (float)(usdAmount * 0.92));
        System.out.println("Amount in GBP: " + (float)(usdAmount * 0.75));
        
        input.close();
    }
}
