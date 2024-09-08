package org.example;

import javax.swing.*;
import java.util.*;

public class ListaNumDuplicados {
    public static void main(String[] args){

        String numeros = JOptionPane.showInputDialog("Digite um conjunto de números separados por espaço: ");
        List<Integer> numerosDuplicados = new ArrayList<>(Arrays.asList(Arrays.stream(numeros.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));

        Set<Integer> numerosFiltrados = new TreeSet<>(numerosDuplicados);

        JOptionPane.showMessageDialog(null,"Lista Original: "+ numerosDuplicados);
        JOptionPane.showMessageDialog(null,"Lista Filtrada: "+ numerosFiltrados);







    }
}
