package com.ctseducare.java.j01_variables_datatypes;

public class CheckingDataType {

    public static void main(String[] args) {

        byte a = 5;
        System.out.println(((Object) a).getClass().getSimpleName());

        float b = 3.14f;
        System.out.println(((Object) b).getClass().getSimpleName());

        String c = "Java";
        System.out.println(((Object) c).getClass().getSimpleName());

    }

}
