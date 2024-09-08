package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ListasIntUniEInterc {
    public static void main(String[] args){

        String conjunt1 = JOptionPane.showInputDialog("Digite um conjuto de números separados por espaço: ");
        Set<Integer> conjunto1 = new TreeSet<>(Arrays.asList(Arrays.stream(conjunt1.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));

        String conjunt2 = JOptionPane.showInputDialog("Digite um segundo conjunto de números inteiros separados por espaço: ");
        Set<Integer> conjunto2 = new TreeSet<>(Arrays.asList(Arrays.stream(conjunt2.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));

        Set<Integer> uniao = new TreeSet<>(conjunto1);
        uniao.addAll(conjunto2);

        Set<Integer> intercecao = new TreeSet<>(conjunto1);
        intercecao.retainAll(conjunto2);

        JOptionPane.showMessageDialog(null,"Esta é a união dos dois conjuntos: "+uniao);
        JOptionPane.showMessageDialog(null,"Esta é a interseção dos dois conujntos: "+intercecao);



    }
}
