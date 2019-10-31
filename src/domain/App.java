package domain;

import analyse.Report;
import resources.config.ReadConfig;
import sorting.algorithms.BubbleSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Report report = new Report();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime;

        ReadConfig readConfig = new ReadConfig();

        File file = null;
        PrintStream fileOut = null;
        String path = "";

        try {
            path = readConfig.key("pathToExecutionReport");
            file = new File(path);
            fileOut = new PrintStream(file);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.setOut(fileOut);

        int numberOfRepetitions = Integer.parseInt(readConfig.key("numberOfRepetitions"));

        localDateTime = LocalDateTime.now();
        System.out.println("**********************************************");
        System.out.println("    Started at: " + dateTimeFormatter.format(localDateTime));
        System.out.println("**********************************************");

        System.out.println(report.run(numberOfRepetitions));

        localDateTime = LocalDateTime.now();
        System.out.println("**********************************************");
        System.out.println("    Finished at: " + dateTimeFormatter.format(localDateTime));
        System.out.println("**********************************************");

        File finalFile = new File(path.replace("{RUNNING}", dateTimeFormatter.format(localDateTime).replace(" ","T")));

        file.renameTo(finalFile);
    }
}
