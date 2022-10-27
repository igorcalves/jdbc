package br.com.igor.Senhas.Visao;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.igor.Senhas.Modelo.Memoria;

public class Teclado extends JPanel implements ActionListener {

    private final Color VERMELHO = new Color(178, 17, 17);
    


    public Teclado(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();    
        c.weightx = 1;
        c.weighty = 1;
        setLayout(layout);
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 1;
        adicionarBotao("1", VERMELHO, c, 1, 0);
        adicionarBotao("2", VERMELHO, c, 2, 0);
        adicionarBotao("3", VERMELHO, c, 3, 0);
        adicionarBotao("4", VERMELHO, c, 1, 1);
        adicionarBotao("5", VERMELHO, c, 2, 1);
        adicionarBotao("6", VERMELHO, c, 3, 1);
        adicionarBotao("7", VERMELHO, c, 1, 2);
        adicionarBotao("8", VERMELHO, c, 2, 2);
        adicionarBotao("9", VERMELHO, c, 3, 2);
        c.gridwidth = 3;
        adicionarBotao("0", VERMELHO, c, 1, 3);
        c.gridwidth = 3;
        adicionarBotao("ENTER", VERMELHO, c, 1, 4);
        c.gridwidth = 3;
        adicionarBotao("Apagar", VERMELHO, c, 1, 5);
        c.gridwidth = 3;
        adicionarBotao("Mostrar", VERMELHO, c, 1, 6);
        
    }

    public void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y){
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, c);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() instanceof JButton) {
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processarComando(botao.getText());
         }
         
    
    
}
}
