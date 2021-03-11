package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

     static int weightWithPersons = 0 ;

    public static void main(String[] args) {


        int numberPersonScanner = scannermethod();


        int maxWeightLift = 1600;

        int personNumberInLift = 0;


        int[] weightAllPerson = new int[numberPersonScanner];


        for (int i = 0; i < numberPersonScanner; i++) {
            weightAllPerson[i] = randomPersonWeight();
            personNumberInLift = personNumberInLift + 1;
            //weightWithPersons = weightWithPersons + weightAllPerson[i];

            personWithWeight(weightAllPerson[i]);

            if (weightWithPersons > maxWeightLift) {
                System.out.println("Es ist die Maximale anzahl an Personen erreicht");
                weightWithPersons = weightWithPersons - weightAllPerson[i];
                personNumberInLift = personNumberInLift - 1;

                break;

            }

            System.out.println(weightAllPerson[i]);

        }


        System.out.println("Es sind " + (personNumberInLift - 1) + " Personen im Lift. Mit einem Gewiecht von " + weightWithPersons);


        // write your code here
    }

    public static int randomPersonWeight() {

        Random random = new Random();
        int weightPerson = random.nextInt(90 - 88) + 88;


        return weightPerson;

    }

    public static int personWithWeight(int weightPersonScanner){

        weightWithPersons = weightWithPersons + weightPersonScanner;
        return weightWithPersons;
    }

    public static int scannermethod(){

        Scanner scanner = new Scanner(System.in);
        int numberPersonScanner = scanner.nextInt();

        return numberPersonScanner;

    }

}
