import java.util.Scanner;

/**
 * The main LucasNumbers class that contains the program's entry point.
 */
public class LucasNumbers {
    public static void main(String[] args) {
        int N;
        if (args.length > 0) {
            N = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of Lucas numbers (N): ");
            N = scanner.nextInt();
        }

        LucasNumber[] lucasNumbers = new LucasNumber[N];

        for (int i = 0; i < N; i++) {
            lucasNumbers[i] = new LucasNumber(i);
        }

        System.out.println("Lucas numbers:");

        for (LucasNumber lucasNumber : lucasNumbers) {
            System.out.printf("L(%d) = %d%n", lucasNumber.getIndex(), lucasNumber.getValue());
            if (lucasNumber.isSquarePlusOne()) {
                System.out.printf("Can be expressed as w^2 + 1 (where w = %d)%n", lucasNumber.getW());
            }
        }
    }
}
