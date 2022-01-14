import java.util.Scanner;

public class Pants implements Clothes{
    private boolean prom;

    public Pants() {

    }

    public Pants(boolean prom) {
        this.prom = prom;
    }

    public boolean isProm() {
        return prom;
    }

    public void setProm(boolean prom) {
        this.prom = prom;
    }

    @Override
    public void putOn() {

        if (prom){
            System.out.println("Штаны и так надеты");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 или 1");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            int a = (int) (Math.random() * 2);
            if (number == a) {
                System.out.println("Штаны надеты");
                setProm(true);
            } else System.out.println("Штаны не надеты");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }


    }

    @Override
    public void putOff() {

        if (!prom){
            System.out.println("Штаны ещё не надеты");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 или 1");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            int a = (int) (Math.random() * 2);
            if (number == a) {
                System.out.println("Штаны сняты");
            } else System.out.println("Штаны не сняты");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
