import java.util.Scanner;
import java.util.InputMismatchException;

public class Frigo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {


            try {

                Pessoa cliente = new Pessoa();
                System.out.println("Digite o nome: ");
                cliente.nome = leitor.next();
                System.out.println("Digite a idade: ");
                cliente.idade = leitor.nextInt();

                verification(cliente);

            } catch (InputMismatchException e) {

                leitor.nextLine();
                System.out.println("Escreva de forma númerica!");
            }

        }
    }

    public static void verification(Pessoa parametro) {

        if (parametro.eMaiorDeIdade()) {
            System.out.println("Entra man,"+ parametro.nome);
        } else {
            System.out.println("Vai catar coquin");
        }
    }
}