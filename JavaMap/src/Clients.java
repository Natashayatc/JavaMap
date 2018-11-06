/**Написать программу которая в консоли считывает количество пользователей,
 * затем для каждого пользователя запрашивает login и password,
 * @version 1.0 05 ноября 2018
 * @author Наташа Яценя
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Clients {

    private Clients() {
    }
    public static Map<String, String> map = new HashMap<String, String>();
    public static Scanner input = new Scanner(System.in);
    public static int numberUsers() {
        System.out.println("Введите количество пользователей:");
        int n;
        n = Integer.parseInt(input.nextLine());
        return n;
    }

    public static void Users(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Введите login:");
            String user = input.nextLine();
            System.out.println("Ведите пароль:");
            String pass = input.nextLine();
            map.put(user, pass);
        }
    }

    public static void Information() {
            System.out.println("Введите login для поиска");
            String login = input.nextLine();
            String pass = map.get(login);
            System.out.println("Login - " + login);
            System.out.println("Password - " + pass);
        }

    public static void main(final String[] args) {
        int numbers;
        numbers = numberUsers();
        Users(numbers);
        Information();
    }
    }


