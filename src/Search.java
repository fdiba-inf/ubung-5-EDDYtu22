import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int sCounter = 0;

        //System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int numbers[] = new int[size];

        for (i = 0; i < numbers.length; i++) {
            //System.out.print("Enter value for " + i + " element: ");
            numbers[i] = input.nextInt();
        }
        //System.out.print("Witch element are you searching for? ");
        int searchedNumber = input.nextInt();


        for ( i = 0; i < numbers.length; i++) {
            if (searchedNumber == numbers[i]) {
                System.out.println("Number index: " + i);
                break;
            }
            sCounter++;
            if (sCounter == numbers.length) {
                System.out.println("Number index: -1 ");
            }
        }
    }
}

