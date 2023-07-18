package views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraInterface{
        
    public PrimeiraInterface(){
        JFrame janela = new JFrame("Minha primeira janela!");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(500, 500);
        janela.setLayout(null);
        
        
        JButton botao = new JButton("Clique aqui!");
        botao.setBounds(200,250,150,25);
        
        JTextField input = new JTextField();
        input.setBounds(200,300,150,50);
        
        JLabel texto = new JLabel("iaghd");
         texto.setBounds(300,300,150,50);
        
        
        botao.addActionListener((ActionEvent e) -> {
            System.out.println("Clicou");
        });
       
        
    
        janela.add(botao);
        janela.add(texto);
        janela.add(input);
        
        janela.setVisible(true);
    
    
    
    }
    
    
}