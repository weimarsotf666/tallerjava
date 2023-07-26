package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        int numeroUno;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int numeroCinco;
        Scanner teclado= new Scanner(System.in);

        System.out.print("Diga un numero por favor: ");
        numeroUno=teclado.nextInt();

        System.out.print("Digita otro numero por favor: ");
        numeroDos=teclado.nextInt();
        //evaluando condiciones:
        if (numeroUno>0 || numeroUno<10){
            System.out.println("Bienvenido al bloque1");
        }else{
            System.out.println("Bievenido al bloque2");
        }
    }
}