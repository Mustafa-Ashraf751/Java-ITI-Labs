package task1;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DateTimeApp extends JFrame implements Runnable {

    Thread th;
    Date date = new Date();
    JLabel jLabel = new JLabel();

    public DateTimeApp()  {
        this.setTitle("Date && Time application");
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setText(date.toString());
        this.add(jLabel,BorderLayout.CENTER);
         th = new Thread(this);
         th.start();
    }


    @Override
    public void run()  {
       while(true){
           try{
           date = new Date();
           jLabel.setText(date.toString());
           Thread.sleep(100);
           }catch (InterruptedException i){
               System.out.println(i.getMessage());
           }
       }
    }
}
