package com.epam.zlobin;

/**
 * Main class Application
 * @version 1.0
 * @autor Zlobin Ilya
 */
public class Application {
    private static final int LOW_LIMIT = 1;
    private static final int HEIGHT_LIMIT = 12;
    private static final int[] VALUE = {-50, 0, 3, 1, -8, 10, 25};

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            Calculatable calculator = new Calculator(LOW_LIMIT, HEIGHT_LIMIT, VALUE);
            Reportable report = new Report(calculator);
            Controllable controller = new Controller();
            controller.run(calculator, report);
        }
        catch (IllegalArgumentException e){
            Reportable report = new Report();
            report.sendErrorReport(e);
        }
    }
}
