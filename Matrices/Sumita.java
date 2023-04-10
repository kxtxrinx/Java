package Matrices;

public class Sumita {

    public static void mostrarMatriz(int[][]m){
        for(int[]c:m){
            System.out.println();
            for(int d:c){
                System.out.print(d + " ");
            }
        }
    }

    public static void sumaMatriz(int[][] m){
        float[] sumaCol = new float[m[0].length];
        float[] sumaFilas = new float [m.length];
        float sumaTotal = 0.0f;

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                sumaTotal+=m[i][j];
            }
        }

        System.out.println("SUMA TOTAL : " + sumaTotal);

        float suma = 0.0f;

        for(int i=0;i<m.length;i++){
            suma=0;
            for(int j=0;j<m[0].length;j++){
                suma+=m[i][j];
            }
            sumaFilas[i] = suma;
        }

        for(int i=0;i<m[0].length;i++){
            suma=0;
            for(int j=0;j<m.length;j++){
                suma+=m[j][i];
            }
            sumaCol[i] = suma;
        }

        mostrarSuma(sumaCol, sumaFilas);
        
    }

    public static void mostrarSuma(float[] sumaCol, float[] sumaFilas ){
        for(int i=0;i<sumaCol.length;i++){
            System.out.println("Columna " + i );
            System.out.println(sumaCol[i]);
        }

        for(int i=0;i<sumaFilas.length;i++){
            System.out.println("Fila " + i );
            System.out.println(sumaFilas[i]);
        }
    }

    public static float sumarDosMatrices(int[][]m1, int[][]m2){
        float sumaM1 = 0.0f;
        float sumaM2 = 0.0f;

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2.length;j++){
                sumaM1+=m1[i][j];
            }
        }

        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2.length;j++){
                sumaM2+=m2[i][j];
            }
        }

        float total = sumaM1 + sumaM2;
        return total;
    }

    public static void main(String[]args){
        System.out.println("Bienvenido a Matrix!");
        int[][] m = {{12,23,43,54},{123,23,4,5},{1,2,3,4}};
        int[][] m2 = {{1,2,3,1},{2,3,4,1},{2,3,55,1}};

        mostrarMatriz(m);
        sumaMatriz(m);

        mostrarMatriz(m2);
        sumaMatriz(m2);

        System.out.println("Ambas matrices suman un total de " + sumarDosMatrices(m, m2));

    }
}
