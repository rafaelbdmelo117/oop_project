package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;
import java.lang.Math;

public class calcula_figura{

    public static double calculaPerimetroCirculo(double radius){
        double perimetroCirculo;
        perimetroCirculo = 2 * Math.PI * radius;
        return perimetroCirculo;
    }
    public static void main(String[] args){
        //var para selecionar a figura geometrica
        int tipoFigura;

        //objeto Scanner para receber o tipo de figura
        Scanner recebeFigura = new Scanner(System.in);

        //faz a leitura do tipo da figura
        System.out.print("Você deseja calcular o perímetro e a área de qual figura?\n" + "(1) Círculo\n" + "(2) Quadrado\n" + "(3) Retângulo\n" + "(4) Trapézio\n");
        tipoFigura = recebeFigura.nextInt();

        //fecha o scanner das figuras
        //recebeFigura.close();

        //var para o resultado do perimetro
        double resultadoPerimetro;
        //var para o resultado da area
        //double resultadoArea;

        //Scanner para receber as medidas das figuras
        //Scanner recebeMedidas = new Scanner(System.in);

        switch (tipoFigura) {
            case 1:
                //var para o raio do circulo
                double raio;

                //solicita a entrada do raio ao usuario
                System.out.print("Você selecionou círculo. Digite o raio do círculo: ");
                raio = recebeFigura.nextDouble();
                
                //joga o valor na funcao e chama a funcao perimetro
                resultadoPerimetro = calculaPerimetroCirculo(raio);

                //mostra o resultado do perimetro
                System.out.println("O perímetro do círculo é: " + resultadoPerimetro);

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
        //recebeMedidas.close();
    }
}