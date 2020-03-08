
import java.util.Scanner;
import java.util.Random;
public class First {
    public static void main(String[] args) {
     
     double pole, polekw, x, y; //pole koła, pole kwadratu, wsp x, wsp y
    int r, p, k; // promien, liczba probek, k

    Scanner in = new Scanner(System.in);
    System.out.println("Podaj promień koła");
    r = in.nextInt();

    System.out.println("Promień koła: {0}"+ r);
    System.out.println("Podaj liczbę probek");
    p = in.nextInt();

    System.out.println("Liczba próbek: {0}"+ p);

    pole = Math.PI * r * r;
    System.out.println("Pole koła obliczone analitycznie: " + pole);
    
    polekw = 4 * r * r;
    Random a = new Random();
    k = 0;
    for (int i = 1; i < p + 1; i++)
    {
        x = a.nextInt(2*r+1)-r + a.nextDouble();
        y = a.nextInt(2*r+1)-r + a.nextDouble();
        if ((x * x + y * y) <= r * r)
        {
            k++;
        }
    }
    pole = polekw * k / p;
    System.out.println("Pole koła obliczone numerycznie: {0}"+ pole);
    }
    
}