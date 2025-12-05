import java.util.Scanner;
import java.util.InputMismatchException;

public class Frigo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {

            System.out.println("Digite sua idade: ");

            try {

                int idade = leitor.nextInt();

                verification(idade);

            } catch (InputMismatchException e) {

                leitor.nextLine();
                System.out.println("Escreva de forma númerica!");
            }

        }
    }

    public static void verification(int idade) {

        if (idade >= 18) {
            System.out.println("Entra man");
        } else {
            System.out.println("Vai catar coquin");
        }
    }
}