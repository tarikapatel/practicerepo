public class Multibabydog extends Multidog
{

    public void whip() {
        System.out.println("whipping");
    }
  public static void main(String args []){
        Multibabydog multibabydog = new Multibabydog();
        multibabydog.eat();//Grand parent
        multibabydog.bark();//Parent
        multibabydog.whip();//child/grandchild

  }


}
