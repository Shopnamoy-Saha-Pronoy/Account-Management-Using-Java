import java.lang.*;

public class Account
{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public Account(){System.out.println("empty constuctor");}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
public void depositMoney(double ammount)
{
	balance=balance+ammount;
}
public void withdrawMoney(double ammount)
{
	balance=balance-ammount;
}	
}