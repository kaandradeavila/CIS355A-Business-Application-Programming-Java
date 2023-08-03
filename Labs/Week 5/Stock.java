/****************************************************************************
 Program Name: Stocks.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: Stock class used in CIS355A Week 5 Lab.
 ****************************************************************************/
public class Stock 
{
    // attributes
    private String companyName;
    private double numShares;
    private double purchasePrice;
    private double currentPrice;    
    
    // constructors
    // --> default constructor
    public Stock()
    {
        companyName = "unknown";
        numShares = 0.0;
        purchasePrice = 0.0;
        currentPrice = 0.0;
    }
    
    // --> parameterized constructor
    public Stock(String companyName, double numShares, double purchasePrice, double currentPrice)
    {
        setCompanyName(companyName);
        setNumShares (numShares);
        setPurchasePrice(purchasePrice);
        setCurrentPrice(currentPrice);
    }
    
    // behaviors
    // --> method to calculate and return the profit or loss
    public double getProfitLoss ()
    {
        return numShares * (currentPrice - purchasePrice);
    }
    
    // --> method to display the name of the stock
    @Override
    public String toString() // CHECK HOW TO OVERRIDE THE METHOD & CHANGE NAME
    {
        return companyName + ": " + numShares + " shares.";
    }
    
    // getters and setters
    // --> companyName
    public String getCompanyName() 
    {
        return companyName;
    }

    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    // --> numShares
    public double getNumShares() 
    {
        return numShares;
    }

    public void setNumShares(double numShares) 
    {
        if (numShares > 0.0)
            this.numShares = numShares;
        
        else
            this.numShares = 0.0;
    }

    // --> purchasePrice
    public double getPurchasePrice() 
    {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) 
    {
        if (purchasePrice > 0.0)
            this.purchasePrice = purchasePrice;
        
        else
            this.purchasePrice = 0.0;
    }

    // --> currentPrice
    public double getCurrentPrice() 
    {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) 
    {
        if (currentPrice > 0.0)
            this.currentPrice = currentPrice;
        
        else
            this.currentPrice = 0.0;
    }
    
    
    
}
