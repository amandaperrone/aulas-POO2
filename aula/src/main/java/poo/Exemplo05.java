package poo;

import javax.swing.JOptionPane;

public class Exemplo05 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Digite um numero positivo");

        try {
            int num = Integer.parseInt(aux);
            System.out.print("O número digitado foi " + num + "\n");

            if (num < 0) {
                throw new IllegalArgumentException("Valor deve ser POSITIVO.");
            }

        } catch(NumberFormatException e) {
            System.out.println("Opaaaaaaaaaaaa");
            
        }
            
    }
}
