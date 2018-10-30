package com.company;

import java.util.Scanner;

public class Problema433 {
    public static void main(String[] args) {

        int total_uvas = 416541641;

        Scanner in = new Scanner (System.in);

        while(total_uvas != 0) {
            total_uvas = in.nextInt();
            int uvas = 0;
            int nivel = 0;

            while (total_uvas > uvas) {

                nivel++;
                uvas = nivel + uvas;
            }
            if(nivel!=0) {
                System.out.println(nivel);
            }
        }

        while(total_uvas != 0) {
            total_uvas = in.nextInt();
            int uvas = 0;
            int nivel = 0;

            while (total_uvas > uvas) {

                nivel++;
                uvas = nivel + uvas;
            }
            if(nivel!=0) {
                System.out.println(nivel);
            }
        }
    }
}
