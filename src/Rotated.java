 public class Rotated {


    public static final int SIZE = 8;
    public   static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void namberPrint(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
    public static void rotated(int rotatedColor[][], int colors[][]){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE ; j ++){
                rotatedColors[j][i] = colors[SIZE -1 -i][j];
            }
        }
    }
    public static void rotated180(int rotatedColor[][], int colors[][]){
        for (int i = 0; i< SIZE;i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
            }
        }
    }
    public static void rotated270(int rotatedColor[][], int colors[][]){
        for (int i = 0; i< SIZE;i++){
            for (int j = 7; j >=0; j--)
                rotatedColors[j][i] = colors [i][SIZE -1 - j];
        }
    }






}
