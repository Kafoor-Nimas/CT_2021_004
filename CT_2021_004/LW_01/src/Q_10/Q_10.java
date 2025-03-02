package Q_10;

import java.util.Scanner;

public class Q_10 {
    public Q_10() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word: ");
        String sentence = scanner.nextLine();
        int numofChar = sentence.length();
        int indexOfMiddle = numofChar / 2;
        String middleChar = sentence.substring(indexOfMiddle, indexOfMiddle + 1);
        System.out.println("Middle Letter: "+middleChar);
    }
}
