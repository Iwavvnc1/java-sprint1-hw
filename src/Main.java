import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                stepTracker.countStep();
            } else if (userInput == 2) {
                    stepTracker.statistics();
            } else if (userInput == 3) {
                stepTracker.purpose();
            } else if ((userInput > 4) || (userInput < 0)) {
                System.out.println("Такая команда еще не доступна, попробуйте еще раз.");
            } else {
                System.out.println("Программа завершена");
                return;
            }
            printMenu();
            userInput = scanner.nextInt();
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