public class ChildInherit extends ParentInherit
{
    public void multiplication( int x, int y)
    {
        z = x * y;
        System.out.println("The product of the given numbers : " + z);
    }
    public static void main(String args[])
    {
    ChildInherit childinherit = new ChildInherit();
    childinherit.addition(20,10);
    childinherit.subtraction(40,30);
    childinherit.multiplication(5,4);
    }
}
