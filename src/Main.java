public class Main {
    public static void main(String[] args){
    float firstboxer = (short) 78.2;
         float secondboxer = (short) 82.7;
         float totalweight = (short) (firstboxer + secondboxer);
        System.out.println("Общий вес обоих боксеров " + totalweight + "кг!");

        short bananes = 5;
        short milk = 200;
        short icecrem = 2;
        short eggs = 4;
        short breakfast = (short) (bananes * 80 + milk * 105 / 100 + icecrem * 100 + eggs *70);
                System.out.println("Масса спортивного завтрака " + breakfast+ " грамм.");
        float kg = breakfast / 1000f;
        System.out.println("Масса спортивного завтрака "+ kg + "кг!");

        short weightgr = 7 * 1000;
        short days = (short) (weightgr / 250);
        System.out.println("Спортсмену потребуется "+ days+ " дней чтобы остаться в своей весовой категории.");
        short day = (short) (weightgr / 500);
        System.out.println("Спортсмену потребуется "+ day+ " дней чтобы остаться в своей весовой категории.");
        short averageNumberOfDays =(short) ( (days+ day )/2 );
        System.out.println("В среднем понадобится "+averageNumberOfDays+" день.");

       int masha = 67760;
        int procentmasha = (masha /100*10);
        int newMashaSalary= procentmasha+ masha;
        int mashaSalaryYear= masha *12;
        int newMashaSalaryYear=newMashaSalary *12;
        int raznisaMasha= newMashaSalaryYear-mashaSalaryYear;

        System.out.println("Маша теперь получает " +newMashaSalary+" рублей.Годовой доход вырос на "+raznisaMasha+
        " рублей.");

        int denis=83690;
        int procentdenis= denis/100*10;
        int newDenisSalary= procentdenis + denis;
        int denisSalaryYear= denis *12;
        int newDenisSalaryYear= newDenisSalary*12;
        int raznisaDenis=newDenisSalaryYear-denisSalaryYear;
        System.out.println("Денис теперь получает " +newDenisSalary+" рублей.Годовой доход вырос на "+raznisaDenis+
                " рублей.");
        int Kristina=76230;
        int procentKristina= Kristina/100*10;
        int newKristinaSalary= procentKristina +Kristina;
        int KristinaSalaryYear= Kristina*12;
        int newKristinaSalaryYear= newKristinaSalary*12;
        int raznisaKristina=newKristinaSalaryYear-KristinaSalaryYear;
        System.out.println("Кристина теперь получает " +newKristinaSalary+" рублей.Годовой доход вырос на "+raznisaKristina+
                " рублей.");
     }
    }