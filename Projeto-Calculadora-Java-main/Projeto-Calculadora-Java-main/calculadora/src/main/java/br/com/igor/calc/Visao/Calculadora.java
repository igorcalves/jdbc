package br.com.igor.calc.Visao;

import java.awt.*;
import javax.swing.JFrame;


public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();

        setSize(229, 339);
        // setUndecorated(true); // tirar a barra de cima de maximizar minimizar ou
        // fechar
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());
        Display display = new Display();
        display.setPreferredSize(new Dimension(225, 60));
        add(display, BorderLayout.NORTH);
        Teclado teclado = new Teclado();
        add(teclado);
    }

    public static void main(String[] args) {

        new Calculadora();

    }

}
