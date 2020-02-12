package solver;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.nextLine();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double y = (f - c * d / a) / (e - b * d / a);
        double x = (c - b * y) / a;
        System.out.println(x + " " + y);
    }
}
