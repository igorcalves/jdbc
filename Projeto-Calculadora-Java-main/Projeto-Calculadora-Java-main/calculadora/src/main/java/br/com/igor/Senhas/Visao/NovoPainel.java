package br.com.igor.Senhas.Visao;

import java.awt.*;

import javax.swing.JFrame;

public class NovoPainel {

    public static JFrame CriarPainel(){
        
        JFrame janela = new JFrame("Senha");
        janela.setLayout(new BorderLayout());
        janela.setSize(229, 339);
        janela.setLocationRelativeTo(null);
        Teclado teclado = new Teclado();
        janela.add(teclado);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Display display = new Display();
        display.setPreferredSize(new Dimension(225, 60));
        janela.add(display, BorderLayout.NORTH);
        janela.setVisible(true);
        
        return janela;
        
    }
    
}
