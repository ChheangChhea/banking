package co.istad.banking.database;

public class SavingAccount extends Account {
    private Double interest; // ការប្រាក់
    private Interest interestI;

    static class DefaultInterest implements Interest{
        @Override
        public Double calculate(Double amount) {
            return amount * 0.02;
        }
    }
    public SavingAccount(){
//        setInterestI(new DefaultInterest());
        setInterestI(new DefaultInterest(){
            public Double calculate(Double amount){
                return amount * 0.02;
            }
        });
    }
    public void setInterestI(Interest interestI) {
        this.interestI = interestI;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
    public Double getInterest() {
        return interest;
    }

    public void calculateInterest(){
       interest = interestI.calculate(getBalance());
//        interest  =900d;
    }
    public SavingAccount(Integer number, String name, Double balance) {
        super(number,name,balance);
    }
    @Override
    protected void showBalance() {
        System.out.println("->>> Saving Account <<<-");
        System.out.println("Save act No : "+ getNumber());
        System.out.println("Save act Name : "+ getName());
        System.out.println("Save act Balance : $"+ getBalance());
        System.out.println("Interest : "+ interest);
        System.out.println("====================================");
    }
}
