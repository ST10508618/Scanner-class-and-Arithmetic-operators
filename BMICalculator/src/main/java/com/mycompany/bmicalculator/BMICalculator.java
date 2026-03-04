/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bmicalculator;

import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float weight, height;
        
        System.out.println("Enter weight in kilograms (kg): ");
        weight = input.nextFloat();
        System.out.println("Enter height in meters (m): ");
        height = input.nextFloat();
        
        System.out.println("BMI value: " + (weight / (height * height)));
    }
}
