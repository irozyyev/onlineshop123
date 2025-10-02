import java.util.Scanner;

public class TicketShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tickets = {
            "Концерт Кайрат Нуртаса",
            "Концерт Димаша Кудайбергена",
            "Концерт JLO",
            "Концерт Miyagi",
            "Концерт Endspiel",
            "Матч Кайрат - Реал Мадрид",
            "Матч Кайрат - Актобе",
            "Матч Казахстан - Бельгия",
        };

        System.out.println("Добро пожаловать в магазин билетов!");
        System.out.println("Вот список концертов и матчей:");

        for (int i = 0; i < tickets.length; i++) {
            System.out.println((i + 1) + ". " + tickets[i]);
        }

        System.out.print("Введите номер концерта или матча, который хотите купить: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice >= 1 && choice <= tickets.length) {
            System.out.println("Вы выбрали билет на: " + tickets[choice - 1]);

            System.out.print("Введите вашу электронную почту: ");
            String email = sc.nextLine();

            System.out.println("На почту " + email + " отправлена ссылка для оплаты.");
            System.out.println("После оплаты вам будет выдан билет.");
        } else {
            System.out.println("Неверный выбор!");
        }

        sc.close();
    }
}
