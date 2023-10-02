import java.util.Scanner;     // Activing 'Scanner' Library

public class VowelOrConsonant {
    public static void main(String[] args) {

        char letter;     // Declaring the Variable

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");   letter = input.next().charAt(0);     // Receiving Input from the user

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is VOWEL.");     // If the Letter received from the user is VOWEL, print this message.
        }
        else {
            System.out.println(letter + " is CONSONANT.");     // If the Letter received from the user is CONSONANT, print this message.
        }
    }
}