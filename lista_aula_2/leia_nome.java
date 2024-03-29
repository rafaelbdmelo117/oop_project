package Java.orientacao_a_objetos_projeto.lista_aula_2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class leia_nome {
    public static void main(String[] args) {
        //variavel que recebe o nome
        String nome;

        //criacao do objeto scanner
        Scanner recebe = new Scanner(System.in);

        //mensagem no terminal que pede o nome do usuario
        System.out.print("Qual é o seu nome? ");
        nome = recebe.nextLine();

        //fecha o scanner
        recebe.close();

        //mensagem popup resultado
        JOptionPane.showMessageDialog(null, "Olá, " + nome + ", seja muito bem-vindo!");

        //mensagem no terminal resultado
        //System.out.println("Olá, " + nome + ", bem-vindo!");
    }
}