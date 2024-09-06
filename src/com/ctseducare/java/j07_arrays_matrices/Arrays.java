package com.ctseducare.java.j07_arrays_matrices;

public class Arrays {

    public static void main(String[] args) {
        // Criando um vetor vazio para armazenar números inteiros
        var numeros = new short[5];

        // Armazenando números inteiros no vetor
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 5;

        // Exibindo o conteúdo do vetor
        for (var i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        // Criando um vetor com conteúdo
        short pares[] = { 0, 2, 4, 6, 8 };

        // Mostrando os dados contidos no vetor
        for (var i = 0; i < 5; i++) {
            System.out.println(pares[i]);
        }

        // Criando um vetor vazio para armazenar textos
        var frutas = new String[5];

        // Armazenando textos no vetor
        frutas[0] = "Uva";
        frutas[1] = "Maçã";
        frutas[2] = "Abacaxi";
        frutas[3] = "Manga";
        frutas[4] = "Banana";

        // Mostrando os dados contidos no vetor
        for (var i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

    }

}
