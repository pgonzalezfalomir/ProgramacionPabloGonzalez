package tema3.Array;

public class ejemplo {
    public static void main(String[] args) {
        int [] array = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        printArray(array);
    }

    public static void printArray (int [] array) {
        for (int contador = 1; contador < array.length; contador++) {
            array[contador] = contador * 2;
        }

    }
}
