public class OperatorsTest {
    public static void main (String args[])
    {int a = 50;
    int b = 25;
    //int c = 50;
    System.out.println("Addition = " + (a+b));//addition
    System.out.println("Subtraction = " + (a-b));//subtraction
    System.out.println("Multiplication = " + (a*b));//Multiplication
    System.out.println("Division = " + (a/b)); //Division
    System.out.println("The remainder is = " +(a%b));//Modulus
    System.out.println("Increment for first time print value itself = " + (a++)); //Increment = 50
    System.out.println("Increment by value 1 = " + (a++)); //Increment - 50+1
    System.out.println("Increment  = " + (++a)); //Increment need clarity why 53
    System.out.println("Increment = " + (++a)); //Increment 1+53
    System.out.println("Decrement for first time print value itself = "+ (b--));//Decrement = 25
    System.out.println("decrement by value 1 =  " + (b--));//decrement 25-1 =24
    System.out.println("Decrement " + (--b));// Decrement need clarity why 22
    System.out.println("Decrement " + (--b));// Decrement = 21
    System.out.println("Values of two operands A and B are equal or not, if NO then FALSE. " + (a == b));
    //System.out.println("Values of two operands A and C are equal or not, if yes then TRUE. " + (a == c));
    System.out.println("Values of two operands A and B are equal or not, if NO then TRUE. " + (a!= b));
    //System.out.println("Values of two operands A and C are equal or not, if YES then False. " + (a!= c));
    System.out.println("Check if the value of left operand is greater than the value of the right operand?  " + (a>b));
    System.out.println("Check if the value of left operand is less than the value of the right operand?  " + (a<b));
    System.out.println("Check if the value of left operand is greater than or equal to the value of right operand, if yes print true. " + (a>=b));
    System.out.println("Check if the value of left operand is less than or equal to the value of right operand, if yes print false. " + (a<=b));
    System.out.println("Check if the value of right operand is less than or equal to the value of left operand, if yes print true. " + (b<=a));
    }
}
