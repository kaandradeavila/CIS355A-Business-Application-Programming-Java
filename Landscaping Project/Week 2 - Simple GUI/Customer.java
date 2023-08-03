import java.text.DecimalFormat;

/*****************************************************************************
 Program Name: Customer.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: Customer class used in CIS355A Week 2 Simple GUI project.
 *****************************************************************************/

public class Customer 
{
    //attributes
    private int customerID;
    private String name;
    private String address;
    private String yardType;
    private double length;
    private double width;
    private double totalCost;

    //constructors
    public Customer() {  //default constructor
        customerID = 0;
        name = "unknown";
        address = "unknown";
        yardType = "unknown";
        length = 0.0;
        width = 0.0;
        totalCost = 0.0;
    }

    public Customer(int customerID, String name, String address, 
                    String yardType, double length, double width, 
                    double totalCost) 
    {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.yardType = yardType;
        this.length = length;
        this.width = width;
        this.totalCost = totalCost;
    }

    //behaviors
    @Override
    public String toString() 
    {
        return name;        //only show the Customer's name
    }

    public String getDetails() 
    {
        DecimalFormat fmt = new DecimalFormat("$#,##0.00");
        String output = name + "\n";
        output += address + "\n";
        output += "Type: " + yardType + "\n";
        output += "Length: " + length + "\n";
        output += "Width: " + width + "\n";
        output += "Total Cost: " + fmt.format(totalCost); //currency

        return output;
    }

    //getters and setters
    public int getCustID()
    {
        return customerID;
    }

    public void setCustID(int custID) 
    {
        customerID = custID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getYardType()
    {
        return yardType;
    }

    public void setYardType(String yardType) 
    {
        this.yardType = yardType;
    }

    public double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }
}
