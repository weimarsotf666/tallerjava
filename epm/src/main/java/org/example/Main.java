package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DECLARANDO VARIABLES
        long ContratoCliente;
        String estratoSocioeconomico;
        long totalEnergia;
        int totalAgua;
        short totalSaneamiento;
        double totalGas;
        int totalEmpresasVarias;

        //INICIALIZAR LAS VARIABLES
        Scanner teclado = new Scanner(System.in);
        System.out.println("EPM ESTAMOS AHI");
        System.out.println();

        System.out.println("Digita el numero de contrato");
        ContratoCliente = teclado.nextLong();

        System.out.println("Digita el estrato socioeconomico de la vivienda: ");
        estratoSocioeconomico = teclado.nextLine();

        System.out.println("digita el total a pagar de la fuente de energia en pesos colombianos: ");
        totalEnergia = teclado.nextLong();

        System.out.println("Digita el de agua consumida: ");
        totalAgua = teclado.nextInt();

        System.out.println("Digita el total de saneamiento: ");
        totalSaneamiento = teclado.nextShort();

        System.out.println("Digita el total de consumo de gas: ");
        totalGas = teclado.nextDouble();

        System.out.println("Digita el total de empresas varias: ");
        totalEmpresasVarias = teclado.nextInt();

        //PROCESO

        double totalcuenta = totalAgua + totalEnergia + totalGas + totalEmpresasVarias + totalSaneamiento;
        Integer estrato = Integer.parseInt(estratoSocioeconomico);

        if (estrato ==1) {
            double valorDescuento=totalcuenta*(20/100);
            double totalConDescuento=totalcuenta-valorDescuento;

        }else if (estrato==2) {
            double valorDescuento=totalcuenta*(10/100);

        }else if (estrato==3) {
            double valorDescuento=totalcuenta*(5/100);

        }else if (estrato==4 || estrato==5 || estrato==6){
            System.out.println("usted tiene mucha plata descarado");
        }else{
            System.out.println("el estrato");
        }


        }
    }

