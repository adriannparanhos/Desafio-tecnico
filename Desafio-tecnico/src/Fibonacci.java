import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, next = 0;

        if (num == 0 || num == 1) {
            return true;
        }

        while (next < num) {
            next = a + b;
            a = b;
            b = next;
        }

        return next == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero para verificar se pertence a sequencia de Fibonacci: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O numero " + num + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + num + " não pertence a sequencia de Fibonacci.");
        }

        scanner.close();
    }
}
