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
    public static double calculaPerimetroCirculo(double r){
        double perimetroCirculo = 2 * Math.PI * r;
        return perimetroCirculo;
    }

    //funcao para calcular area do circulo
    public static double calculaAreaCirculo(double r){
        double areaCirculo = Math.PI * Math.pow(r, 2);
        return areaCirculo;
    }

    //funcao para calcular perimetro do quadrado
    public static double calculaPerimetroQuadrado(double l){
        double perimetroQuadrado = 4 * l;
        return perimetroQuadrado;
    }

    //funcao para calcular area do quadrado
    public static double calculaAreaQuadrado(double l){
        double areaQuadrado = l * l;
        return areaQuadrado;
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
        double resultadoArea;

        switch (tipoFigura) {
            case 1:
                //var para o raio do circulo
                double raio;

                //solicita a entrada do raio ao usuario
                System.out.print("Você selecionou círculo.\nDigite o raio do círculo: ");
                raio = scanDouble(entrada);
                
                //joga o valor na funcao perimetro
                resultadoPerimetro = calculaPerimetroCirculo(raio);
                //joga o valor na funcao area
                resultadoArea = calculaAreaCirculo(raio);

                //mostra o resultado do perimetro
                System.out.printf("O perímetro do círculo é: " + "%,.2f", resultadoPerimetro);
                System.out.printf("\n");
                //mostra o resultado da area
                System.out.printf("A área do círculo é: " + "%,.2f", resultadoArea);
                System.out.printf("\n");
                break;
            case 2:
                //var para o lado do quadrado
                double lado;

                //solicita a entrada do lado ao usuario
                System.out.print("Você selecionou quadrado.\nDigite o tamanho do lado do quadrado: ");
                lado = scanDouble(entrada);

                //joga o valor na funcao perimetro
                resultadoPerimetro = calculaPerimetroQuadrado(lado);
                //joga o valor na funcao area
                resultadoArea = calculaAreaQuadrado(lado);

                //mostra o resultado do perimetro
                System.out.printf("O perímetro do quadrado é: " + "%,.2f", resultadoPerimetro);
                System.out.printf("\n");
                //mostra o resultado da area
                System.out.printf("A área do quadrado é: " + "%,.2f", resultadoArea);
                System.out.printf("\n");
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