public class Multidog extends MultiAnimal
{

    public void bark(){
    System.out.println("Barking");}

    public static void main(String args []){
        Multidog multidog = new Multidog();
        multidog.eat();//parent
        multidog.bark();//child
        //multidog.whip();//child/grandchild so parent and grandparent cannot take there method.
        }
}
