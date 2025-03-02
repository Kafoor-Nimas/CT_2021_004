package Q_02;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;

public class Q_02 {
    public Q_02(){

    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fName=scanner.next();
        System.out.println("Enter your Last Name: ");
        String lName=scanner.next();
        JFrame window=new JFrame();
        window.setSize(800,600);
        window.setTitle(fName + " "+lName);
        window.setVisible(true);
        window.setDefaultCloseOperation(3);



    }
}
