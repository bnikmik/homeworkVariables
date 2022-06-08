public class Main {
    public static void main(String[] args) {

        //Задание №1

        byte a = 120;
        short b = 10000;
        int c = 89202;
        long d = 302323230L;
        float e = 0.232f;
        double g = 0.222222222222232;
        char h = 35;
        boolean i = 20>3;

        System.out.println("Задание №1:");
        System.out.println("Знак " + h);
        System.out.println("20>3 " + i);
        System.out.println(" ");

        //Задание №2

        float boxerFirstWeight = 78.2f;
        float boxerSecondWeight = 82.7f;
        float boxerTogetherWeight = boxerFirstWeight + boxerSecondWeight;
        float boxerDifferenceWeight = boxerSecondWeight % boxerFirstWeight; //решил попробовать вывести через остаток
        System.out.println("Задание №2:");
        System.out.println("Общий вес боксеров " + boxerTogetherWeight + " кг");
        System.out.println("Разница между весами боксеров " + boxerDifferenceWeight + " кг");

        //Задание №3

        byte bananaQuantity = 5;
        byte bananaWeight = 80;
        byte milk100GramQuantity = 2;
        byte milk100GramWeight = 105;
        byte icecreamQuantity = 2;
        byte icecreamWeight = 100;
        byte eagQuantity = 4;
        byte eagWeight = 70;

        int breakfastWeightGram = (bananaWeight * bananaQuantity) + (milk100GramWeight * milk100GramQuantity) + (icecreamWeight * icecreamQuantity) + (eagWeight * eagQuantity);
        float breakfastWeightKilogram = breakfastWeightGram / 1_000f;
        System.out.println(" ");
        System.out.println("Задание №3:");
        System.out.println("Общий вес завтрака " + breakfastWeightKilogram + " кг");

        //Задание №4

        short weightLossDietA = 250;
        short weightLossDietB = 500;
        byte weightLossEndKilogram = 7;
        int weightLossEndGram = weightLossEndKilogram * 1_000;
        int dayWeightLossDietA = weightLossEndGram / weightLossDietA;
        int dayWeightLossDietB = weightLossEndGram / weightLossDietB;
        int dayWeightLossDietAverage = (dayWeightLossDietA + dayWeightLossDietB) / 2;

        System.out.println(" ");
        System.out.println("Задание №4:");
        System.out.println("Кол-во дней для похудения при потере 250 г/день потребуется " + dayWeightLossDietA);
        System.out.println("Кол-во дней для похудения при потере 500 г/день потребуется " + dayWeightLossDietB);
        System.out.println("Кол-во дней для похудения в среднем потребуется " + dayWeightLossDietAverage);

        //Задание №5

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int salaryRaisingMasha = (salaryMasha * 10/100) + salaryMasha;
        int salaryRaisingDenis = (salaryDenis * 10/100) + salaryDenis;
        int salaryRaisingKristina = (salaryKristina * 10/100) + salaryKristina;
        int annualIncomeBeforeMasha = salaryMasha * 12;
        int annualIncomeBeforeDenis = salaryDenis * 12;
        int annualIncomeBeforeKristina = salaryKristina * 12;
        int annualIncomeNowMasha = salaryRaisingMasha * 12;
        int annualIncomeNowDenis = salaryRaisingDenis * 12;
        int annualIncomeNowKristina = salaryRaisingKristina * 12;
        int annualIncomeDifferenceMasha = annualIncomeNowMasha - annualIncomeBeforeMasha;
        int annualIncomeDifferenceDenis = annualIncomeNowDenis - annualIncomeBeforeDenis;
        int annualIncomeDifferenceKristina = annualIncomeNowKristina - annualIncomeBeforeKristina;

        System.out.println(" ");
        System.out.println("Задание №5:");
        System.out.println("Зарплата Маши после повышения " + salaryRaisingMasha + " рублей в месяц. Годовой доход вырос на " + annualIncomeDifferenceMasha + " рублей.");
        System.out.println("Зарплата Дениса после повышения " + salaryRaisingDenis + " рублей в месяц. Годовой доход вырос на " + annualIncomeDifferenceDenis + " рублей.");
        System.out.println("Зарплата Кристины после повышения " + salaryRaisingKristina + " рублей в месяц. Годовой доход вырос на " + annualIncomeDifferenceKristina + " рублей.");

    }
}