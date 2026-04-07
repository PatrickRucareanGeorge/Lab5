package StudentNou;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {

    public static void main(String[] args) {

        List<StudentBursier> bursieri = new ArrayList<>();

        bursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
        bursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
        bursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
        bursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 780.80));


        String numeFisier = "bursieri_out.txt";
        salvareInFisier(numeFisier, bursieri);

        System.out.println("Datele au fost salvate cu succes în fișierul: " + numeFisier);
    }

    public static void salvareInFisier(String numeFisier, List<? extends Student> colectieStudenti) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            for (Student student : colectieStudenti) {
                writer.write(student.toString());
                writer.newLine(); // Trece la rândul următor în fișier
            }
        } catch (IOException e) {
            System.err.println("A apărut o eroare la scrierea în fișier: " + e.getMessage());
        }
    }
}
