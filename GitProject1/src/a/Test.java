package a;

//This class is for Testing purposes only!!!!!!............!!!!!!!!!!!!!!!!!
public class Test
{
    private static void displayGreeting ()
    {
        System.out.println("Hello Happy Sales PPL");
        System.out.println("This App Shows Sales Data");

        System.out.println("Test 1");
    }

    public static void main (String[] args)
    {
        SalesData data = new SalesData();
        displayGreeting();
        data.display();
    }

}
