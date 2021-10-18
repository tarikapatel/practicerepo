public class ChildInherit extends ParentInherit
{
    public void multiplication( int x, int y)
    {
        z = x * y;
        System.out.println("The product of the given numbers : " + z);
    }
    public static void main(String args[])
    {
    int a = 20, b =10;
    ChildInherit childinherit = new ChildInherit();
    childinherit.addition(a,b);
    childinherit.subtraction(a,b);
    childinherit.multiplication(a,b);
    }
}
