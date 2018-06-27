package br.com.Gabriel;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int erro;
        File raiz = null;
        JFileChooser fc1 = new JFileChooser();
        fc1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            JOptionPane.showMessageDialog(null,"Selecione a pasta que deseja organizar");
        int res = fc1.showOpenDialog(null);

        if(res == JFileChooser.APPROVE_OPTION){
            raiz = fc1.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Pasta selecionada: " + raiz.getName());
            Organizar teste = new Organizar();
            erro = teste.Organizando(raiz);
            if (erro == 0) {
                JOptionPane.showMessageDialog(null, "Organização realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Organização realizada porém com erros!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada.");
        }

        //raiz = new File(Paths.get("C:\\Users\\newtasks01\\Desktop\\Excel").toAbsolutePath().normalize().toString());

    }
}
