package jst.aufgaben;

import java.util.Scanner;

public class IntermediateArray {
    Scanner myScanner = new Scanner(System.in);

    public IntermediateArray() {
        System.out.println("Gib das erste Wort ein:");
        String[] startArray = buildNewArray(myScanner.nextLine());
        typeInNewWord(startArray);

    }

    private String[] addWordsToArray(String[] oldArray, String word) {
        String[] newArray = new String[oldArray.length + 1];

        for (int i = 0; i<= oldArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = word;
        return newArray;
    }

    public String[] buildNewArray(String word) {
        String[] newArray = {word};
        return newArray;
    }

    public String getWordsToDisplay(String[] array) {
        String displayString = "Wörter im Array: ";
        for (int i = 0; i <= array.length -1; i++) {
            displayString = displayString + "\t" + array[i];
        }
        return displayString;
    }

    public void typeInNewWord(String[] array) {
        System.out.println(getWordsToDisplay(array));
        String[] newArray = addWordsToArray(array, myScanner.nextLine());

        if (!(newArray[newArray.length - 1].equals("Abbrechen"))) {
            typeInNewWord(newArray);
        }

    }
}
