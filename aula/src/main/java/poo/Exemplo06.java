package poo;

import javax.swing.JOptionPane;

public class Exemplo06 {

    public static void main(String[] args) {

        try {
            new Exemplo06().teste();

        } catch (MinhaExcecao1 e) {
            System.out.println("EPA");
        }
    }

    public void teste() throws MinhaExcecao1 {
        String aux = JOptionPane.showInputDialog(null, "Digite um numero positivo");

        try {
            int num = Integer.parseInt(aux);
            System.out.print("O número digitado foi " + num + "\n");

            if (num < 0) {
                throw new MinhaExcecao1("Valor deve ser POSITIVO.");
            }

        } catch(NumberFormatException e) {
            System.out.println("Opaaaaaaaaaaaa");
            
        }
            
    }
}
