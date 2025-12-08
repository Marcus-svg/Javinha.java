import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Frigo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ArrayList<Pessoa> listaDeClientes = new ArrayList<>();

        while (true) {

            try {

                System.out.println("Digite o nome: ");
                String nomeDigitado = leitor.next();

                System.out.println("Digite a idade: ");
                int idadeDigitada = leitor.nextInt();

                Pessoa cliente = new Pessoa(nomeDigitado, idadeDigitada);
                if(cliente.eMaiorDeIdade()) {
                
                    listaDeClientes.add(cliente);
                }

                System.out.println("Total de pessoas na festa: " + listaDeClientes.size());

                verification(cliente);

            } catch (InputMismatchException e) {

                leitor.nextLine();
                System.out.println("Escreva de forma númerica!");
            }
        }

    }

    public static void verification(Pessoa parametro) {

        if (parametro.eMaiorDeIdade()) {
            System.out.println("Entra man," + parametro.getNomeDigitado());
        } else {
            System.out.println("Vai catar coquin");
        }
    }
}