
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureReader {

    public static void main(String[] args) {

        String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double temperatureSum = 0;
        int count = 0;

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm");

        //date we want to calculate
        LocalDate targetDate = LocalDate.of(2023, 1, 1);

        try {
            URL fileUrl = new URL(url);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            fileUrl.openStream(),
                            StandardCharsets.UTF_8
                    )
            );

            //read the column names
            String header = reader.readLine();

            String[] columns = header.split(";");

            //find the position of the UlkoTalo column
            int temperatureColumn = -1;

            for (int i = 0; i < columns.length; i++) {
                if (columns[i].trim().equals("UlkoTalo")) {
                    temperatureColumn = i;
                    break;
                }
            }

            if (temperatureColumn == -1) {
                System.out.println("UlkoTalo column was not found.");
                reader.close();
                return;
            }

            String line;

            //read the remaining rows
            while ((line = reader.readLine()) != null) {

                String[] data = line.split(";");

                //read the date and time
                LocalDateTime dateTime = LocalDateTime.parse(
                        data[0],
                        formatter
                );

                //only process measurements from 1 January 2023
                if (dateTime.toLocalDate().equals(targetDate)) {

                    //read the UlkoTalo temperature
                    String temperatureText = data[temperatureColumn];

                    //convert comma decimal to dot decimal
                    double temperature =
                            Double.parseDouble(
                                    temperatureText.replace(",", ".")
                            );

                    temperatureSum += temperature;
                    count++;
                }
            }

            reader.close();

            //calculate and print the average
            if (count > 0) {
                double average = temperatureSum / count;

                System.out.println("Date: " + targetDate);
                System.out.println("Number of measurements: " + count);
                System.out.println("Average UlkoTalo temperature: "
                        + average + " °C");
            } else {
                System.out.println("No measurements found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
