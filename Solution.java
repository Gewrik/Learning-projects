<<<<<<< HEAD
import java.util.ArrayList;

/*
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Гвинно");
    }

    public static void paySalary(String name) {
        if (name == null) return;
        waitingEmployees.remove(name);
        alreadyGotSalaryEmployees.add(name);
    }
}
=======
public class Solution {


}
>>>>>>> origin/main
