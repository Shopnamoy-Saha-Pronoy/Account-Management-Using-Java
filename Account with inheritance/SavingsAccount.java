import java.lang.*;

public class SavingsAccount extends Account
{
private double interestRate;

public SavingsAccount()
{
	System.out.println("empty constuctor");
}
public void setInterstRate(double interestRate)
{
	this.interestRate=interestRate;
}	
public double getInterestRate()
{
	return interestRate;
}
}