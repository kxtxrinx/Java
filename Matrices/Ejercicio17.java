package Matrices;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        /* 
        int[][] m = {
                        {3,7,8},
                        {1,0,3},
                        {4,7,9}
                    };

    
        for(int[] c:m){
            System.out.println();
            for(int d:c){
                System.out.print(d);
            }
        }
        System.out.println();

        */
        //Pedir matriz
        System.out.println("Filas:");
        int filas = s.nextInt();
        System.out.println("Columnas:");
        int col = s.nextInt();

        int[][] m2 = new int[filas][col];
        System.out.println("Matriz de " + filas + " filas y " + col + " columnas, creada correctamente.");

        for(int i=0;i<filas;i++){
            for(int j=0;j<col;j++){
                System.out.println("Valores fila " + i + " columna " + j);
                m2[i][j] = s.nextInt();
            }
        }

        for(int[] c:m2){
            System.out.println();
            for(int d:c){
                System.out.print(d + " ");
            }
        }


        //suma
        float suma = 0;
        float[] sumaFilas = new float[filas];
        float[] sumaCol = new float[col];

        //sumar filas
        for(int i=0;i<m2.length;i++){
            suma=0;
            for(int j=0;j<m2[0].length;j++){
                suma+=m2[i][j];
            }
            sumaFilas[i] = suma;
        }

        // filas -> m.length;
        //columnas -> m[0].length;

        //sumar columnas
        for(int i=0;i<m2[0].length;i++){
            suma=0;
            for(int j=0;j<m2.length;j++){ //TANTO TIEMPO PORQUE AQUÍ NO SE PONÍA m2[0].length YA QUE SE SUMAN LAS COLUMNAS!!! NO LAS FILAS
                suma+=m2[j][i];
            }
            sumaCol[i] = suma;
        }

        //Filas
        System.out.println("\nSuma de la matriz: ");
        for(int i=0;i<sumaFilas.length;i++){
            System.out.println("Fila " + i);
            System.out.println("Suma de: " + sumaFilas[i]);
            System.out.println("----------------");
        }

        //Columnas
        for(int i=0;i<sumaCol.length;i++){
            System.out.println("Columna " + (i+1));
            System.out.println("Suma de: " + sumaCol[i]);
            System.out.println("--------------");
        }


        s.close();
    }


    
}
