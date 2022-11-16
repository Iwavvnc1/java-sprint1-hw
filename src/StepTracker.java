public class StepTracker {
    int desiredStep = 10_000;
    int[][] days = new int[12][30];
    public void step(int step, int mounth, int day) {
        days[mounth][day] = step;
    }
    public void stepOnDays(int mounth) {
            int j = 1;
            for (int i = 0; i < 30; i++) {
                System.out.print(j + " день: " + days[mounth][i] + ", ");
                j = j + 1;
            }
            System.out.println(" ");
        }
        public int sumStep(int mounth) {
        int sumStep = 0;
        for (int i = 0; i < 30; i++) {
             sumStep += days[mounth][i];
        }
        return sumStep;
        }
        public int maxStep(int mounth) {
        int max = 0;
        for (int i = 0; i < 30; i++) {
            if (days[mounth][i] > days[mounth][max]) {
                max = i;
            }
        }
        System.out.println(days[mounth][max]);
        return days[mounth][max];
        }
        public void averageStepMounth(int mounth) {
        int average = sumStep(mounth)/30;
        System.out.println(average);
        }
    }
