package tema3.Array;

import java.util.Scanner;

public class Tema3MenuMyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menú: ¿Cuál quieres hacer?");
        System.out.println("'1': Funciones y procedimientos");
        System.out.println("'2': Atrapa a la mosca");
        System.out.println("'3': Simulacion de cobertura");
        System.out.println("'4': Buscar parejas");
        System.out.println("'5': Buscaminas");
        int ejercicio = in.nextInt();

        switch (ejercicio) {
            case 1:
                System.out.println("¿Qué ejercicio quieres hacer?");
                System.out.println("'a': Procedimiento que imprima el array");
                System.out.println("'b': Función que devuelve el máximo del array");
                System.out.println("'c': Función que devuelve el mínimo del array");
                System.out.println("'d': Función que devuelve la media");
                System.out.println("'e': Función que dice si un elemento existe o no");
                System.out.println("'f': Función que hace la suma de dos vectores");
                System.out.println("'g': Función que hace la resta de dos vectores");
                System.out.println("'h': Función que hace el producto escalar de dos vectores");
                System.out.println("'i': Función que invierte el orden del array");
                System.out.println("'j': Procedimiento que invierte el orden del array");
                System.out.println("'k': Función que indica si el array es capicua o no");
                System.out.println("'l': Menú que permite introducir 1 o 2 vectores y hacer las operaciones anteriores");
                char opcion = in.next().charAt(0);
                switch (opcion) {
                    case 'a':
                        int [] array1;
                        array1 = new int [] {0,1,2,3,4,5};
                        Tema3MyArray.imprimirArray(array1);
                        break;
                    case 'b':
                        int [] array2;
                        array2 = new int [] {0,1,2,3,4,5};
                        Tema3MyArray.imprimirMaxArray(array2);
                        break;
                    case 'c':
                        int [] array3;
                        array3 = new int [] {0,1,2,3,4,5};
                        Tema3MyArray.imprimirMinArray(array3);
                        break;
                    case 'd':
                        int [] array4;
                        array4 = new int [] {0,1,2,3,4};
                        Tema3MyArray.imprimirMedia(array4);
                        break;
                    case 'e':
                        int [] array5;
                        array5 = new int [] {0,1,2,3,4};
                        System.out.println("Dime un número:");
                        int num = in.nextInt();
                        if (Tema3MyArray.existeValor(array5, num)) {
                            System.out.println("El número " + num + " si esta en el array");
                        } else {
                            System.out.println("El número " + num + " no esta en el array");
                        }
                        break;
                    case 'f':
                        int [] array6;
                        array6 = new int [] {0,1,2,3,4};
                        int [] array7;
                        array7 = new int [] {5,6,7,8,9};
                        Tema3MyArray.sumaVectores(array6, array7);
                        break;
                    case 'g':
                        int [] array8;
                        array8 = new int [] {0,1,2,3,4};
                        int [] array9;
                        array9 = new int [] {5,6,7,8,9};
                        Tema3MyArray.restaVectores(array8, array9);
                        break;
                    case 'h':
                        int [] array10;
                        array10 = new int [] {0,1,2,3,4};
                        int [] array11;
                        array11 = new int [] {5,6,7,8,9};
                        Tema3MyArray.productoEscalar(array10, array11);
                        break;
                    case 'i':
                        int [] array12;
                        array12 = new int [] {0,1,2,3,4};
                        System.out.println(Arrays.toString(array12));
                        System.out.println("En inversa:");
                        System.out.println(Tema3MyArray.arrayInversa(array12));
                        break;
                    case 'j':
                        int [] array13;
                        array13 = new int [] {0,1,2,3,4};
                        Tema3MyArray.procedimientoArrayInverso(array13);
                        break;
                    case 'k':
                        int [] array14;
                        array14 = new int [] {0,1,2,1,0};
                        if (Tema3MyArray.esCapicua(array14)) {
                            System.out.println("Es capicua");
                        } else {
                            System.out.println("No es capicua");
                        }
                        break;
                    case 'l':
                }
        }
    }
}
