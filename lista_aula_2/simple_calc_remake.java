package Java.orientacao_a_objetos_projeto.lista_aula_2;
import java.util.Scanner;

public class simple_calc_remake {

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int divide(int x, int y) {
    return x / y;
  }
  public static void main(String[] args) {

    //criacao de scanner
    Scanner entrada = new Scanner(System.in);

    //solicita a operacao e cria a variavel de selecao
    System.out.print("Choose the operation:\n" + "(1) Sum\n" + "(2) Subtract\n" + "(3) Multiply\n" + "(4) Divide\n");
    int choice = entrada.nextInt();

    //solicita os numeros operados e cria as variaveis numeros operados
    System.out.println("Insert the first number: ");
    int n1 = entrada.nextInt();
    System.out.println("Insert the second number: ");
    int n2 = entrada.nextInt();

    //fecha o scanner entrada
    entrada.close();

    //seleciona a operacao
    switch (choice) {
    case 1:
        System.out.println("The sum is: " + sum(n1, n2));
        break;
    case 2:
        System.out.println("The subtraction is: " + subtract(n1, n2));
        break;
    case 3:
        System.out.println("The product is: " + multiply(n1, n2));
        break;
    case 4:
        System.out.println("The quocient is: " + divide(n1, n2));
        break;
    default:
        System.out.println("Invalid selection");
        break;
    }
  }
}