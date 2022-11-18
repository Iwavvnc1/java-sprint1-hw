public class Converter {
    double stepKm = 0.00075;
    double stepCalories = 0.05;
    public double converterDistance(int steps) { // метод перевода шагов в км
       return stepKm * steps;
    }
    public double calories(int steps) { //метод перевода шагов в калории
        return stepCalories * steps;
    }
}
