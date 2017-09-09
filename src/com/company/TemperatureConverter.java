package com.company;

public class TemperatureConverter {

    public String convertTemp(int temperature, char convertTo) {
        /* Если аргумент convertTo равен F, то температура
        должна быть преобразована в Фаренгейты */
        if (convertTo == 'C') {
            temperature = temperature * 9 / 5 - 32;
            return temperature + "F";
        } else if (convertTo == 'F') {
            temperature = temperature - 32 * 9 / 5;
            return temperature + "C";
        }
        return "Error ";
    }
}
