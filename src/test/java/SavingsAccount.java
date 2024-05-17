public class SavingsAccount
{
    public static void main(String[] args)
    {
        Accounts a=new Accounts();
        a.setBalance(10000);
        System.out.println(a.getBalance());
        System.out.println(a.depositAmount(5000));
        System.out.println(a.Withdraw(2000));
        System.out.println(a.getBalance());
    }
}
