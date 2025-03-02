package Q_08;
import java.util.Scanner;


public class Q_08 {
    public Q_08(){

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence with ! symbol: ");
        String word=scanner.nextLine();
        int exlaminationMark=word.indexOf(33);
        String firststring=word.substring(0,exlaminationMark).trim();
        String secondString=word.substring(exlaminationMark+1).trim();
        System.out.println("Before ! : "+firststring);
        System.out.println("After ! : "+secondString);
    }
}
