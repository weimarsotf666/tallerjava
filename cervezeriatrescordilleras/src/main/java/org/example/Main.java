package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DEFINIENDO DATOS DE ENTRADA

        String nombreCerveza;
        Double gramosCebada;
        Float temperaturaproceso;

        Scanner teclado = new Scanner(System.in);

        //inicializando las variables

        /*System.out.print("Cerveza 3 cordilleras");
        System.out.print("1. Digite  el nombre de la cerveza a fabricar: ");
        nombreCerveza=teclado.nextLine();

        System.out.print("2. Digita la cantidad en gramos de cebada: ");
        gramosCebada=teclado.nextDouble();

        System.out.print("3. Digita la temperatura final del proceso: ");
        temperaturaproceso=teclado.nextFloat();*/

        // PROCESANDO LAS ENTRADAS
        //Double porcentajeAlcohol=Math.sqrt(gramosCebada*temperaturaproceso);

        //TOMANDO UNA DECISION
        Double porcentajeAlcohol=0.0;
        if(porcentajeAlcohol>=0 && porcentajeAlcohol<=10){

            System.out.println("este lote se puede vender");
        }else{
            System.out.println("este lote no se puede vender");

        }

        //SALIDAS DEL PROGRAMA

       // System.out.println("la cerveza: "+" tiene: "+porcentajeAlcohol+"% de alcohol");









    }
}