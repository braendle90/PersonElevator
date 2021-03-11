package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberPersonScanner = scanner.nextInt();
        int maxWeightLift = 1600;
        int weightWithPersons = 0;
        int personNumberInLift = 0;


        int[] weightAllPerson = new int[numberPersonScanner];

        Random random = new Random();





        for (int i = 0; i < numberPersonScanner; i++) {
            weightAllPerson[i] = random.nextInt(90-88)+88;
            personNumberInLift = personNumberInLift + 1;
            weightWithPersons = weightWithPersons + weightAllPerson[i];



            if (weightWithPersons > maxWeightLift) {
                System.out.println("Es ist die Maximale anzahl an Personen erreicht");
                weightWithPersons = weightWithPersons - weightAllPerson[i];
                personNumberInLift = personNumberInLift - 1;

                break;

            }

            System.out.println(weightAllPerson[i]);

        }





        System.out.println("Es sind "+(personNumberInLift-1) +" Personen im Lift. Mit einem Gewiecht von "+ weightWithPersons );



	// write your code here
    }


}