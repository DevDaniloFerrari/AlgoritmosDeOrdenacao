package domain;

import analyse.Report;

public class App {
    public static void main(String[] args) {
        Report report = new Report();

        System.out.println(report.run(50));
    }
}
