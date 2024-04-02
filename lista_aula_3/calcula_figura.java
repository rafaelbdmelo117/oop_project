package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;
import java.lang.Math;

public class calcula_figura{
    //var para verificacao de condicoes
    public static boolean ok;

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
        double perimetroCirculo = 2 * Math.PI * Math.abs(r);
        return perimetroCirculo;
    }

    //funcao para calcular area do circulo
    public static double calculaAreaCirculo(double r){
        double areaCirculo = Math.PI * Math.pow(r, 2);
        return areaCirculo;
    }

    //funcao para calcular perimetro do quadrado
    public static double calculaPerimetroQuadrado(double l){
        double perimetroQuadrado = 4 * Math.abs(l);
        return perimetroQuadrado;
    }

    //funcao para calcular area do quadrado
    public static double calculaAreaQuadrado(double l){
        double areaQuadrado = l * l;
        return areaQuadrado;
    }

    //funcao para calcular perimetro do retangulo
    public static double calculaPerimetroRetangulo(double x, double y){
        double perimetroRetangulo = (2 * Math.abs(x)) + (2 * Math.abs(y));
        return perimetroRetangulo;
    }

    //funcao para calcular area do retangulo
    public static double calculaAreaRetangulo(double x, double y){
        double areaRetangulo = Math.abs(x) * Math.abs(y);
        return areaRetangulo;
    }

    //funcao para calcular perimetro do trapezio
    public static double calculaPerimetroTrapezio(double b, double B, double l1, double l2){
        double perimetroTrapezio = Math.abs(b) + Math.abs(B) + Math.abs(l1) + Math.abs(l2);
        return perimetroTrapezio;
    }

    //funcao para calcular area do trapezio
    public static double calculaAreaTrapezio(double b, double B, double h){
        double areaTrapezio = ((Math.abs(b) + Math.abs(B)) * Math.abs(h)) / 2;
        return areaTrapezio;
    }

    //funcao verifica triangulo
    public static boolean verificaTriangulo(double a, double b, double c){
        //essa secao testa as condicoes de existencia do triangulo
        if(Math.abs(a) < Math.abs(b + c) && Math.abs(b - c) < Math.abs(a)){
            if(Math.abs(b) < Math.abs(a + c) && Math.abs(a - c) < Math.abs(b)){
                if(Math.abs(c) < Math.abs(a + b) && Math.abs(a - b) < Math.abs(c)){
                    ok = true;
                }else{
                    ok = false;
                }
            }else{
                ok = false;
            }
        }else{
            ok = false;
        }
        return ok;
    }

    //funcao para calcular perimetro do triangulo
    public static double calculaPerimetroTriangulo(double a, double b, double c){
        //verifica se as condicoes estao satisfeitas e calcula
        if(ok == true){
            double perimetroTriangulo = Math.abs(a) + Math.abs(b) + Math.abs(c);
            return perimetroTriangulo;
        }else{
            return 0;
        }
    }

    //funcao para calcular area do triangulo
    public static double calculaAreaTriangulo(double l, double h){
        if(ok == true){
            double areaTriangulo = (Math.abs(l) * Math.abs(h)) / 2;
            return areaTriangulo;
        }else{
            return 0;
        }
    }

    //funcao main
    public static void main(String[] args){
        //var para selecionar a figura geometrica
        int tipoFigura;

        //objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //faz a leitura do tipo da figura
        System.out.print("As opções são:\n" + "(1) Círculo\n" + "(2) Quadrado\n" + "(3) Retângulo\n" + "(4) Trapézio\n" + "(5) Triângulo\n" + "Faça sua escolha: ");
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
                System.out.print("Informe também a medida da lateral esquerda do trapézio: ");
                l1 = scanDouble(entrada);
                System.out.print("Por fim, informe a medida da lateral direita do trapézio: ");
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
            case 5:
                //var para verificacao
                boolean confirma;
                //vars para receber as medidas do triangulo
                double l, ht, c;

                //solicita a entrada de dados do triangulo
                System.out.print("Você selecionou triângulo.\n");
                System.out.print("Informe a medida da base do triângulo ou de um dos catetos: ");
                l = scanDouble(entrada);
                System.out.print("Informe a medida da altura do triângulo ou do outro cateto: ");
                ht = scanDouble(entrada);
                System.out.print("Informe a medida do lado restante do triângulo ou da hipotenusa: ");
                c = scanDouble(entrada);

                //joga os valores na funcao verificadora
                confirma = verificaTriangulo(l, ht, c);
                if(confirma){
                    //joga os valores na funcao perimetro
                    resultadoPerimetro = calculaPerimetroTriangulo(l, ht, c);
                    //joga os valores na funcao area
                    resultadoArea = calculaAreaTriangulo(l, ht);

                    //mostra o resultado do perimetro
                    System.out.printf("O perímetro do triângulo é: " + "%,.2f", resultadoPerimetro);
                    System.out.printf("\n");
                    //mostra o resultado da area
                    System.out.printf("A área do triângulo é: " + "%,.2f", resultadoArea);
                    System.out.printf("\n");
                }else{
                    //informa que os valores nao funcionam
                    System.out.println("Desculpe. Os valores que você informou não são razoáveis.");
                }
                break;
            default:
                System.out.println("Essa não é uma opção válida. Leia com calma e tente novamente.");
                break;
        }
    }
}