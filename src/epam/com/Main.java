package epam.com;

import java.util.Scanner;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число");

        int x;

        x = in.nextInt();

        switch (x) {

            case 1:

                System.out.println("One");

                break;

            case 2:

                System.out.println("Two");

                break;

            case 3:

                System.out.println("Three");

                break;

            case 4:

                System.out.println("For");

                break;

            case 5:

                System.out.println("Five");

                break;

            case 6:

                System.out.println("Six");

                break;

            case 7:

                System.out.println("Seven");

                break;

            case 8:

                System.out.println("Eight");

                break;

            case 9:

                System.out.println("Nine");

                break;

            default:
                System.out.println("Other");

                break;



        }

    }
}
