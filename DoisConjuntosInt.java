package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DoisConjuntosInt {
    public static void main(String[] args){

        String conj1 = JOptionPane.showInputDialog("Digite um conjuto de números separados por espaço: ");
        Set<Integer> conjunto1 = new TreeSet<>(Arrays.asList(Arrays.stream(conj1.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));

        String conj2 = JOptionPane.showInputDialog("Digite um segundo conjunto de números separados por espaço: ");
        Set<Integer> conjunto2 = new TreeSet<>(Arrays.asList(Arrays.stream(conj2.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));

        if (conjunto1.containsAll(conjunto2)){
            JOptionPane.showMessageDialog(null,"O segundo conjunto é um subconjunto do primeiro");
        } else {
            JOptionPane.showMessageDialog(null,"O segundo conjunto é um conjunto original");
        }


    }
}



