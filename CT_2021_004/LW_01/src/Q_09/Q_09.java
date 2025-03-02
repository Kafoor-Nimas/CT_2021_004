package Q_09;
import java.util.Scanner;


public class Q_09 {
    public Q_09(){

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The sentence: ");
        String sentence=scanner.nextLine();
        int count=sentence.length();
        String firstLetter=sentence.substring(0,1);
        String lastLetter=sentence.substring(count-1,count);
        System.out.println("Number of Characters: "+count);
        System.out.println("First Letter: "+firstLetter);
        System.out.println("Last Letter: "+lastLetter);
    }
}
