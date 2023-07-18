/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.desi.java;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nycolas_teixeira
 */
public class Semana02DesiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        metodoJoption();

    }

    public static void metodoJoption() {
        String nome = JOptionPane.showInputDialog("Hello World");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade: ", "Idade", JOptionPane.INFORMATION_MESSAGE));

        int share = JOptionPane.showConfirmDialog(null, "deseja compartilhar suas infos?");
        if (share == JOptionPane.YES_OPTION) {
            System.out.println("vc vai compartilhar");
        } else if (share == JOptionPane.NO_OPTION) {
            System.out.println("suas infos nao serao compartilhadas");
        } else if (share == JOptionPane.CANCEL_OPTION) {
            System.out.println("vc n autorizou");
            System.exit(0);
        }

        int confirm = JOptionPane.showConfirmDialog(null, "deseja compartilhar suas infos?", "cadastro", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Seu nome deu certo"+nome);
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "a casa caiu", "errou", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void metodoScanner() {
        String nomeAlunos[] = new String[5];
//        boolean situacaoAlunos[] = new boolean[5];
//        double alturaAlunos[] = new double[5];
//        int idadeAlunos[] = new int[5];
        Scanner leitor = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("Olá, diga seu nome:");
//            nomeAlunos[i] = leitor.nextLine();
//            System.out.println("vc estuda?");
//            situacaoAlunos[i] = leitor.nextBoolean();
//            System.out.println("qual sua altura? ");
//            alturaAlunos[i] = leitor.nextDouble();
//            System.out.println("qual usa idade?");
//            idadeAlunos[i] = leitor.nextInt();
//        }
//
//        for (int i = 0; i < nomeAlunos.length; i++) {
//            System.out.println("Nome: " + nomeAlunos[i] + " Estuda: " + situacaoAlunos[i] + " Altura: " + alturaAlunos[i] + "Idade: " + idadeAlunos[i]);
//        }

        leitor.useDelimiter(", ");
        while (leitor.hasNextInt()) {
            int numero = leitor.nextInt();
            System.out.println("Numero " + numero);
            leitor.skip(", ");
        }

    }
}
