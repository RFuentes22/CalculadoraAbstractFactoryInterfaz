/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Aritmetica.Aritmetica;
import Conversor.Conversor;
import calculabo.AbstractFactory;
import calculabo.operacionProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    AbstractFactory operacionA,operacionC;
    public int WIDTH=300,widthTF=80,widthB=80;
    public int HEIGHT=360,heightTF=30,heightB=30;
    public JTextField textF1,textF2,textF3,textF4;
    public JButton button1,button2,button3,button4,button5,button6,button7;
    public JLabel textF5,textF6;
    public Ventana() {
        operacionA=operacionProducer.getOperacion("o");
        operacionC=operacionProducer.getOperacion("c");
        Aritmetica suma=operacionA.getAritmetica("+");
        Aritmetica resta=operacionA.getAritmetica("-");
        Aritmetica multiplicacion=operacionA.getAritmetica("*");
        Aritmetica division=operacionA.getAritmetica("/");
        Conversor binario=operacionC.getConversor("b");
        Conversor hexa=operacionC.getConversor("h");
        Conversor octa=operacionC.getConversor("o");
        textF1=new JTextField();
        textF1.setBounds(new Rectangle(50,40,widthTF,heightTF));
        textF2=new JTextField();
        textF2.setBounds(new Rectangle(131,40,widthTF,heightTF));
        textF3=new JTextField();
        textF3.setBounds(new Rectangle(100,320,widthTF,heightTF));
        textF4=new JTextField();
        textF4.setBounds(new Rectangle(100,205,widthTF,heightTF));
        textF5=new JLabel("CALCULADOR");
        textF5.setBounds(100, 0, widthTF, heightTF);
        textF6=new JLabel("CONVERSOR");
        textF6.setBounds(100, 165, widthTF, heightTF);
        button1=new JButton("+");
        button1.setBounds(new Rectangle(50,100,widthB,heightB));
        button2=new JButton("-");
        button2.setBounds(new Rectangle(131,100,widthB,heightB));
        button3=new JButton("x");
        button3.setBounds(new Rectangle(50,131,widthB,heightB));
        button4=new JButton("/");
        button4.setBounds(new Rectangle(131,131,widthB,heightB));
        button5=new JButton("Binario");
        button5.setBounds(new Rectangle(50,240,widthB,heightB));
        button6=new JButton("Hexadecimal");
        button6.setBounds(new Rectangle(131,240,widthB,heightB));
        button7=new JButton("Octal");
        button7.setBounds(new Rectangle(50,271,widthB,heightB));
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(String.valueOf(suma.calcular(Double.parseDouble(textF1.getText()), Double.parseDouble(textF2.getText()))));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(String.valueOf(resta.calcular(Double.parseDouble(textF1.getText()), Double.parseDouble(textF2.getText()))));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(String.valueOf(multiplicacion.calcular(Double.parseDouble(textF1.getText()), Double.parseDouble(textF2.getText()))));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(String.valueOf(division.calcular(Double.parseDouble(textF1.getText()), Double.parseDouble(textF2.getText()))));
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(binario.Convertir(Integer.parseInt(textF4.getText()))
                );
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(hexa.Convertir(Integer.parseInt(textF4.getText()))
                );
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF3.setText(octa.Convertir(Integer.parseInt(textF4.getText()))
                );
            }
        });
        add(textF1);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(textF2);
        add(textF3);
        add(textF4);
        add(textF5);
        add(textF6);
        
        setLayout(null); 
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
}
