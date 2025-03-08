package APP.Controller;

import java.io.*;
import java.time.LocalDate;

public class UpdateTracker {

    private static final String FILE_NAME = "C:\\Users\\nagyb\\Java_projects\\MusicForEachMood\\src\\main\\java\\APP\\Controller\\lastUpdateDate.txt";

    public static LocalDate getLastUpdateDate() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String date = reader.readLine();
            System.out.println(date);
            return date != null ? LocalDate.parse(date) : null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setLastUpdateDate(LocalDate date) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(date.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
