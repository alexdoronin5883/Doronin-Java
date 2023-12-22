import java.util.Scanner;
import static java.lang.System.*;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, 
//то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

public class Task_2 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        out.println("Введите имя: ");
        String name = cn.next();
        if(name.equals("Вячеслав")) {
            out.println("Привет, " + name + "!");
        }else{
            out.println("Нет такого имени.");
        }
    }
}
