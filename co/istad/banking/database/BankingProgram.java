package co.istad.banking.database;
import co.istad.banking.database.CreditCard;
import co.istad.banking.database.Database;
import co.istad.banking.database.SavingAccount;

public class BankingProgram {
    public static <savingAccount> void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(1219);
        creditCard.setPin(1111);
       if(Database.creditCard().getNumber().equals(creditCard.getNumber())){
           creditCard = Database.creditCard();
       }else {
           System.out.println("Invalid input...!");
           return;
       }
       creditCard.deposit(5000.0);
       creditCard.withdrawal(1000.0);
//       creditCard.withdrawal(); // entire amount
       creditCard.showBalance();
       SavingAccount savingAccount = new SavingAccount();
       savingAccount.setInterestI(new RielRate());
       savingAccount.showBalance();

       SavingAccount savingAccount2 = new SavingAccount();
       savingAccount2.setInterestI(new DollarRate());
       savingAccount2.showBalance();
//
      SavingAccount mySaving = Database.saving();
       mySaving.setInterestI(new DollarRate());
       mySaving.calculateInterest();
        mySaving.showBalance();
//       mySaving.setInterestI(new DollarRate());
//       mySaving.calculateInterest();
//        System.out.println(mySaving.getInterest());
    }
}
