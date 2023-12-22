import java.util.Scanner;
import static java.lang.System.*;

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
