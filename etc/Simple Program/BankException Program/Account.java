package BankSystem;

public class Account {

	double Money=0;
	double getMoney() {
		return Money;
	}
	
	void setMoney(double Money) throws Exception{
		if(Money<0) {
			throw new Exception("NonPositiveNumberException:Deposit amount must be positive");
		}
		this.Money=Money;
	}
	
	void Deposit(double Money) throws Exception{
		if(Money<0) {
			throw new Exception("NonPositiveNumberException:Deposit amount must be positive");
		}
		this.Money+=Money;
	}
	
	void Withdraw(double Money) throws Exception{
		if(this.Money<Money) {
			throw new Exception("InsufficientFundsException:Insufficient funds to withdraw this amount");
		}
		this.Money-=Money;
	}
}
