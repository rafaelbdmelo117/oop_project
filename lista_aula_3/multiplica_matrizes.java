package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;

public class multiplica_matrizes {
    //vars int que vao receber o tamanho de cada uma das matrizes
    public static int r, s; //matriz 1
    public static int x, y; //matriz 2

    //funcao para escanear int
    public static int scanInt(Scanner scI){
        return Integer.parseInt(scI.nextLine());
    }

    //funcao para escanear double
    public static double scanDouble(Scanner scD){
        return Double.parseDouble(scD.nextLine());
    }

    //funcao para entradas das matrizes
    public static double[][] criaMatriz(int m, int n){
        //scanner da funcao criaMatriz
        Scanner paraDoubles = new Scanner(System.in);

        //cria a matriz vazia de dimensão m por n
        double matriz[][] = new double[m][n];

        //loop para preencher a matriz
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Insira a entrada na linha " + (i + 1) + " e na coluna " + (j + 1) + ": ");
                matriz[i][j] = scanDouble(paraDoubles);
            }
        }
        return matriz;
    }
    
    //funcao para multiplicar as matrizes
    public static double[][] multiplicaMatriz(double X[][], double Y[][]){
        //scanner da funcao criaMatriz
        Scanner paraDoubles = new Scanner(System.in);

        //cria a matriz resultante
        double multiplicada[][] = new double[r][y];

        //loop para multiplicar as matrizes
        for(int i = 0; i < r; i++){
            for(int j = 0; j < y; j++){
                
            }
        }
    }

    //funcao main
    public static void main(String[] args){
        //scanner da main
        Scanner paraInt = new Scanner(System.in);
        
        //solicita a dimensão e as entradas da matriz 1 ao usuario
        System.out.print("Qual a quantidade de linhas da matriz A? "); //solicita r
        r = scanInt(paraInt); //recebe r
        System.out.print("Qual a quantidade de colunas da matriz A? "); //solicita s
        s = scanInt(paraInt); //recebe s
        double m1[][] = new double[r][s]; //declara e cria a matriz A
        m1 = criaMatriz(r, s); //chama a funcao para inserir as entradas da matriz A

        //agora, solicita a dimensão e as entradas da matriz 2 ao usuario
        System.out.print("Qual a quantidade de linhas da matriz B? "); //solicita x
        x = scanInt(paraInt); //recebe r
        System.out.print("Qual a quantidade de colunas da matriz B? "); //solicita y
        y = scanInt(paraInt); //recebe s
        double m2[][] = new double[x][y]; //declara e cria a matriz B
        m2 = criaMatriz(x, y); //chama a funcao para inserir as entradas da matriz B

        if(s == y){
            double m3[][] = new double[r][y];
            m3 = multiplicaMatriz(m1[][], m2[][]);
        }else{
            System.out.println("Desculpe, A não pode multiplicar B.");
        }
    }
}