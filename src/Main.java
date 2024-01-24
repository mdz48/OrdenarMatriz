import models.Ordenar;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        short n;
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        n = keyboard.nextShort();
        short[][] array = new short[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (short i = 0; i < array.length; i++) {
            for (short j = 0; j < array.length; j++) {
                array[i][j] = keyboard.nextShort();
            }
        }
        Ordenar sort = new Ordenar();
        sort.setSize(n);
        sort.setData(array);
        sort.ordenamiento();
        short[][] aux = sort.getData();

        System.out.println("Matriz ordenada:");
        for (short i = 0; i < aux.length; i++) {
            for (short j = 0; j < aux.length; j++) {
                System.out.print(aux[i][j] + " ");
            }
            System.out.println();
        }
    }
}