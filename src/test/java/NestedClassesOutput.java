class OuterClass
{
    int outerVariable = 10;

    public class InnerClass
    {
        String str = "boat";

        public void display()
        {
            System.out.println("Inner class method displaying outerVariable: " + outerVariable);
        }

        public class InnerMost
        {
            String j = "ShivuBro";

            public void dis()
            {
                System.out.println("InnerMost: " + outerVariable);
                System.out.println("InnerMost: " + str);
                System.out.println("InnerMost: " + j);
            }
        }
    }

    public class SecondInnerClass
    {
        public void disp()
        {
            System.out.println("Second Inner Class: " + outerVariable);
        }
    }
}

public class NestedClassesOutput
{
    public static void main(String[] args)
    {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
        OuterClass.SecondInnerClass s = outer.new SecondInnerClass();
        System.out.println(inner.str);
        s.disp();
    }
}