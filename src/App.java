/**
 * Created by tjc on 5/9/16.
 */
//indlæs klasse Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //indlæs variable
        double d = 0.0, g = 9.82, t;
        double v = 0.0;

        boolean success = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv en højde [m] som objektet falder fra:");
        try
        {
            d = input.nextDouble();
            success = true;
            input.close();
        }

        catch(Exception ex)
        {
            System.out.println("Indtast venligst et tal.");
            input.close();
        }
        finally
        {
            if (d < 0) {
                System.out.println(" Højden skal være ≥ 0");
                success = false;
            }
            if (success) {
                t = Math.sqrt((2 * d) / g);
                v = g * t;
                //t = t * 1000;
                //t = Math.round(t) / 1000;
                System.out.println("Faldet tager " + t + " sekunder.");
                System.out.println("Sluthastigheden er " + v + " m/s.");
            }
        }
    }
}
