package Ejercicio1;

import java.util.Arrays;

public class Genericos {

	public static void main(String[] args) {
		Integer[] arrayOriginal = {1, 2, 3, 4, 5};
        Integer[] arrayInverso = reverse(arrayOriginal);
        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array inverso: " + Arrays.toString(arrayInverso));
    }

    protected static <T> T[] reverse(T[] arrayOriginal) {
        int length = arrayOriginal.length;
        T[] arrayInverso = Arrays.copyOf(arrayOriginal, length);
        
        for (int i = 0; i < length / 2; i++) {
            T temp = arrayInverso[i];
            arrayInverso[i] = arrayInverso[length - i - 1];
            arrayInverso[length - i - 1] = temp;
        }
        return arrayInverso;
    }

}
