package Q_06;
import java.util.Scanner;
import javax.swing.JFrame;

public class Q_06 {
    public Q_06(){

    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Width: ");
        int width=scanner.nextInt();
        System.out.println("Enter Heigh: ");
        int height=scanner.nextInt();
        System.out.println("Enter the frame title: ");
        String frameTitle=scanner.next();
        frameTitle=frameTitle+scanner.nextLine();
        scanner.close();
        JFrame frame=new JFrame();
        frame.setSize(width,height);
        frame.setTitle(frameTitle);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
