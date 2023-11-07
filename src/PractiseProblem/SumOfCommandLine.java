package PractiseProblem;

public class SumOfCommandLine {

    public static void main(String[] args) {
        int sum = 0;
        int invalidCount=0;
        System.out.println("Calculates Sum for below Integers");
        for(int i=0;i<args.length;i++){
            try {
                System.out.println(args[i]);
                sum = sum + Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e) {
                invalidCount++;
            }
        }
        System.out.println("Sum of the give values "+sum);
        System.out.println("Invalid integer is Entered "+invalidCount);

    }
}
