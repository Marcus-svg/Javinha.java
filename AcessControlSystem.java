import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class AcessControlSystem {
    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in, "Cp850");
        ArrayList<Person> guestList = new ArrayList<>();

        System.out.println("    Iniciando acesso ao sistema de controle de entrada   ");
        System.out.println("   Para sair e gerar o relatório final digite 'fim'   ");

        while (true) {

            try {

                System.out.println("----------------------------");
                System.out.println("Quem voçê deseja cadastrar?");
                System.out.println("1 - Convidado comum");
                System.out.println("2 - Funcionário");
                System.out.println("Opção: ");
                
                String option = scanner.next();

                if (option.equalsIgnoreCase("fim")) break;

                System.out.println("Digite o nome: ");
                String nameInput = scanner.next();
                if (option.equalsIgnoreCase("fim")) break;

                System.out.println("Digite a idade: ");
                int ageInput = scanner.nextInt();

                Person person;

                if (option.equals("2")) {

                    System.out.println("Digite o ID do crachá: ");
                    String badgeInput = scanner.next();

                    person = new Employee(nameInput, ageInput, badgeInput);
                } else {

                    person = new Guest(nameInput, ageInput);
                }

                processEntry(person, guestList);
                
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite apenas números nos campos numéricos.");
                    scanner.nextLine();
                }
            }

            generateFinalReport(guestList);
            scanner.close();
        }
        public static void processEntry(Person p, ArrayList<Person> list) {
            if (p.isOfLegalAge()) {
                list.add(p);
                System.out.println("[SUCESSO] Entrada autorizada: " + p.getName());
            } else {
                System.out.println("[NEGADO] Menor de idade.");
            }
        }

        public static void generateFinalReport(ArrayList<Person> list) {
            System.out.println("\n================================");
            System.out.println("   RELATÓRIO FINAL   ");
            System.out.println("================================");

            if (list.isEmpty()) {
                System.out.println("Sem convidado registrado");
            } else {
                for (Person p : list) {

                System.out.println(p.toString());
            }
        }
        System.out.println("================================");
    }
}