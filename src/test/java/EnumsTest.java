public class EnumsTest
{
    enum status
    {
        A,
        B,
        C
    }

    public static void main(String[] args)
    {
        EnumsTest test=new EnumsTest();
        test.testSwitch();
    }

    public void testSwitch()
    {
        status state=status.A;
        switch (state)
        {
            case A :
                System.out.println("state is: "+ state);
                break;
            case B :
                System.out.println("state is: "+ state);
                break;
            case C :
                System.out.println("state is: "+ state);
                break;

        }
    }
}
