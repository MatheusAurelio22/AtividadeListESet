package org.example.SetDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class SetDeProdutos {
    public static void main(String[] args){

        Set<Produto> produtos = new HashSet<>();

        String[] produto1 = JOptionPane.showInputDialog("Digite o ID, nome e preço do Produto 1 separados por vírgula:").split(",");
        produtos.add(new Produto(Integer.parseInt(produto1[0]), produto1[1], Double.parseDouble(produto1[2])));

        String[] produto2 = JOptionPane.showInputDialog("Digite o ID, nome e preço do Produto 2 separados por vírgula:").split(",");
        produtos.add(new Produto(Integer.parseInt(produto2[0]), produto2[1], Double.parseDouble(produto2[2])));

        String[] produto3 = JOptionPane.showInputDialog("Digite o ID, nome e preço do Produto 3 separados por vírgula:").split(",");
        produtos.add(new Produto(Integer.parseInt(produto3[0]), produto3[1], Double.parseDouble(produto3[2])));

        JOptionPane.showMessageDialog(null,"Produtos sem repetição: "+ produtos);

    }
}
