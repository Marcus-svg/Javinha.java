import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class AcessControlSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> guestList = new ArrayList<>();

        System.out.println("    Iniciando acesso ao sistema de controle de entrada   ");
        System.out.println("   Para sair e gerar o relatório final digite 'fim'   ");

        while (true) {

            try {

                System.out.println("Digite o nome: ");
                String nameInput = scanner.next();

                if (nameInput.equalsIgnoreCase("fim")) {
                    System.out.println("Acabou o espaço.");
                    break;
                }

                System.out.println("Digite a idade: ");
                int ageInput = scanner.nextInt();

                Person guest = new Person(nameInput, ageInput);
                if (guest.isOfLegalAge()) {

                    guestList.add(guest);
                }

                System.out.println("Total de pessoas na festa: " + guestList.size());

                verification(guest);

            } catch (InputMismatchException e) {

                scanner.nextLine();
                System.out.println("Escreva de forma númerica!");
            }
        }

        System.out.println("\n--- LISTA DE ENTRADA ---");

        for (Person personInside : guestList) {
            System.out.println("Convidado: " + personInside.getName());
        }

    }

    public static void verification(Person parameter) {

        if (parameter.isOfLegalAge()) {
            System.out.println("Acesso permitido para: " + parameter.getName());
            System.out.println("(Maior de idade)");
        } else {
            System.out.println("Acesso negado para: "+ parameter.getName());
            System.out.println("(Menor de idade)");
        }
    }
}