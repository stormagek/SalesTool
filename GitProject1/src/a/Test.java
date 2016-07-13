package a;

public class Test
{
    private static void displayGreeting ()
    {
        System.out.println("Hello Happy Sales PPL");
        System.out.println("This App Shows Sales Data");
    }

    public static void main (String[] args)
    {
        SalesData data = new SalesData();
        displayGreeting();
        data.display();
    }

}
