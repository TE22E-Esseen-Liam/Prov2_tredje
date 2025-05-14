import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

// Huvudklassen där programmet startar
public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DinoReview> recensioner = new ArrayList<>();

        // Fråga användaren hur många dinosaurier som ska recenseras
        System.out.println("Hur många dinosaurier ska du recensera?");
        int antal = 0;
        
        // Inputvalidering: endast positiva heltal godkänns
        while(true) {
            if (scanner.hasNextInt()) {
                antal = scanner.nextInt();
                if (antal > 0) {
                    break;
                } else {
                    System.out.println("Ange ett heltal över 0.");
                }
            } else {
                System.out.println("Ange ett heltal.");
                scanner.next();
            }
        }

        Random rand = new Random();

        // Skapa recensioner för angivet antal dinosaurier
        for (int i = 0; i < antal; i++){
            DinoReview dino;
            // Slumpa vilken typ av dinosaurie som skapas
            if(rand.nextBoolean()) {
                dino = new TRexReview(); // Skapar en T-Rex
            } else {
                dino = new TriceratopsReview(); // Skapar en Triceratops
            }
            dino.setGrade(); // Användaren sätter betyg
            dino.writeText(); // Användaren skriver recension
            recensioner.add(dino); // Lägg till recension i listan
        }
        // Skriv ut alla recensioner
        System.out.println("\n--- Dina Recensioner ---");
        for (DinoReview d : recensioner) {
            System.out.println(d.getReview());
        }
    }
}
