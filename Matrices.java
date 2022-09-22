package com.fc;
public class Matrices {
    public static void main(String[] args) {
        int a[][], b[][], c[][];
        a=new int[3][2];
        b=new int[2][3];
        c=new int[3][3];
        LlenarArrays(a, b);
        MostrarArray(a, b);
        multiplicacion(a, b, c);
        
    }
    public static void LlenarArrays(int a[][],int b[][] ){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j]=(int)(Math.random()*10+1);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3; j++) {
                b[i][j]=(int)(Math.random()*10+1);
            }
        }
    }
    public static void MostrarArray(int a[][], int b[][]){
        System.out.println("Primera Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Segunda matriz B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void multiplicacion(int a[][],int b[][],int c[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int j2 = 0; j2 < 2; j2++) {
                    c[i][j]+=a[i][j2]*b[j2][j];
                }
            }
        }
        System.out.println("RESULTADO (A*B)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}