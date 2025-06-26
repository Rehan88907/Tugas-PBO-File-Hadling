import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
        String sourceFile = "students.csv";
        String targetFile = "students_copy.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File berhasil disalin ke " + targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
