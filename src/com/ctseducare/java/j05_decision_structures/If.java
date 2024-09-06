package com.ctseducare.java.j05_decision_structures;

public class If {

    public static void main(String[] args) {

        // Avaliando apenas o resultado positivo
        // -------------------------------------
        var idade1 = 18;
        if (idade1 >= 18) {
            System.out.println("Maior de idade");
        }

        // Avaliando o resultado positivo e negativo
        // -----------------------------------------
        var idade2 = 17;
        if (idade2 >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Avaliando mais de uma situação
        // ------------------------------
        var idade3 = 15;
        if (idade3 >= 18) {
            System.out.println("Maior de idade");
        } else if (idade3 >= 16) {
            System.out.println("Menor de idade e pode votar");
        } else {
            System.out.println("Menor de idade e não pode votar");
        }

    }

}