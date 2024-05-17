public class Accounts
{
    double deposit;
    double withdraw;
    private double balance;

    public Accounts()
    {

    }
    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double depositAmount(double deposit)
    {
        deposit=balance+deposit;
        balance=deposit;
        return deposit;
    }

    public double Withdraw(double withdraw)
    {
        withdraw=balance-withdraw;
        return withdraw;
    }

}
