package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;
import java.lang.Math;

public class calcula_figura{

    //funcao para escanear inteiros
    public static int scanInt(Scanner scI) {
        return Integer.parseInt(scI.nextLine());
    }

    //funcao para escanear double
    public static double scanDouble(Scanner scD) {
        return Double.parseDouble(scD.nextLine());
    }

    //funcao para calcular perimetro do circulo
    public static double calculaPerimetroCirculo(double radius){
        double perimetroCirculo;
        perimetroCirculo = 2 * Math.PI * radius;
        return perimetroCirculo;
    }

    //funcao main
    public static void main(String[] args){
        //var para selecionar a figura geometrica
        int tipoFigura;

        //objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //faz a leitura do tipo da figura
        System.out.print("Você deseja calcular o perímetro e a área de qual figura?\n" + "(1) Círculo\n" + "(2) Quadrado\n" + "(3) Retângulo\n" + "(4) Trapézio\n");
        tipoFigura = scanInt(entrada);

        //var para o resultado do perimetro
        double resultadoPerimetro;
        //var para o resultado da area
        //double resultadoArea;

        switch (tipoFigura) {
            case 1:
                //var para o raio do circulo
                double raio;

                //solicita a entrada do raio ao usuario
                System.out.print("Você selecionou círculo.\nDigite o raio do círculo: ");
                raio = scanDouble(entrada);
                
                //joga o valor na funcao e chama a funcao perimetro
                resultadoPerimetro = calculaPerimetroCirculo(raio);

                //mostra o resultado do perimetro
                System.out.printf("O perímetro do círculo é: " + "%,.2f", resultadoPerimetro);

                //resultadoArea = calculaAreaCirculo(raio);
                //System.out.println("A área do círculo é: " + resultadoArea);
                break;
            case 2:
                //funcao quadrado
                break;
            case 3:
                //funcao retangulo
            case 4:
                //funcao trapezio
                break;
            default:
                System.out.println("Esse valor não corresponde a nenhuma opção.");
                break;
        }
    }
}