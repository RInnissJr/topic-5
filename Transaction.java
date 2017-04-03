/**
 * 
 */
package ToolKit;
import java.util.Date;
/**
 * @author RIcardo Inniss
 *
 */
public class Transaction {

    private Date mDate; 
    private char mType; 

    private double mAmount; 
    private double mBalance; 
    private String mDescription; 

    public Transaction(char type, double amount, double balance, String description) {
        mType = type;
        mAmount = amount;
        mBalance = balance;
        mDescription = description;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public char getType() {
        return mType;
    }

    public double getAmount() {
        return mAmount;
    }

    public double getBalance() {
        return mBalance;
    }

    public String getDescription() {
        return mDescription;
    }

    public String toString() {
        return "Type: " + mType + " Date: " + mDate + "Description: " + mDescription +
                "Amount: " + mAmount + " Balance: " + mBalance + "\n";
    }
}