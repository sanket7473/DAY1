package PractiseProblem;
class Hello
{
    public int gear=5;
    public void barking()
    {
        System.out.println("Dog is barking");
    }
}
public class Displayvalue {
    public static void main(String[] args) {
        Hello h1=new Hello();
        System.out.println(h1.gear);
        h1.barking();
    }
}
