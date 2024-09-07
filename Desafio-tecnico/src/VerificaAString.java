import java.util.Scanner;

public class VerificaAString {

    public static void verificarLetraA(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez na string.");
        } else {
            System.out.println("A letra 'a' nao esta presente na string.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String str = scanner.nextLine();

        verificarLetraA(str);

        scanner.close();
    }
}
