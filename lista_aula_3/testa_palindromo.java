package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;


public class testa_palindromo {
    //funcao para escanear inteiros
    public static int scanInt(Scanner scI) {
        return Integer.parseInt(scI.nextLine());
    }

    //funcao para escanear string sem espaços
    public static String scanStringNoSpace(Scanner scS){
        return scS.nextLine();
    }

    //funcao para inverter strings
    public static String stringInverter(String mod){
        //var for the length of the string
        int len = str.length(mod);
        //string that recieves the inverted string
        char reverse[] = new char[len];

        return reverse;
    }

    //funcao main
    public static void main(String[] args){
        //scanner para a funcao
        Scanner entrada = new Scanner(System.in);

        //string que vai recebe a frase invertida (reposicionar)
        String esarf;

        //solicita a frase ao usuario
        System.out.println("Um palíndromo é uma palavra ou frase que pode ser lida tanto da esquerda para a direita quanto da direita para a esquerda.");
        System.out.println("Pense em uma frase ou palavra e vamos ver se ela é um palíndromo!");
        System.out.print("Insira o texto que você pensou: ");
        //string que vai receber a frase original
        String frase = scanStringNoSpace(entrada);
        System.out.println("Hmm... vamos ver...");

        //string que vai receber a frase sem espacos antes e depois e minuscula
        String industrializedFrase = frase.trim().toLowerCase().replaceAll("\\s","");
        System.out.println(industrializedFrase);

        //chamada da funcao de inversao
        esarf = stringInverter(industrializedFrase);
    }
}