package co.edu.udes.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class Primero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tiempo en segundos: ");
        int timeSeconds = sc.nextInt();
        
        int days = timeSeconds / 86400;
        int hours = (timeSeconds % 86400) / 3600;
        int minutes = ((timeSeconds % 86400) % 3600) / 60;
        int seconds = ((timeSeconds % 86400) % 3600) % 60;
        
        System.out.printf("%d:%02d:%02d:%02d\n", days, hours, minutes, seconds);
        String meridian = (hours >= 12) ? "PM" : "AM";
        hours %= 12;
        if (hours == 0) {
            hours = 12;
        }
        System.out.printf("%d:%02d:%02d %s\n", hours, minutes, seconds, meridian);
        
    }
     
}


