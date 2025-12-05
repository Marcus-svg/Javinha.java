import java.util.Scanner;
import java.util.InputMismatchException;

public class Frigo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Digite o nome: ");
                String nomeDigitado = leitor.next();

                System.out.println("Digite a idade: ");
                int idadeDigitada = leitor.nextInt();

                Pessoa cliente = new Pessoa(nomeDigitado, idadeDigitada);

                verification(cliente);

            } catch (InputMismatchException e) {

                leitor.nextLine();
                System.out.println("Escreva de forma númerica!");
            }
        }

    }

    public static void verification(Pessoa parametro) {

        if (parametro.eMaiorDeIdade()) {
            System.out.println("Entra man," + parametro.nomeDigitado);
        } else {
            System.out.println("Vai catar coquin");
        }
    }
}