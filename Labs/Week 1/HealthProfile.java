/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cis355a.week1.lab;

/****************************************************************************
 Program Name: HealthProfile.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: Health Profile class used in CIS355AWeek1Lab.java
 ****************************************************************************/

public class HealthProfile {
    // attributes
    private String name;
    private int age;
    private double weight; //in lbs
    private double height; //in inches
    
    // constructors -- you set default values for attributes
    public HealthProfile(){
        name = "unknown";
        age = 0;
        weight = 0.0;   // double result = 9 / 10; --->> COMMON ERROR
        height = 0.0;
    }
    
    public HealthProfile(String name, int age, double weight, double height){ //For validation
        this.setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }
    
    public HealthProfile(String name, int age, double weight, int feet, double inches){ //For validation
        this.setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(feet, inches);
    }
    // behaviors -- methods
    public double calculateBMI(){ //no parameters because we're using the attributes in the class
        // double bmi = (weight * 703) / (Math.pow(height, 2));
        // return bmi;
        
        return (weight * 703) / (Math.pow(height, 2));
    }
    
    public String calculateCategory(){
        double bmi = calculateBMI();
        
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
    
    public double calculateMaxHR(){
        return 220 - age;
    }
    
    // getters and setters
    // ---> name attribute
    public String getName(){
        return name;
    }
    
    public void setName(String name){ 
        if (name.length() > 0)
            this.name = name;
        else
            this.name = "unkownn"; //IMPORTANT --> For security purposes to not leave blank spaces
    }
    
    // ---> age attribute
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        if (age > 0)
            this.age = age;
        else
            this.age = 0; //IMPORTANT --> For security purposes to not leave blank spaces
    }
    
    // ---> weight attribute
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double weight){
        if (weight > 0.0) // 0.0 because it's a double
            this.weight = weight;
        else
            this.weight = 0.0; //IMPORTANT --> For security purposes to not leave blank spaces
    }
    
    // ---> height attribute
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double inches){
        if (inches > 0.0) // 0.0 because it's a double
            this.height = inches;
        else
            this.height = 0.0; //IMPORTANT --> For security purposes to not leave blank spaces
    }
    
    public void setHeight(int feet, double inches){
        double totalInches = (feet * 12) + inches;
        
        if (totalInches > 0.0)
            this.height = totalInches;
        else
            this.height = 0.0; //IMPORTANT --> For security purposes to not leave blank spaces
    }
}
