import java.util.Arrays;
import java.util.Scanner;


public class MorseConverter {
    Scanner sc = new Scanner(System.in);
    private String numberToChange;
    private String translated;
    private String morseCode;


    char[] numbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    String[] morseLetters = {". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .",
            "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};

    public MorseConverter(String textToChange, String translatedText, String morseCode) {
        this.numberToChange = textToChange;
        this.translated = translatedText;
        this.morseCode = morseCode;
    }
    public void getNumber() {
        System.out.println("Enter numbers: ");
        numberToChange = sc.nextLine();
    }

    public void translateToMorse() throws Exception {
        for (int i = 0; i < numberToChange.length(); i++) {
//TODO sprawdzenie czy litery
               for (short j = 0; j < numbers.length; j++) {
               if (numberToChange.charAt(i) == numbers[j]) {
                    translated += morseLetters[j];
                    String result[] = {translated};
                    morseCode = Arrays.toString(result);
                }
            }
        }
    }
    public void show (){
        System.out.println(morseCode);
    }
}

