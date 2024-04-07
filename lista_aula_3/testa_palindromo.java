package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;
import java.util.*;


public class testa_palindromo {
    //funcao para escanear inteiros
    public static int scanInt(Scanner scI) {
        return Integer.parseInt(scI.nextLine());
    }

    //funcao para escanear string sem espaços
    public static String scanString(Scanner scS){
        return scS.nextLine();
    }

    //funcao para inverter char array em string (sera usada na funcao de inverter string)
    public static String converteCharString(char[] inversePronta){
        String processedString = new String(inversePronta);
        return processedString;
    }

    //funcao para inverter strings
    public static String stringInverter(String mod){
        //var length string
        int len = mod.length();

        //char array that recieves the string
        char origin[] = new char[mod.length()];
        mod.getChars(0, mod.length(), origin, 0);

        //char array that recieves the reversed string
        char inverse[] = new char[mod.length()];

        //int contador
        int counter = 0;

        //loop that reverses the string (must be fixed)
        for(int i = (len - 1); i >= 0 ; i--){
            inverse[counter] = origin[i];
            counter++;
        }

        //string that recieves the inversed char array
        String done = converteCharString(inverse);

        return done;
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
        String frase = scanString(entrada);
        System.out.println("Hmm... vamos ver...");

        //string que vai receber a frase sem espacos antes e depois e minuscula
        String industrializedFrase = frase.trim().toLowerCase().replaceAll("\\s","");

        //chamada da funcao de inversao
        esarf = stringInverter(industrializedFrase);
        if(industrializedFrase.equals(esarf)){
            System.out.println("Sim, esse texto é um palíndromo!");
            System.out.println(esarf);
        }else{
            System.out.println("Esse texto não é um palíndromo!");
            System.out.println(esarf);
        }
    }
}