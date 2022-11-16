import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {

                System.out.println("Введите номер месяца:");
                System.out.println("0-январь, 1-февраль,2-март,3-апрель,4-май,5-июнь,6-июль,7-август,8-сентябрь,9-октябрь,10-ноябрь,11-декабрь");
                int userMounth = scanner.nextInt();

                System.out.println("Введите номер дня:");
                int userDay = scanner.nextInt();

                System.out.println("Введите количество шагов:");
                int userStep = scanner.nextInt();
                stepTracker.step(userStep, userMounth, userDay-1);
                System.out.println("Данные сохранены.");

                printMenu();
                userInput = scanner.nextInt();

            } else if (userInput == 2) {

                System.out.println("Введите номер месяца");
                System.out.println("0-январь, 1-февраль,2-март,3-апрель,4-май,5-июнь,6-июль,7-август,8-сентябрь,9-октябрь,10-ноябрь,11-декабрь");
                int userMounth = scanner.nextInt();

                System.out.println("Статистика за " + userMounth + " месяц:");
                System.out.println("Количество пройденных шагов по дням:");
                stepTracker.stepOnDays(userMounth);

                System.out.println("Общее количество шагов за месяц: ");
                System.out.println(stepTracker.sumStep(userMounth));

                System.out.println("Максимальное пройденное количество шагов в месяце:");
                stepTracker.maxStep(userMounth);

                System.out.println("Среднее количество шагов за месяц:");
                stepTracker.averageStepMounth(userMounth);

                System.out.println("Пройденная дистанция (в км): ");
                converter.converterdistance();

                System.out.println("Количество сожжённых килокалорий:");
                converter.calories();

                System.out.println("Лучшая серия дней:");

                /*bestSeries Лучшая серия: максимальное количество подряд идущих дней,
                в течение которых количество шагов за день было равно или выше целевого.
                 */

                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 3) {

                System.out.println("Старая цель: " + stepTracker.desiredStep);
                System.out.println("Введите количество шагов: ");

                int userStep = scanner.nextInt();
                stepTracker.desiredStep = userStep;
                System.out.println("Новая цель:" + stepTracker.desiredStep + " шагов.");

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
