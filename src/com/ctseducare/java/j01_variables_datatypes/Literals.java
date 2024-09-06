package com.ctseducare.java.j01_variables_datatypes;

public class Literals {

    public static void main(String[] args) {

        var decimal = 123;
        var long_ = 123L;
        var binary = 0b1111011; // 123 em binário
        var hexa = 0x7B; // 123 em hexadecimal
        System.out.println(decimal);
        System.out.println(long_);
        System.out.println(binary);
        System.out.println(hexa);

        var oneMillion = 1_000_000;
        var creditCardNumber = 1234_5678_9012_3456L;
        var hexBytes = 0xFF_EC_DE_5E;
        var bytes = 0b11010010_01101001_10010100_10010010;
        System.out.println(oneMillion);
        System.out.println(creditCardNumber);
        System.out.println(hexBytes);
        System.out.println(bytes);

    }

}
