public class Converter {
    double km = 0.00075;
    double stepCalories = 0.05;
    public double converterDistance(int month) { // метод перевода шагов в км
        double distant;
        distant= km * month;
        return distant;
    }
    public double calories(int month) { //метод перевода шагов в калории
        double caloriesOnStep;
        caloriesOnStep = stepCalories * month;
        return caloriesOnStep;
    }
}
