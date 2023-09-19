import java.util.Scanner;
import java.util.Random;

public class ArrayShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (n): ");
        int n = scanner.nextInt();
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        int[] array = randomArray(n, a, b);
        System.out.println("Исходный массив:");
        printArray(array);
        System.out.print("Введите количество позиций для сдвига (move_right): ");
        int move_right = scanner.nextInt();
        moveRightFunction(array, move_right);
        System.out.println("Массив после сдвига:");
        printArray(array);
    }
    public static int[] randomArray(int n, int a, int b) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(b - a + 1) + a;
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void moveRightFunction(int[] array, int move_right) {
        // Создаем временную переменную для хранения элемента при сдвиге
        int lastElement;
        // Выполняем сдвиг элементов вправо
        for (int j = 0; j < move_right; j++) {
            // Сохраняем последний элемент
            lastElement = array[array.length - 1];
            // Сдвигаем все элементы на одну позицию вправо
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            // Помещаем последний элемент на первое место
            array[0] = lastElement;
        }
    }
}