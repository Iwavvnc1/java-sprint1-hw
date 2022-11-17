public class Converter {
    StepTracker stepTracker = new StepTracker();

    public void converterDistance(int month) { // метод перевода шагов в км
        double i = 0.00075 * stepTracker.sumStep(month);
        System.out.println(i);
    }
    public void calories(int month) { //метод перевода шагов в калории
        double calories = 0.05 * stepTracker.sumStep(month);
        System.out.println(calories);
    }
}
