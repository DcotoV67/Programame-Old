package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problema100 {
    public static void main(String[] args) {

        int numero;
        int iteraciones = 0;
        int i = 0;
        String Smayor = "";
        int inverso = 0;
        int mayor = 0;
        int casos = 0;
        int total = 0;

        Scanner in = new Scanner(System.in);

        total = in.nextInt();

        while (casos <= total ) {
            iteraciones = 0;
            numero = in.nextInt();

            int numeroM = numero;

            while ((mayor - inverso) != 6174) {
                inverso = 0;

                int orden[] = new int[4];


                while (i != 4) {
                    if (numeroM % 10 >= 0) {
                        orden[i] = numeroM % 10;
                        i++;
                    }
                    numeroM = numeroM / 10;
                }

                for (int x = 0; x < orden.length; x++) {
                    for (i = 0; i < orden.length - x - 1; i++) {
                        if (orden[i] < orden[i + 1]) {
                            int tmp = orden[i + 1];
                            orden[i + 1] = orden[i];
                            orden[i] = tmp;
                        }
                    }
                }

                for (i = 0; i <= 3; i++) {
                    Smayor += orden[i];
                }

                mayor = Integer.parseInt(Smayor);

                Smayor = "";

                for (i = mayor; i != 0; i /= 10) {
                    inverso = inverso * 10 + i % 10;
                }

                numeroM = mayor - inverso;

                iteraciones++;

            }
            System.out.println(iteraciones);
            casos++;
        }
    }
}