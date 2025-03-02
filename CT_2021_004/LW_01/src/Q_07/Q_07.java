package Q_07;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public Q_07(){

    }
    public static void main(String[] args){
        JFrame frame=new JFrame();
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
        String fTitle=sdf.format(today);
        frame.setSize(500,250);
        frame.setTitle(fTitle);
        frame.setVisible(true);


    }

}
