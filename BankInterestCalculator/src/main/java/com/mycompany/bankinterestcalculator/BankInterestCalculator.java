/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankinterestcalculator;

import java.util.Scanner;
public class BankInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principalAmount, time;
        float rateOfInterest;
        
        System.out.println("Enter principal amount: ");
        principalAmount = input.nextInt();
        System.out.println("Enter rate of interest: ");
        rateOfInterest = input.nextFloat();
        System.out.println("Enter time in years: ");
        time = input.nextInt();
        
        System.out.println("Simple interest earned: " + (float)((principalAmount * time * rateOfInterest) / 100));
        
        input.close();
    }
}
