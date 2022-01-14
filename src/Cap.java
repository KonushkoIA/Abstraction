import java.util.Scanner;

public class Cap implements Clothes{
    private boolean prom;

    public Cap() {

    }

    public Cap(boolean prom) {
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
            System.out.println("Шапка и так надета");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 или 1");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            int a = (int) (Math.random() * 2);
            if (number == a) {
                System.out.println("Шапка надета");
                setProm(true);
            } else System.out.println("Шапка не надета");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }


    }

    @Override
    public void putOff() {

        if (!prom){
            System.out.println("Шапка ещё не надета");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 или 1");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            int a = (int) (Math.random() * 2);
            if (number == a) {
                System.out.println("Шапка снята");
            } else System.out.println("Шапка не снята");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
