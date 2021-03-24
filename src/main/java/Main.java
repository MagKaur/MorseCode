import java.util.Scanner;

class StringToMorseCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        MorseConverter converter = new MorseConverter(sc.nextLine());
        converter.translateToMorse();
        converter.show();
    }
}
