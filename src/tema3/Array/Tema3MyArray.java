package tema3.Array;

public class Tema3MyArray {

    public static void main(String[] args) {
        int [] array1;
        array1 = new int [] {0,1,2,3,4};
        int [] array2;
        array2 = new int [] {5,6,7,8,9};
    }

    // Case a
    public static void imprimirArray (int [] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    // Case b
    public static void imprimirMaxArray (int [] array1) {
        int max;
        int max1 = 1;
        for (int i = 0; i < array1.length; i++) {
            max = array1[i];
            if (max > max1) {
                max1 = array1[i];
            }
        }
        System.out.println("El número máximo es: " + max1);
    }

    // Case c
    public static void imprimirMinArray (int [] array1) {
        int min;
        int min1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min1) {
                min1 = array1[i];
            }
        }
        System.out.println("El número mínimo es: " + min1);
    }

    // Case d
    public static void imprimirMedia (int [] array1) {
        int suma = 0;
        for (int i = 0; i < array1.length; i++) {
            suma = suma + array1[i];
        }
        int media = suma / array1.length;
        System.out.println("La media del array es: " + media);
    }

    // Case e
    public static boolean existeValor (int [] array1, int num) {
        for (int i = 0; i < array1.length; i++) {
            if (num == array1[i]) {
                return true;
            }
        }
        return false;
    }

    // Case f
    public static void sumaVectores (int [] array1, int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            System.out.println("La suma de los vectores es: " + (array2[i] + array1[i]));
        }
    }

    // Case g
    public static void restaVectores (int [] array1, int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            System.out.println("La resta de los vectores es: " + (array2[i] - array1[i]));
        }
    }

    // Case h
    public static void productoEscalar (int [] array1, int [] array2) {
        int resultado = 0;
        for (int i = 0; i < array1.length; i++) {
            System.out.println("El producto escalar de los vectores es: " + (array1[i] * array2[i]));
        }
    }

    // Case i
    public static String arrayInversa (int [] array1) {
        String resultado = "";
        for (int i = array1.length - 1 ; i >= 0 ; i--) {
            resultado += array1[i] + "";
        }
        return resultado;
    }

    // Case j
    public static void procedimientoArrayInverso (int [] array1) {
        for (int i = array1.length - 1; i >= 0 ; i--) {
            System.out.println(array1[i]);
        }
    }

    // Case k
    public static boolean esCapicua (int [] array1) {
        for (int i = 0; i < array1.length / 2; i++) {
            if (array1[i] != array1[array1.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
