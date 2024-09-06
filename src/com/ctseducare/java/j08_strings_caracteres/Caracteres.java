package com.ctseducare.java.j08_strings_caracteres;

public class Caracteres {

    public static void main(String[] args) {

        // Definindo um caractere
        char letra;

        // Preenchendo um caractere
        letra = 'J';

        // Exibindo um caractere
        System.out.println(letra);

        // Identificando um determinado caractere
        char c = 'F';

        System.out.println("O caractere " + c);
        if (Character.isAlphabetic(c))
            System.out.println("  É um número ou uma letra");

        if (Character.isLetter(c))
            System.out.println("  É uma letra");

        if (Character.isLowerCase(c))
            System.out.println("  É uma letra minúscula");

        if (Character.isUpperCase(c))
            System.out.println("  É uma letra maiúscula");

        if (Character.isDigit(c))
            System.out.println("  É um número");

        if (Character.isWhitespace(c))
            System.out.println("  É um caractere de espaço");

    }
    
}
