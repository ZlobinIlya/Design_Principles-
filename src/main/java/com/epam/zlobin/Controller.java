package com.epam.zlobin;

public class Controller implements Controllable {

    /**
     * The class that implements the logic of the calculator
     *
     * @param 'Calculatable'  interface
     * @param 'Reportable' interface
     * @param 'lowLimit' low limit
     * @version 1.0
     * @autor Zlobin Ilya
     */
    Calculatable calculatable;
    Reportable reportable;

    public Controller() {

    }

    public void run(Calculatable calculatable, Reportable reportable) {
        if(calculatable == null || reportable == null){
            throw  new IllegalArgumentException();
        }
        reportable.sendReport();
        calculatable.calc();
        if (calculatable.getResault() != 0) {
            reportable.sendCalculatorReport();
        } else {
            reportable.sendDefaultReport();
        }
    }
}
