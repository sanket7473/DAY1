package PractiseProblem;

public class StaticProblems {
    static int x=10;
    static int y;
    static void func (int z){
        System.out.println("x is ="+ x);
        System.out.println("y is ="+ y);
        System.out.println("z is ="+ z);
    }

    static {
        System.out.println("Running static initialization block.");
        y = x + 5;
    }

    public static void main(String[] args) {
        func(8);
    }
}
