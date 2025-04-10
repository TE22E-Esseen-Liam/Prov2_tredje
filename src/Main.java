import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DinoReview> recensioner = new ArrayList<>();

        System.out.println("Hur många dinosaurier ska du recensera?");
        int antal = 0;

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

        for (int i = 0; i < antal; i++){
            DinoReview dino;
            if(rand.nextBoolean()) {
                dino = new TRexReview();
            } else {
                dino = new TriceratopsReview();
            }
            dino.setGrade();
            dino.writeText();
            recensioner.add(dino);
        }
        System.out.println("\n--- Dina Recensioner ---");
        for (DinoReview d : recensioner) {
            System.out.println(d.getReview());
        }
    }
}