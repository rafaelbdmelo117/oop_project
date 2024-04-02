package Java.orientacao_a_objetos_projeto.lista_aula_3;
import java.util.Scanner;

/*
int array x sized (the user must insert the size). The program must print:
the mean of the values;
positive number quantity;
negative number quantity;
quantity of zeros;
even number quantity;
odd number quantity.
create a function for each of the cases.
*/

public class conta_vetor {

    //integer scanning function
    public static int scanInt(Scanner scI) {
        return Integer.parseInt(scI.nextLine());
    }

    public static void main(String[] args){
        //array size var
        int x;

        //scanner
        Scanner entry = new Scanner(System.in);

        //asks the user the array size
        System.out.print("Insert the array size: ");
        x = scanInt(entry);

        //array declaration and creation
        int numbers[] = new int[x];

        //array filling loop
        for(int i = 0; i < x; i++){
            System.out.print("Digit an integer number: ");
            numbers[x] = scanInt(entry);
        }
    }
}