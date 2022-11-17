public class StepTracker {
   public int desiredStep = 10_000;
    public static int[][] days = new int[12][30];
    public void step(int step, int mounth, int day) { //метод сохранения шагов в массив
        days[mounth][day] = step;
    }
    public void stepOnDays(int mounth) { //метод который показывает шаги по дням
            int j = 1;
            for (int i = 0; i < 30; i++) {
                System.out.print(j + " день: " + days[mounth][i] + ", ");
                j = j + 1;
            }
            System.out.println(" ");
        }
        public int sumStep(int mounth) { //метод для подсчёта суммы шагов
        int sumStep = 0;
        for (int i = 0; i < 30; i++) {
             sumStep += days[mounth][i];
        }
        return sumStep;
        }
        public void maxStep(int mounth) { //метод для поиска наибольшего количества шагов за день
        int max = 0;
        for (int i = 0; i < 30; i++) {
            if (days[mounth][i] > days[mounth][max]) {
                max = i;
            }
        }
        System.out.println(days[mounth][max]);
        }
        public void averageStepMounth(int mounth) { // метод для рассчета среднего количества шагов
        int average = sumStep(mounth)/30;
        System.out.println(average);
        }
        public void bestSeries(int month) { // метод для расчета лучшей серии
        int j = 1;
        int l = 0;
        for (int i =0; i < 30; i++) {
            if ((days[month][i] >= desiredStep) && (days[month][i+1] >= desiredStep)) {
                j += 1;
                if (j > l) {
                    l = j;
                }
            } else {
                j = 1;
            }
        }
            System.out.println(l);
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
        }
