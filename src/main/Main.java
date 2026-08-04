package main;

import javax.swing.SwingUtilities;
import view.TelaJogoDaVelha;

public class Main {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaJogoDaVelha tela = new TelaJogoDaVelha();
            tela.setVisible(true);
        });
    }
    
}
