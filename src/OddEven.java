public class OddEven {

    public static void findGivenNumberOddOrEven(int number)
    {
        if(number%2==0)
        {
            System.out.println(number + " is an even number" );
        }
            else
            {
            System.out.println(number + " is an odd number" );
            }
    }

    public static void main(String[] args)
    {
        findGivenNumberOddOrEven(20);
        findGivenNumberOddOrEven(79);
    }
}
