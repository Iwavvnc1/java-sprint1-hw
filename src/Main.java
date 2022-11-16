import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Введите номер месяца:");
                int userMounth = scanner.nextInt();
                System.out.println("Введите номер дня:");
                int userDay = scanner.nextInt();
                System.out.println("Введите количество шагов:");
                int userStep = scanner.nextInt();
                stepTracker.step(userStep, userMounth, userDay-1);
                System.out.println("данные сохранены");
                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 2) {
                System.out.println("Введите номер месяца");
                int userMounth = scanner.nextInt();
                System.out.println("Статистика за " + userMounth + " месяц.");
                System.out.println("Количество пройденных шагов по дням:");
                stepTracker.stepOnDays(userMounth);
                System.out.println("Общее количество шагов за месяц: ");
                stepTracker.sumStep(userMounth);
                System.out.println("Максимальное пройденное количество шагов в месяце:");
                stepTracker.maxStep(userMounth);
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
