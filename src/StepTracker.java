import java.util.Scanner;
public class StepTracker {
    Converter converter = new Converter();
    Scanner scanner = new Scanner(System.in);
    public int desiredStep = 10_000;
    public int sumStep;
    public int countDayOnMonth = 30;
    public static int[][] days = new int[12][30];

    public void step(int step, int mounth, int day) { //метод сохранения шагов в массив
        days[mounth][day] = step;
    }

    public void stepOnDays(int mounth) { //метод который показывает шаги по дням
        int number = 1;
        for (int i = 0; i < countDayOnMonth; i++) {
            System.out.print(number + " день: " + days[mounth][i] + ", ");
            number = number + 1;
        }
        System.out.println(" ");
    }

    public int sumStep(int mounth) { //метод для подсчёта суммы шагов
        sumStep = 0;
        for (int i = 0; i < countDayOnMonth; i++) {
            sumStep += days[mounth][i];
        }
        return sumStep;
    }

    public void maxStep(int mounth) { //метод для поиска наибольшего количества шагов за день
        int max = 0;
        for (int i = 0; i < countDayOnMonth; i++) {
            if (days[mounth][i] > days[mounth][max]) {
                max = i;
            }
        }
        System.out.println(days[mounth][max]);
    }

    public void averageStepMounth(int mounth) { // метод для рассчета среднего количества шагов
        int average = sumStep(mounth) / countDayOnMonth;
        System.out.println(average);
    }

    public int bestSeries(int month) { // метод для расчета лучшей серии
        int bestSeries = 0;
        int series =1;
        for (int i = 1; i < countDayOnMonth; i++) {
            if ((days[month][i - 1] >= desiredStep) && (days[month][i] >= desiredStep)) {
                series += 1;
                if (series > bestSeries) {
                    bestSeries = series;
                }
            } else if ((days[month][i - 1] >= desiredStep) || (days[month][i] >= desiredStep)) {
                series = 1;
                if (series > bestSeries) {
                    bestSeries = series;
                }
            }
        }
        return bestSeries;
    }

    public boolean checkStep(int step) { // метод проверки введенного значения
        if ((step < 0) || (step > 100_000)) {
            System.out.println("Недопустимое значение.");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkDay(int day) { // метод проверки введенного значения
        if ((day < 0) || (day > 31)) {
            System.out.println("Недопустимое значение.");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkMonth(int month) { // метод проверки введенного значения
        if ((month < 0) || (month > 11)) {
            System.out.println("Недопустимое значение.");
            return false;
        } else {
            return true;
        }
    }

    public void statistics() {
        System.out.println("Введите номер месяца:");
        System.out.println("0-январь, 1-февраль,2-март,3-апрель,4-май,5-июнь,6-июль,7-август,8-сентябрь,9-октябрь,10-ноябрь,11-декабрь");
        int userMonth = scanner.nextInt();
        if (checkMonth(userMonth)) {
            System.out.println("Статистика за " + userMonth + " месяц:");
            System.out.println("Количество пройденных шагов по дням:");
            stepOnDays(userMonth);

            System.out.println("Общее количество шагов за месяц: ");
            System.out.println(sumStep(userMonth));

            System.out.println("Максимальное пройденное количество шагов в месяце:");
            maxStep(userMonth);

            System.out.println("Среднее количество шагов за месяц:");
            averageStepMounth(userMonth);

            System.out.println("Пройденная дистанция (в км): ");
            System.out.println(converter.converterDistance(sumStep));

            System.out.println("Количество сожжённых килокалорий:");
            System.out.println(converter.calories(sumStep));

            System.out.println("Лучшая серия дней:");
            System.out.println(bestSeries(userMonth));
        }
    }
        public void countStep() {
            System.out.println("Введите номер месяца:");
            System.out.println("0-январь, 1-февраль,2-март,3-апрель,4-май,5-июнь,6-июль,7-август,8-сентябрь,9-октябрь,10-ноябрь,11-декабрь");
            int userMonth = scanner.nextInt();
            if (checkMonth(userMonth)) {
                System.out.println("Введите номер дня:");
                int userDay = scanner.nextInt();
                if (checkDay(userDay)) {
                    System.out.println("Введите количество шагов:");
                    int userStep = scanner.nextInt();
                    if (checkStep(userStep)) {
                        step(userStep, userMonth, userDay - 1);
                        System.out.println("Данные сохранены.");
                    }
                }
            }
        }
        public void purpose() {
            System.out.println("Старая цель: " + desiredStep);
            System.out.println("Введите количество шагов: ");

            int userStep;
            userStep = scanner.nextInt();
            if (checkStep(userStep)) {
                desiredStep = userStep;
            System.out.println("Новая цель:" + desiredStep + " шагов.");
        }
        }
    }

