package PractiseProblem;

public class GetNameCommandLine {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++) {
            System.out.printf(" command line argument is " + args[i]+"\n");
        }
    }
}
