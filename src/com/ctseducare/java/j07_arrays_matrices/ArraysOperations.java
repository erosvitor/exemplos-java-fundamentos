package com.ctseducare.java.j07_arrays_matrices;

import java.util.Arrays;
import java.util.Collections;

public class ArraysOperations {
    
    public static void main(String[] args) {
        
        String[] marcas_veiculos = {"Fiat", "Mercedes", "Ford", "BMW"};

        // Obter quantidade de elementos
        System.out.println(marcas_veiculos.length);

        // Verificar se um determinado item existe na lista
        //System.out.println(marcas_veiculos. .contains("Chevrolet"));

        // Adicionar item no final da lista
        // Java não dispõe de método para tal operação

        // Inserir item numa determinada posição da lista
        // Java não dispõe de método para tal operação

        // Ordenar a lista em ordem ascendente
        Arrays.sort(marcas_veiculos);
        for (String e : marcas_veiculos) {
           System.out.print(e + " ");
        }
        System.out.println("");

        // Ordenar a lista em ordem descendente
        Arrays.sort(marcas_veiculos, Collections.reverseOrder());
        for (String e : marcas_veiculos) {
           System.out.print(e + " ");
        }
        System.out.println("");

        // Retirar o último elemento da lista
        // Java não dispõe de método para tal operação

        // Remover todos os elementos da lista
        // Java não dispõe de método para tal operação
        
    }

}
