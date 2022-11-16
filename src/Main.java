import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Введите порядковый номер месяца начиная с 0:");
                //scan
                System.out.println("Введите порядковый номер дня:");
                //scan
                System.out.println("Введите количество шагов:");
                //scan
                // сохранение данных в массив
                System.out.println("данные сохранены");
                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 2) {
                System.out.println("Введите порядковый номер месяца начиная с 0:");
                //scan
                System.out.println("Статистика за  /*mounth*/месяц.");
                // 1 day: 3000step;2 day: 1000 step ...
                //sumStep
                //maxStep
                //averageStepMounth
                //distanse km
                //calories
                /*bestSeries Лучшая серия: максимальное количество подряд идущих дней,
                в течение которых количество шагов за день было равно или выше целевого.
                 */

                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 3) {
                System.out.println("Введите количество шагов: ");
                //scan
                //save
                System.out.println("Новая цель:   /*цель*/  шагов.");
                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 0) {
                System.out.println("Программа завершена");
                return;
            } else {
                System.out.println("Такая команда еще не доступна, попробуйте еще раз.");
                printMenu();
                userInput = scanner.nextInt();
            }
        }
    }
        public static void printMenu() {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1. Ввести количество шагов за определённый день;");
            System.out.println("2. Напечатать статистику за определённый месяц;");
            System.out.println("3. Изменить цель по количеству шагов в день;");
            System.out.println("0. Выйти из приложения.");
        }
    }
