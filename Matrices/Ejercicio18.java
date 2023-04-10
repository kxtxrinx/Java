package Matrices;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
       
        int[][] m = new int[5][5];
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                m[i][j] = i+j;
            }
        }

        for(int[] c:m){
            System.out.println();
            for(int d:c){
                System.out.print(d + " ");
            }
        }

        //Diagonal 1
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                    m[i][j] = 1;
                }else{
                    m[i][j] = 0;
                }
            }
        }

        System.out.println();
        System.out.println("---------------------------");
        for(int[] c:m){
            System.out.println();
            for(int d:c){
                System.out.print(d + " ");
            }
        }


 
        //Matriz marco; bordes como 1 y resto como 0.
        int[][] marco = new int[8][6];
        for(int i=0;i<marco.length;i++){
            for(int j=0;j<marco[0].length;j++){
                if(j==0 || j == marco[0].length-1 || i==0 || i == marco.length-1){ // Unos hacia abajo
                    marco[i][j] = 1;
                }else{
                    marco[i][j] = 0;
                }
            }
        }

        System.out.println("\n MATRIZ MARCO");
        System.out.println("---------------------------");
        for(int[] c:marco){
            System.out.println();
            for(int d:c){
                System.out.print(d + " ");
            }
        }

        

        s.close();
    }
    
}
