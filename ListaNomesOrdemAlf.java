package org.example;

import javax.swing.*;
import java.util.*;

public class ListaNomesOrdemAlf {
    public static void main(String[] args){

        String nomes = JOptionPane.showInputDialog("Digite uma lista de nomes separados por espaço: ");

        List<String> nomesNaoFiltrados = new ArrayList<>(Arrays.asList(nomes.split(" ")));

        nomesNaoFiltrados.sort(String::compareTo);
        Set<String> nomesFiltrados = new TreeSet<>(nomesNaoFiltrados);

        JOptionPane.showMessageDialog(null,"Lista de nomes filtrada e ordenada alfabeticamente: "+ nomesFiltrados);



    }
}
