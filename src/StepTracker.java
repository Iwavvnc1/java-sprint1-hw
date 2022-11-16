public class StepTracker {
    int desiredStep = 10_000;
    int sumStep;
    public int[][] days = new int[12][30];
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
        public int maxStep(int mounth) { //метод для поиска наибольшего количества шагов за день
        int max = 0;
        for (int i = 0; i < 30; i++) {
            if (days[mounth][i] > days[mounth][max]) {
                max = i;
            }
        }
        System.out.println(days[mounth][max]);
        return days[mounth][max];
        }
        public void averageStepMounth(int mounth) { // метод для рассчета среднего количества шагов
        int average = sumStep(mounth)/30;
        System.out.println(average);
        }
        public void bestSeries(int mounth) {
        int j = 0;
        for (int i = 0; i < 30; i++) {
            if (days[mounth][i] > days[mounth][j]) {

        }
    }
    }
