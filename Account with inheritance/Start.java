import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		FixedAccount f1 = new FixedAccount();
		SavingsAccount s1 = new SavingsAccount(); 
		
		f1.setAccountNumber("19-41199-2");
		f1.setAccountHolderName("Shopnamoy saha");
		f1.setBalance(25000.80);
		f1.depositMoney(14000.50);
		f1.withdrawMoney(5000.50);
		f1.setTenureYear(6);
		
		
		System.out.println("Account number:"+f1.getAccountNumber());
		System.out.println("Account Holder Name:"+f1.getAccountHolderName());
		System.out.println("Balance:"+f1.getBalance());
		System.out.println("Tenure Year:"+f1.getTenureYear());
	    System.out.println();
		
		s1.setAccountNumber("19-41199-2");
		s1.setAccountHolderName("Shopnamoy saha");
		s1.setBalance(300000.80);
		s1.depositMoney(15000.50);
		s1.withdrawMoney(5000.50);
		s1.setInterstRate(6.25);
		
		
		System.out.println("Account number:"+s1.getAccountNumber());
		System.out.println("Account Holder Name:"+s1.getAccountHolderName());
		System.out.println("Balance:"+s1.getBalance());
		System.out.println("InterstRate:"+s1.getInterestRate());

	}
}