import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private static final String FILENAME = "Banco_de_dados.txt";

    public static void saveToFile(ArrayList<Person> list) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {

            for (Person p : list) {

                String line = "";

                if (p instanceof Employee) {

                    Employee e = (Employee) p;
                    line = "FUNCIONARIO;" + e.getName() + ";" + e.getAge() + ";" + e.getBadgeId();
                } else {

                    line = "CONVIDADO;" + p.getName() + ";" + p.getAge() + ";";
                }

                writer.write(line);
                writer.newLine();

            }

            System.out.println("Dados salvos com sucesso em " + FILENAME);

        } catch (IOException e) {
            System.out.println(" Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}