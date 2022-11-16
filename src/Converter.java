public class Converter {
    StepTracker stepTracker = new StepTracker();

    public void distance(int mounth) {
        double i = 0.00075 * stepTracker.sumStep(mounth);
        System.out.println(i);
    }
}
/*double calories = 0.05 * step;*/
