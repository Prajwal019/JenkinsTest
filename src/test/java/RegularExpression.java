public class RegularExpression
{
    public static void main(String[] args)
    {
//        String str="12";
//        System.out.println(str.matches("0[1-9]|1[0-2]"));
//        System.out.println(str.matches("0[1-9]|1[0-2]|[:]"));


//        String g="194.233.123.253";
//        System.out.println(g.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|25[0-5]|2[0-4][0-9])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|25[0-5]|2[0-4][0-9])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|25[0-5]|2[0-4][0-9])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|25[0-5]|2[0-4][0-9])"));

//        String str3="inbox";
//        System.out.println(str3.matches("inbox|inbox\\([1-9]+\\)"));

        String str4 = "Alphd13722323@gmail.com";
        System.out.println(str4.matches("[a-zA-z][a-zA-Z0-9._$]{3,13}@gmail.com"));
    }
}
