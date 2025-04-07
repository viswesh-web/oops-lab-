class Account { 
void showAccountDetails() { 
} 
} 
System.out.println("This is a bank account"); 
class Savings Account extends Account { 
void addInterest() { 
System.out.println("Interest added to savings account"); 
} 
} 
class CurrentAccount extends Account { 
} 
void processBusiness Transaction() { 
} 
System.out.println("Processing business transaction"); 
class Fixed DepositAccount extends Account { 
} 
void calculateMaturityAmount() { 
} 
System.out.println("Calculating fixed deposit maturity amount"); 
public class Bank { 
public static void main(String[] args) { 
SavingsAccount savings = new Savings Account(); CurrentAccount current = new 
CurrentAccount(); Fixed DepositAccount fd = new Fixed DepositAccount(); 
savings.showAccountDetails(); 
savings.addInterest(); 
current.showAccountDetails(); 
current.processBusiness Transaction(); 
fd.showAccountDetails(); 
fd.calculateMaturityAmount();
