package com.company;

public class Temp {

    void convert() {
        TemperatureConverter temperatura = new TemperatureConverter();
        String result = temperatura.convertTemp(80, 'F');
        System.out.println("result " + result);
        //temperatura.convertTemp(50, 'C');
    }
}
