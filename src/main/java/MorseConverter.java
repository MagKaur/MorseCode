
public class MorseConverter {
    private String numberToChange;
    private String translated = "";
    private Boolean komunikat = false;

    char[] numbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    String[] morseLetters = {". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .",
            "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};

    //konstruktor
    public MorseConverter(String text)
    {
        this.numberToChange = text;
    }

    //zwraca index litery z tablicy numbers
    private int findIndex(char letter)
    {
        for (int i = 0; i < this.numbers.length; i++)
        {
            //lecimy po całej tablicy numbers
            if(letter == this.numbers[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void translateToMorse()
    {
        //lecimy po całym tekście użytkownika
        for(int i = 0; i < this.numberToChange.length(); i++)
        {
            if(this.findIndex(this.numberToChange.charAt(i)) > -1)
            {
                this.translated += this.morseLetters[this.findIndex(this.numberToChange.charAt(i))];
                this.translated += "   ";
            }
            else
            {
                this.komunikat = true;
            }
        }
    }

    //ponieważ zmienna transtalted jest prywatna
    public String getTranslated() {
        return translated;
    }

    public void show() {
        if(this.komunikat) {
            System.out.println("Można przetłumaczyć jedynie cyfry!");
            System.out.println("");
        }
        System.out.println("Przetłumaczone cyfry: ");
        System.out.println(this.getTranslated());
    }
}

