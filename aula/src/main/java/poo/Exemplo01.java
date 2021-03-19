package poo;

import javax.swing.JOptionPane;

public class Exemplo01 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Digite um numero");

        try {
            int num = Integer.parseInt(aux);
            System.out.print("O número digitado foi " + num);

        } catch(NumberFormatException e) {
            System.out.println("Opaaaaaaaaaaaa");
        }
            
    }
}
