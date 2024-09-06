package com.ctseducare.java.j07_arrays_matrices;

public class Matrices {

    public static void main(String[] args) {
        
        // Declarando uma matriz para números inteiros
        //short numeros[][] = new short[2][2];
        var numeros = new short[2][2];

        // Atribuindo dados para a matriz
        numeros[0][0] = 1;
        numeros[0][1] = 1;
        numeros[1][0] = 2;
        numeros[1][0] = 3;

        // Atribuindo dados para a matriz na declaração
        short coordenadas[][] = { { 2, 2 }, { 2, 8 }, { 5, 2 }, { 3, 2 } };

        // Mostrando os dados contidos na matriz
        for (var i = 0; i < 2; i++) {
            for (var j = 0; j < 2; j++) {
                System.out.println(coordenadas[i][j]);
            }
        }

        // Utilizando o tamanho da matriz
        for (var i = 0; i < coordenadas.length; i++) {
            for (var j = 0; j < coordenadas[i].length; j++) {
                System.out.println(coordenadas[i][j]);
            }
        }

    }

}
