package poo;

import javax.swing.JOptionPane;

public class Exemplo07 {

    public static void main(String[] args) {

        Exemplo07 e = new Exemplo07();

        e.teste();

    }

    public void teste() {
        String aux = JOptionPane.showInputDialog(null, "Digite um numero positivo");

        try {
            int num = Integer.parseInt(aux);
            System.out.print("O número digitado foi " + num + "\n");

            if (num < 0) {
                throw new MinhaExcecao2("Valor deve ser POSITIVO.");
            }

        } catch(NumberFormatException e) {
            System.out.println("Opaaaaaaaaaaaa");
            
        }
            
    }
}
