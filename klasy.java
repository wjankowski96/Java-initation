import java.util.Random;
import java.util.Scanner;

    
    public class klasy {

        public static void main( String[] args) {
            
            Kolo kolko = new Kolo();
            kolko.wczytaj();
            kolko.numerycznie();
            kolko.analitycznie();

            
            Kolo kolo1 = new Kolo();
            kolo1.Dane(1, 2);
            kolo1.numerycznie();
            kolo1.analitycznie();

            Kolo kolo2 = new Kolo();
            kolo2.Dane(4,6);
            kolo2.numerycznie();
            kolo2.analitycznie();

            Kolo kolo3 = new Kolo();
            kolo3.Dane(12,60);
            kolo3.numerycznie();
            kolo3.analitycznie(); 
    }
}

class Kolo{
       
    double pole, polekw, x, y;
    int r = 0, p = 0, k;

    public void wczytaj() {
        final Scanner in = new Scanner(System.in);
        System.out.println("Podaj promień koła");
        r = in.nextInt();
        System.out.println("Promień koła:" + r);
        System.out.println("Podaj liczbę probek");
        p = in.nextInt();
        System.out.println("Liczba próbek:" + p);
        in.close();
    }

    public void Dane( int r,  int p)
    {
        this.r=r;
        this.p=p;
    }

    public void analitycznie() {
        
        pole = 3.14 * r * r;
        System.out.println("Pole koła obliczone analitycznie: " + pole);
        i++;
    }

    public void numerycznie() {
        polekw = 4 * r * r;
        final Random a = new Random();
        k = 0;
        for (int i = 1; i < p + 1; i++) {
            x = a.nextInt(2 * r + 1) - r + a.nextDouble();
            y = a.nextInt(2 * r + 1) - r + a.nextDouble();
            if ((x * x + y * y) <= r * r) {
                k++;
            }
        }
        pole = polekw * k / p;
        System.out.println("Pole koła obliczone numerycznie: " + pole);
    }
}
