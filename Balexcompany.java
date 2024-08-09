/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Balexcompany {
    static final double minimumwage = 8.0;
    static final int maxHours = 60;
    static double basepay = 0;
    static int hoursWorked = 0;
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        for(int i = 1; i<=3;i++){
            System.out.println("For employee No:" +i);
            System.out.println("Enter basepay:");
            basepay = in.nextDouble();
            System.out.println("Enter hoursWorked:");
            hoursWorked = in.nextInt();
            salaryCalculation();
        }
    }
    public static void salaryCalculation(){
        double totalSalary = 0;
        if ((basepay<minimumwage)|| (hoursWorked>maxHours)){
            System.out.println("Error");
        
        }
        else{
            if (hoursWorked>40){
                totalSalary = basepay*40 + 1.5* basepay *(hoursWorked - 40);
            }
            else {
                totalSalary = basepay* hoursWorked;
            }
            System.out.println("Your total salary is:" + totalSalary);
        }
    }
    
}
