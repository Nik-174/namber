
import java.util.Random;
import java.util.Scanner;

public class Namber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        for (int i = 0; i < Rotated.SIZE; i++) {
            for (int j = 0; j < Rotated.SIZE; j++) {
                Rotated.colors[i][j] = random.nextInt(256);
            }
        }

        while (true) {

            System.out.println("Цифровая матрица" + "\n");
            Rotated.namberPrint(Rotated.colors);
            System.out.println();
            System.out.println("На сколько градусов повернуть матрицу '90,180,270' ?");
            System.out.println("или введите 'end' для выхода");
            String degree = scanner.nextLine();
            if (degree.equals("end")) {
                System.out.println("The end");
                break;
            }
            int r = Integer.parseInt(degree);

            if (r == 90) {
                Rotated.rotated(Rotated.rotatedColors, Rotated.colors);
            } else if (r == 180) {
                Rotated.rotated180(Rotated.rotatedColors, Rotated.colors);
            } else if (r == 270) {
                Rotated.rotated270(Rotated.rotatedColors, Rotated.colors);
            } else {
                System.out.println("Ввели не верный угол");
                break;
            }
            Rotated.namberPrint(Rotated.rotatedColors);
            System.out.println();
            System.out.println(" ___________________________________" + "\n\n\n");

        }
    }
}

