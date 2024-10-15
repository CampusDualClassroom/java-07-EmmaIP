package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(13);
        sumFirstNaturalNumbers(6);
        showFirstNaturalNumbers(5);

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> NumberList = new ArrayList<>();
        NumberList.add(1);
        NumberList.add(2);
        NumberList.add(3);
        NumberList.add(4);
        NumberList.add(5);
        NumberList.add(6);
        NumberList.add(7);
        NumberList.add(8);
        NumberList.add(9);
        NumberList.add(10);

        int result = -1;

        for (int i = 0; i <NumberList.size(); i++) {
            if(NumberList.get(i) == num) {
                result = i;
            }
        }
        if(result >= 0) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + result);
        }
        else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros " + num + " números postivos es: "+ sum);

    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

}
