public class StringTest
{
    public static void main(String[] args)
    {
        String S = "HelloWorld";
        System.out.println(S);

        String Output = String.format("You got %d.", 100000);
        System.out.println(Output);

        String Output2 = String.format("%s got %f.", "John", 80.65);
        System.out.println(Output2);
    }
}