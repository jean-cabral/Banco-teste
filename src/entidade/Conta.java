package entidade;

public class Conta {
    private String holder;
    private int number;
    private float balance;

    public Conta(){

    }
    public Conta(int number,String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }
    public Conta(int number,String holder) {
        this.number = number;
        this.holder = holder;
        balance = 0;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public int getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        return this.balance += amount;
    }
    public double withdraw(double amount){
        return this.balance -=amount+5;
    }
    public String toString(){
        return "Account "
                +number
                +", Holder: "
                +holder
                +", Balance: $ "
                + String.format("%.2f",balance);
    }
}
