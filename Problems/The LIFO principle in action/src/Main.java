import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        Deque<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers.offer(number);
        }
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pollLast());
        }
    }
}