package jst.aufgaben;

import java.util.Scanner;

public class Novice {

    public Novice() {
        //System.out.println(createStringMyName("Joachim"));
        //System.out.println("\n" + createStringMyNameByFive("Joachim"));
        //ystem.out.println(greatMe(getNameWithScanner()));

    }

    public String createStringMyName(String name) {
        return "Mein Name ist " + name;
    }

    public String createStringMyNameByFive(String name) {
        String nameByFive = "";
        for (int i = 0; i<=4; i++) {
            nameByFive = nameByFive + "Mein Name ist " + name + "\n";
        }
        return nameByFive;
    }

    public boolean isGreaterThen100(int number) {
        if (number <= 100) {
            return false;
        } else {
            return true;
        }
    }

    public int squareOf(int number) {
        return number*number;
    }

    public String greatMe(String name) {
        return "Hallo " + name + "! Ich grüße dich!";
    }

    public String getNameWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo, wer bist du?");
       return scanner.nextLine();
    }
}
