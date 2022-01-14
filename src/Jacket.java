import java.util.Scanner;

public class Jacket implements Clothes{
    private boolean prom;

    public Jacket() {

    }

    public Jacket(boolean prom) {
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
            System.out.println("Куртка и так надета");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 или 1");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            int a = (int) (Math.random() * 2);
            if (number == a) {
                System.out.println("Куртка надета");
                setProm(true);
            } else System.out.println("Куртка не надета");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }


    }

    @Override
    public void putOff() {

        if (!prom){
            System.out.println("Куртка ещё не надета");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 или 1");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
            int a = (int) (Math.random() * 2);
            if (number == a) {
                System.out.println("Куртка снята");
            } else System.out.println("Куртка не снята");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
