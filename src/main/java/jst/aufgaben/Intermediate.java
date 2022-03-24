package jst.aufgaben;

public class Intermediate {


    public Intermediate() {
        printNumberStrings();

    }

    public String getNumberName(int number) {
        String[] zahlworte = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        return zahlworte[number - 1];

    }

    public boolean isDivideableByThree(int number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;

    }

    public boolean isDivideableByFive(int number) {
        if (number % 5 == 0) {
            return true;
        }
        return false;
    }

    public String getStringForNumber(int number) {
        String numberstring = Integer.toString(number);
        if (isDivideableByThree(number)) {
            numberstring = "#" + numberstring;
        }
        if (isDivideableByFive(number)) {
            numberstring = "$" + numberstring;
        }
        return numberstring;
    }

    public void printNumberStrings() {
        for (int i=1;i<=100;i++) {
            System.out.println(getStringForNumber(i));
        }
    }
}
