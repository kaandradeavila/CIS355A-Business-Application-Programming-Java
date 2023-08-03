
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/****************************************************************************
 Program Name: Customer.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: DataIO class used in LandscapeGUI.java.
 ****************************************************************************/
public class DataIO {
    // behaviors
    public void add(Customer cust) throws IOException
    {
        // open or create the file onject using true to "APPEND" the data
        BufferedWriter outFile = new BufferedWriter(new FileWriter("Customers.txt", true));
            
        // write the data
        outFile.write(cust.getName());
        outFile.write("#" + cust.getAddress());
        outFile.write("#" + cust.getYardType());
        outFile.write("#" + cust.getLength());
        outFile.write("#" + cust.getWidth());
        outFile.write("#" + cust.getTotalCost());
        outFile.newLine(); //"ENTER" key
        
        // close the file
        outFile.close();
    }
    
    public void delete(String deleteName) throws IOException
    {
        // get all records
        ArrayList <Customer> customers = getList();
                
        // delete the old file
        File oldFile = new File ("Customers.txt");
        if (oldFile.exists() == false)
        {
            throw new IOException ("File does not exist!");
        }
        oldFile.delete();
        
        // write "good" records to the file
        for (Customer cust : customers) //foreach loop, it reads for each Customer cust object in the ArrayList customer, do {...}
        {
            if (deleteName.equalsIgnoreCase(cust.getName()) == false)
            {
                // good record so write it to the file
                add(cust);
            }
        }
    }
    
    public ArrayList<Customer> getList() throws FileNotFoundException, IOException
    {
        // get Customer object from the file and return as ArrayList
        // create an arraylist
        ArrayList <Customer> customers = new ArrayList<Customer>();
        
        // read data from the file
        BufferedReader inbuffer = new BufferedReader(new FileReader("Customers.txt"));
        StringTokenizer tokens;
        
        // get first line
        String inputString = inbuffer.readLine();
        while (inputString != null)
        {
            // break the line into pieces using the Tokenizer
            tokens = new StringTokenizer (inputString, "#");
            
            // fields are name#address#yardType#length#width#totalCost
            String name = tokens.nextToken();
            String address = tokens.nextToken();
            String yardType = tokens.nextToken();
            double length = Double.parseDouble(tokens.nextToken());
            double width = Double.parseDouble(tokens.nextToken());
            double totalCost = Double.parseDouble(tokens.nextToken());
            
            // create Customer object and add it to the ArrayList
            Customer cust = new Customer (0, name, address, yardType, length, width, totalCost);
            customers.add(cust);
            
            // read next line
            inputString = inbuffer.readLine();
        }
        
        // close the pipe to the file once the records have been read
        inbuffer.close();
        
        //return the ArrayList
        return customers;
    }
}
