import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner cn = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            out.print("Введите значение массива(целое число): ");
            int value = cn.nextInt();
            arr[i] = value;
        }
        out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (j % 3 == 0) {
                out.println("Значение массива кратное трем: " + j);
            }
        }
    }
}
