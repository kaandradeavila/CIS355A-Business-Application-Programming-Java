import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/****************************************************************************
 Program Name: Stocks4UsGUI.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: StockIO class created for CIS355A Week 5 Lab, which
 we use to create the file where we will write, read, and save stocks info.
 ****************************************************************************/
public class StockIO {

    // attributes
    private String fileName;

    // constructors
    public StockIO() {
        fileName = "Stocks.txt";
    }

    public StockIO(String fileName) {
        setFileName(fileName);
    }

    // behaviors
    public ArrayList<Stock> getData() {
        //create the array list
        ArrayList<Stock> data = new ArrayList<Stock>();

        // load the arraylist with the data from the file
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(fileName));
            String inputLine = "";
            StringTokenizer tokens;
            
            //get first line
            inputLine = inFile.readLine();
            
            // cycle through the file and read line by line
            while (inputLine != null)
            {
                // break the line into parts -- IBM,10,500.0,800.0
                tokens = new StringTokenizer(inputLine, ","); //divides the line we just read into parts based on commas
                String company = tokens.nextToken();
                double shares = Double.parseDouble(tokens.nextToken());
                double pPrice = Double.parseDouble(tokens.nextToken());
                double cPrice = Double.parseDouble(tokens.nextToken());
                
                // create a Stock object and add it to the ArrayList
                Stock stk = new Stock(company, shares, pPrice, cPrice);
                data.add(stk);
                
                // read the next line
                inputLine = inFile.readLine();
            }
            
            // close the file
            inFile.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. Unable to write to the file: " + ex.getMessage(),
                    fileName, JOptionPane.ERROR_MESSAGE);
        }
        // return the arraylist
        return data;
    }

    public void saveDate(ArrayList<Stock> data) {

        try {
            // create file to the pipe
            BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName));

            // write the stocks by cycling through the data
            for (int i = 0; i < data.size(); i++) {
                Stock stk = data.get(i);
                outFile.write(stk.getCompanyName() + ',');
                outFile.write("" + stk.getNumShares() + ','); // we add "" to convert it to a string
                outFile.write("" + stk.getPurchasePrice() + ',');
                outFile.write("" + stk.getCurrentPrice());
                outFile.newLine(); // ENTER key to drop to next line
            }

            // close the file
            outFile.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. Unable to write to the file: " + ex.getMessage(),
                    fileName, JOptionPane.ERROR_MESSAGE);
        }

        // close the pipe
    }

    // getters and setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        // do validation
        if (fileName.length() > 0) {
            this.fileName = fileName;
        } else {
            this.fileName = "Stocks.txt";
        }
    }
}
