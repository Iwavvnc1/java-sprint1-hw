public class Converter {
    StepTracker stepTracker = new StepTracker();

    public void converterdistance() { // метод перевода шагов в км
        double i = 0.00075 * stepTracker.sumStep;
        System.out.println(i);
    }
    public void calories() { //метод перевода шагов в калории
        double calories = 0.05 * stepTracker.sumStep;
        System.out.println(calories);
    }
}
/*double calories = 0.05 * step;*/
