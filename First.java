//funkcja kolo która posiada 2 metody te nizej ale osobno do 29 marca
import java.util.Scanner;
import java.util.Random;


 class Kolo{

         double pole, polekw, x, y;
         int r, p, k;
         

         public void wczytaj(){
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj promień koła");
            r = in.nextInt();
            System.out.println("Promień koła:" + r);
            System.out.println("Podaj liczbę probek");
            p = in.nextInt();
            System.out.println("Liczba próbek:" + p);
            in.close();
    }


        public void analitycznie(){
            pole = 3.14 * r * r;
            System.out.println("Pole koła obliczone analitycznie: " + pole);
    }

        

        public void numerycznie(){
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
            System.out.println("Pole koła obliczone numerycznie: "+ pole);
    }
}

public class First {

        public static void main(String[] args) {
            Kolo kolko = new Kolo();
            kolko.wczytaj();
    }
}