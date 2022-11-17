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
                int userMonth = scanner.nextInt();
                if (stepTracker.checkMonth(userMonth)) {
                    System.out.println("Введите номер дня:");
                    int userDay = scanner.nextInt();
                    if (stepTracker.checkDay(userDay)) {
                        System.out.println("Введите количество шагов:");
                        int userStep = scanner.nextInt();
                        if (stepTracker.checkStep(userStep)) {
                            stepTracker.step(userStep, userMonth, userDay - 1);
                            System.out.println("Данные сохранены.");
                        }
                    }
                }
                printMenu();
                userInput = scanner.nextInt();

            } else if (userInput == 2) {

                System.out.println("Введите номер месяца");
                System.out.println("0-январь, 1-февраль,2-март,3-апрель,4-май,5-июнь,6-июль,7-август,8-сентябрь,9-октябрь,10-ноябрь,11-декабрь");
                int userMonth = scanner.nextInt();
                if (stepTracker.checkMonth(userMonth)) {
                    System.out.println("Статистика за " + userMonth + " месяц:");
                    System.out.println("Количество пройденных шагов по дням:");
                    stepTracker.stepOnDays(userMonth);

                    System.out.println("Общее количество шагов за месяц: ");
                    System.out.println(stepTracker.sumStep(userMonth));

                    System.out.println("Максимальное пройденное количество шагов в месяце:");
                    stepTracker.maxStep(userMonth);

                    System.out.println("Среднее количество шагов за месяц:");
                    stepTracker.averageStepMounth(userMonth);

                    System.out.println("Пройденная дистанция (в км): ");
                    converter.converterDistance(userMonth);

                    System.out.println("Количество сожжённых килокалорий:");
                    converter.calories(userMonth);

                    System.out.println("Лучшая серия дней:");
                    stepTracker.bestSeries(userMonth);
                }
                    printMenu();
                    userInput = scanner.nextInt();

            } else if (userInput == 3) {

                System.out.println("Старая цель: " + stepTracker.desiredStep);
                System.out.println("Введите количество шагов: ");

                int userStep;
                userStep = scanner.nextInt();
                stepTracker.desiredStep = userStep;
                System.out.println("Новая цель:" + stepTracker.desiredStep + " шагов.");

                printMenu();
                userInput = scanner.nextInt();
            } else if ((userInput > 4) || (userInput < 0)) {

                System.out.println("Такая команда еще не доступна, попробуйте еще раз.");
                printMenu();
                userInput = scanner.nextInt();


            } else {
                System.out.println("Программа завершена");
                return;
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
