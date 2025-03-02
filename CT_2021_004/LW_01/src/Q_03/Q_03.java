package Q_03;
import java.util.Scanner;

public class Q_03 {
    public Q_03(){

    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first Name: " );
        String fName=scanner.next();
        System.out.println("Enter Your Middle Name: ");
        String mName=scanner.next();
        System.out.println("Enter Your Last Name : ");
        String lName=scanner.next();
        String middleInitial=mName.substring(0,1);
        System.out.println(fName+" "+middleInitial+"."+lName);
    }
}
