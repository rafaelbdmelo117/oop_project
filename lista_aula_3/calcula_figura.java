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

    //funcao para calcular perimetro do retangulo
    public static double calculaPerimetroRetangulo(double x, double y){
        double perimetroRetangulo = (2 * x) + (2 * y);
        return perimetroRetangulo;
    }

    //funcao para calcular area do retangulo
    public static double calculaAreaRetangulo(double x, double y){
        double areaRetangulo = x * y;
        return areaRetangulo;
    }

    //funcao para calcular perimetro do trapezio
    public static double calculaPerimetroTrapezio(double b, double B, double l1, double l2){
        double perimetroTrapezio = b + B + l1 + l2;
        return perimetroTrapezio;
    }

    //funcao para calcular area do trapezio
    public static double calculaAreaTrapezio(double b, double B, double h){
        double areaTrapezio = ((b + B) * h) / 2;
        return areaTrapezio;
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
                //vars para receber as medidas do retangulo
                double largura, altura;

                //solicita a entrada das medidas ao usuario
                System.out.print("Você selecionou retângulo.\n");
                System.out.print("Insira a medida da largura do retângulo: ");
                largura = scanDouble(entrada);
                System.out.print("Insira a medida da altura do retângulo: ");
                altura = scanDouble(entrada);

                //joga os valores na funcao perimetro
                resultadoPerimetro = calculaPerimetroRetangulo(largura, altura);
                //joga os valores na funcao area
                resultadoArea = calculaAreaRetangulo(largura, altura);

                //mostra o resultado do perimetro
                System.out.printf("O perímetro do retângulo é: " + "%,.2f", resultadoPerimetro);
                System.out.printf("\n");
                //mostra o resultado da area
                System.out.printf("A área do retângulo é: " + "%,.2f", resultadoArea);
                System.out.printf("\n");
                break;
            case 4:
                //vars para receber as medidas do trapezio
                double bm, bM, l1, l2, h;

                //solicita a entrada dos dados do trapezio
                System.out.print("Você selecionou trapézio.\n");
                System.out.print("Informe a medida da base menor do trapézio: ");
                bm = scanDouble(entrada);
                System.out.print("Informe a medida da base maior do trapézio: ");
                bM = scanDouble(entrada);
                System.out.print("Agora, informe a medida da altura do trapézio: ");
                h = scanDouble(entrada);
                System.out.print("Diga também a medida da lateral esquerda do trapézio: ");
                l1 = scanDouble(entrada);
                System.out.print("Por fim, digite a medida da lateral direita do trapézio: ");
                l2 = scanDouble(entrada);

                //joga os valores na funcao perimetro
                resultadoPerimetro = calculaPerimetroTrapezio(bm, bM, l1, l2);
                //joga os valores na funcao area
                resultadoArea = calculaAreaTrapezio(bm, bM, h);

                //mostra o resultado do perimetro
                System.out.printf("O perímetro do trapézio é: " + "%,.2f", resultadoPerimetro);
                System.out.printf("\n");
                //mostra o resultado da area
                System.out.printf("A área do trapézio é: " + "%,.2f", resultadoArea);
                System.out.printf("\n");
                break;
            default:
                System.out.println("Esse valor não corresponde a nenhuma opção.");
                break;
        }
    }
}