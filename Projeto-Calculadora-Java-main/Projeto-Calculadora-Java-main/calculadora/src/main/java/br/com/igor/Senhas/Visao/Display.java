package br.com.igor.Senhas.Visao;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.igor.Senhas.Modelo.Memoria;
import br.com.igor.Senhas.Modelo.Observadores;


public class Display extends JPanel implements Observadores{

    static  JLabel label;
    
    

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        setBackground(new Color(0, 0, 0));
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);

    }



    @Override
    public void ValorAlterado(String novoValor) {
        label.setText(novoValor);
        
    }
    

    
    
}
