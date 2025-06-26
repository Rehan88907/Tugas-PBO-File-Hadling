import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            System.out.println("Masukkan data mahasiswa baru:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Umur: ");
            String umur = scanner.nextLine();
            System.out.print("Prodi: ");
            String prodi = scanner.nextLine();

            String newLine = nim + "," + nama + "," + umur + "," + prodi;
            bw.write(newLine);
            bw.newLine();
            System.out.println("Data berhasil ditambahkan.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
