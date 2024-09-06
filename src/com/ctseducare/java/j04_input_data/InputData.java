package com.ctseducare.java.j04_input_data;

import java.util.Scanner;

public class InputData {

    public static void main(String[] args) {

        var read = new Scanner(System.in);

        // Recebendo um texto
        // --------------------------------------------------------------------------------
        System.out.println("Qual é o seu nome?");
        var nome = read.nextLine();
        System.out.println("Olá " + nome);

        // Recebendo um número inteiro
        // --------------------------------------------------------------------------------
        System.out.println("Qual é a sua idade?");
        var idade = read.nextInt();
        System.out.println("Você tem " + idade + " anos");

        // Recebendo um número decimal
        // --------------------------------------------------------------------------------
        System.out.println("Qual é a sua altura?");
        var altura = read.nextFloat();
        System.out.println("Sua altura é " + altura);

        read.close();

    }

}
