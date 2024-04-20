public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        byte a=3;
        int b=25;
        short c=25484;
        long d=30046452L;
        float e=4.15f;
        double f=2.456;
        System.out.println("Значение переменной a с типом byte равно "+a) ;
        System.out.println("Значение переменной b с типом int равно "+b) ;
        System.out.println("Значение переменной c с типом short равно "+c) ;
        System.out.println("Значение переменной d с типом long равно "+d) ;
        System.out.println("Значение переменной c с типом float равно "+e) ;
        System.out.println("Значение переменной f с типом double равно "+f) ;

        System.out.println("\nЗадача 2");

        float e2=27.12f;
        long d2=987678965549L;
        float a3=2.786f;
        int b2=569;
        int b3=-159;
        short c2=27897;
        byte a2=67;

        System.out.println("\nЗадача 3");
        byte firstClass=23;
        byte secondClass=27;
        byte thirdClass=30;
        int paperAmount=500;
        int totalStudentsAmount=firstClass+secondClass+thirdClass;
        double listPerStudent=(double) paperAmount/totalStudentsAmount;
        System.out.println("На каждого ученика рассчитано "+listPerStudent+" листов бумаги");

        System.out.println("\nЗадача 4");
        int machinePerformance=16/2;
        int machinePerformancePerTwentyMinutes=machinePerformance*20;

        int minutesAmountPerDay=24*60;
        int machinePerformancePerDay=minutesAmountPerDay*machinePerformance;
        int machinePerformancePerThreeDays=minutesAmountPerDay*3*machinePerformance;
        int machinePerformancePerMonth=machinePerformancePerDay*31;

        System.out.println("За 20 минут машина произвела " +machinePerformancePerTwentyMinutes+" штук бутылок");
        System.out.println("За сутки машина произвела " +machinePerformancePerDay+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +machinePerformancePerThreeDays+ " штук бутылок");
        System.out.println("За 1 меясц машина произвела " +machinePerformancePerMonth+ " штук бутылок");

        System.out.println("\nЗадача 5");
        byte whitePaintPerClass=2;
        byte brownPaintPerClass=4;
        int allPotsPaint=120;
        double pallClassPerSchoolAmount=(double) allPotsPaint/(whitePaintPerClass+brownPaintPerClass);
        double allWhitePaintAmount=pallClassPerSchoolAmount*whitePaintPerClass;
        double allBrownPaintAmount=pallClassPerSchoolAmount*brownPaintPerClass;
        System.out.println("В школе, где "+pallClassPerSchoolAmount+" классов, нужно "+allWhitePaintAmount+
                " банок белой краски и " +allBrownPaintAmount+ " банок коричневой краски");

        System.out.println("\nЗадача 6");
        int bananasWeight=5*80;
        int milkWeight=105*2;
        int iceCreamWeight=2*100;
        int eggWeight=4*70;
        int breakfastWeight=bananasWeight+milkWeight+iceCreamWeight+eggWeight;
        double breakfastWeightInKg=(double) breakfastWeight/1000;
        System.out.println("Вес завтрака составляет "+breakfastWeightInKg+" кг.");

        System.out.println("\nЗадача 7");
        int athletesWeight=7;
        double minDays=(double) (athletesWeight*1000)/500;
        double maxDays=(double) (athletesWeight*1000)/250;
        double avgDays=(minDays+maxDays)/2;

        System.out.println("minDays="+minDays);
        System.out.println("maxDays="+maxDays);
        System.out.println("avgDays="+avgDays);

        System.out.println("\nЗадача 8");

        int mashaSalary=67760;
        int denisSalary=83690;
        int kristinaSalary=76230;
        double percent=1.1;

        int mashaSalaryInYear=67760*12;
        int denisSalaryInTear=83690*12;
        int kristinaSalaryInYear =76230*12;

        double mashaNewSalary=mashaSalary*percent;
        double denisNewSalary=denisSalary*percent;
        double kristinaNewSalary= kristinaSalary*percent;

        double mashaNewSalaryInYear=mashaSalary*percent*12;
        double denisNewSalaryInYear=denisSalary*percent*12;
        double kristinaNewSalaryInYear= kristinaSalary*percent*12;

        double mashaDiffSalaryInYear=mashaNewSalaryInYear-mashaSalaryInYear;
        double denisDiffSalaryInYear=denisNewSalaryInYear-denisSalaryInTear;
        double kristinaDiffSalaryInYear=kristinaNewSalaryInYear-kristinaSalaryInYear;

        System.out.println("Маша теперь получает "+mashaNewSalary+" рублей. Годовой доход вырос на "+mashaDiffSalaryInYear+" рублей");
        System.out.println("Денис теперь получает "+denisNewSalary+" рублей. Годовой доход вырос на "+denisDiffSalaryInYear+" рублей");
        System.out.println("Кристина теперь получает "+kristinaNewSalary+" рублей. Годовой доход вырос на "+kristinaDiffSalaryInYear+" рублей");

    }
}