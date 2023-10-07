package com.idiomas.backend;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 ==0){
            System.out.println("El numero: " + a + " es par");
        } else {
            System.out.println("El numero:" +a+ " es impar");
        }
    }
}
