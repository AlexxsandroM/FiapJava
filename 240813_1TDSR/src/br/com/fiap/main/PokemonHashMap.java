package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do {
            try {
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite o nome e o tipo do Pokemon ou digite \"FIM\" para encerrar").toUpperCase();
                    if (!sigla.equals("FIM")) {
                        estado = JOptionPane.showInputDialog("Digite o tipo do Pokemon informado anteriormente.");
                        if (mapa.containsKey(sigla)) { // Método que procura chave no obj sigla
                            JOptionPane.showMessageDialog(null, "Este Pokemon já foi cadastrado!");
                        } else {
                            mapa.put(sigla, estado);
                        }
                    }
                } while (!sigla.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite a UF de um Estado a sua escolha").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "O nome completo deste Estado é:" + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}