/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradeaveragecalculator;

import java.util.Scanner;
public class GradeAverageCalculator {

    public static void main(String[] args) {
        // Create scanner class to get input from user
        Scanner input = new Scanner(System.in);
        int score1, score2, score3;
        
        // Ask user for input
        System.out.println("Enter score 1: ");
        score1 = input.nextInt();
        
        System.out.println("Enter score 2: ");
        score2 = input.nextInt();
        
        System.out.println("Enter score 3: ");
        score3 = input.nextInt();
        
        input.close();
    }
}
