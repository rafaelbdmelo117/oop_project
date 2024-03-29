package Java.orientacao_a_objetos_projeto.lista_aula_2;
import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {
        //var for selecting the operation
        String op;

        //var for inserting the two numbers
        int num1;
        int num2;

        //var that show the operation result
        int res;

        //creating the Scanner object
        Scanner get = new Scanner(System.in);

        //asking the user to select the operation
        System.out.print("Insert the desired operation (+, - , *, / or ^): ");
        op = get.next().trim();

        //testing (went ok)
        //System.out.println(op);

        //asking the user to select the numbers
        //first
        System.out.print("Insert the first number: ");
        num1 = get.nextInt();
        //second
        System.out.print("Insert the second number: ");
        num2 = get.nextInt();

        //closes get
        get.close();

        //operating
        switch (op) {
            case "+":
                res = num1 + num2;
                System.out.println("The result is: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("The result is: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("The result is: " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("The result is: " + res);
                break;
            case "^":
                //var for keeping the original num1
                int p = num1;

                //powering up
                for(int i = 1; i < num2; i++){
                    num1 = num1 * p;
                    res = num1;
                    System.out.println(num1 + " times " + p + " is: " + res);
                }
                break;
            default:
                System.out.println("This is not an available operation, please try again.");
                break;
        }
    }
}