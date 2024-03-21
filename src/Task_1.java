import java.util.Scanner;
import static java.lang.System.*;

// Составить алгоритм: если введенное число больше 7, вывести “Привет”

public class Task_1 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        out.println("Введите число: ");
        int num = cn.nextByte();
        if(num > 7){
            out.println("Привет!");
        }
    }

}
