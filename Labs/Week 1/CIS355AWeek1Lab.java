package cis355a.week1.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**************************************
 Program Name: Week1Lab.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: A program that calculates BMI, classifies BMI result, 
 and calculates maxHR in a Health Profile format.
 ****************************************/

public class CIS355AWeek1Lab {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Scanner object to get input in Console environment
        Scanner scan = new Scanner(System.in); //make sure to: import java.util.Scanner
                
        // loop until user selects quit (gives us an 'X')
        // while (name.equalsIgnoreCase("X") == false) {}
        while (true){
            System.out.print("Enter name or X to quit: ");
            String name = scan.nextLine();
                        
            if (!name.equalsIgnoreCase("X")){ // can't read/use == to make comparisons of strings
                // get the rest of the information
                
                System.out.print("Enter age: ");
                int age = scan.nextInt();
                
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                
                System.out.print("Your height - feet: ");
                int feet = scan.nextInt();
                
                System.out.print("Your height - inches: ");
                double inches = scan.nextDouble();
                
                scan.nextLine(); // read until it hits '\n' ot ENTER key -- use up the ENTER key
                
                // show the health profile
                HealthProfile hp = new HealthProfile(name, age, weight, feet, inches);
                
                System.out.println("\nHealth Profile for " + hp.getName());
                
                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat("0.0"); // import java.text.DecimalFormat;
                
                System.out.println("BMI: " + fmt.format(bmi));
                System.out.println("BMI Category: " + hp.calculateCategory());
                System.out.println("Max heart rate: " + hp.calculateMaxHR());
                System.out.println();
            }
            
            else    // break out of the while loop
                break;
        }
    }
    
}
