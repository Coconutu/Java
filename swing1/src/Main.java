import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main
{
    public static void main(String[] args)
    {
        genereazaWidgets();
        //adaugare comentariu
    }
    public static void genereazaWidgets()
    {
        JFrame frame=new JFrame("Conversie grade Celsius in Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1=new JLabel("Introduceti valoarea in grade Celsius");
        label1.setBounds(10,10,300,20);
        JLabel label2=new JLabel("Rezultat:");
        label2.setBounds(10,90,300,20);
        JLabel label3=new JLabel("");
        label3.setBounds(10,110,300,20);

        JTextField text=new JTextField("100");
        text.setBounds(10,30,80,20);
        JButton buton=new JButton("Conversie");
        buton.setBounds(10,60,100,20);
        buton.setMnemonic(KeyEvent.VK_C);
        buton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            Conversie y=new Conversie();
            double z=Double.parseDouble(text.getText());
            String k=Double.toString(y.ConvertesteToFahrenheit(z));
            label3.setText(k);

            }
        });


        frame.add(buton);
        frame.add(text);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}