package org.example;

import javax.swing.*;
import java.util.Set;
import java.util.TreeSet;

public class ListaOrdemAlfabética {
    public static void main(String[] args) {

        String palavras =JOptionPane.showInputDialog("Digite uma lista de palavras separadas por espaço: ");

        String[] palavrasInput = palavras.split(" ");

        Set<String> palavrasSet = new TreeSet<>();

        for (String palavra : palavrasInput){
            palavrasSet.add(palavra);
        }

        JOptionPane.showMessageDialog(null, "Contagem de palavras únicas: " + palavrasSet.size() + "\n" +
                "Palavras únicas em ordem alfabética: " + palavrasSet);



    }
}