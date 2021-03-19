package poo;

import javax.swing.JOptionPane;

public class Exemplo02 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Digite um numero");

        try {
            int num = Integer.parseInt(aux);
            System.out.print("O número digitado foi " + num);

        // Exception => exceção mais genérica
        // Não pode começar por ela
        } catch(Exception e) { 
            System.out.println("Opaaaaaaaaaaaa");
        }
            
    }
}
