package Java.orientacao_a_objetos_projeto.lista_aula_3; 
import java.util.Scanner;

public class conta_vetor {
    //integer scanning function
    public static int scanInt(Scanner scI) {
        return Integer.parseInt(scI.nextLine());
    }

    //array values mean function
    public static double meanArray(int array[]){
        //var for sum up the values in the array
        double sum = 0;

        //var that is returned as the mean of the array
        double mean;

        //loop that calculates the mean
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        mean = sum/array.length;

        return mean;
    }

    //array positive value counter
    public static int positiveCounter(int array[]){
        //var for the quantity of positive numbers
        int quantity = 0;

        //loop that counts the quantity of positive numbers
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                quantity++;
            }
        }

        return quantity;
    }

    //array negative value counter
    public static int negativeCounter(int array[]){
        //var for the quantity of negative numbers
        int quantity = 0;

        //loop that counts the quantity of negative numbers
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                quantity++;
            }
        }

        return quantity;
    }

    //array zero counter
    public static int zeroCounter(int array[]){
        //var for the quantity of zeros
        int quantity = 0;

        //loop that counts the quantity of zeros
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                quantity++;
            }
        }

        return quantity;
    }

    //array even number counter
    public static int evenCounter(int array[]){
        //var for the quantity
        int quantity = 0;

        //loop that counts the quantity of even numbers
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                quantity++;
            }
        }

        return quantity;
    }

    //array odd number counter
    public static int oddCounter(int array[]){
        //var for the quantity
        int quantity = 0;

        //loop that counts the quantity of odd numbers
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                quantity++;
            }
        }

        return quantity;
    }

    public static void main(String[] args){
        //scanner for the function
        Scanner entry = new Scanner(System.in);

        //array size var
        int x;

        //asks the user the array size
        System.out.print("Insert the array size: ");
        x = scanInt(entry);

        //array declaration and creation
        int numbers[] = new int[x];

        //array filling loop
        for(int i = 0; i < x; i++){
            System.out.print("Digit an integer number: ");
            numbers[i] = scanInt(entry);
        }

        //calculates and prints the mean
        double meancalc = meanArray(numbers);
        System.out.println("The mean is: " + meancalc);

        //checks the amount of positive numbers and print this quantity
        int qntPos = positiveCounter(numbers);
        System.out.println("The quantity of positive numbers is: " + qntPos);

        //checks the amount of positive numbers and print this quantity
        int qntNeg = negativeCounter(numbers);
        System.out.println("The quantity of negative numbers is: " + qntNeg);

        //checks the amount of zeros and print this quantity
        int qntZero = zeroCounter(numbers);
        System.out.println("The quantity of zeros is: " + qntZero);

        //checks the amount of even numbers and print this quantity
        int qntEven = evenCounter(numbers);
        System.out.println("The quantity of even numbers is: " + qntEven);

        //checks the amount of even numbers and print this quantity
        int qntOdd = oddCounter(numbers);
        System.out.println("The quantity of odd numbers is: " + qntOdd);
    }
}