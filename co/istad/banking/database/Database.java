package co.istad.banking.database;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Database {
    public static CreditCard creditCard(){
        CreditCard creditCard = new CreditCard(1219,"Many Sin",50000.0);
//        creditCard.setName("Many Sin");
//        creditCard.setNumber(1219);
        creditCard.setPin(1111);
       creditCard.setLimitAmount(100000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, DAYS));
        return creditCard;
    }

    public static SavingAccount saving (){
        SavingAccount saving = new SavingAccount(1234,"Seyneang",1000.0);
        return saving;
    }

}
