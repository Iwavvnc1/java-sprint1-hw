public class StepTracker {
    MonthData[] monthToData;
    int desiredStep = 10_000;
    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    class MonthData {
        // Заполните класс самостоятельно
    }
}
