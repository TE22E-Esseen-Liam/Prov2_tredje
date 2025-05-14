import java.util.Scanner;
import java.util.Random;

public class DinoReview {
    protected String dinoName; // Namn på dinosaurien
    protected String dinoDescription; // Kort beskrivning
    protected int dinoWeight; // Vikt i kg
    protected int grade; // Betyg (1-5)
    protected String reviewText; // Recensionstext

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    public DinoReview() {
        this.grade = 0;
        this.reviewText = "";
    }
    // Användaren sätter ett betyg (1-5)
    public void setGrade() {
        while(true) {
            System.out.println("Sätt in betyg för " + dinoName + " (1-5):");
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                this.grade = input;
                break;
            } else{
                System.out.println("Skriv ett heltal!");
                scanner.next();
            }
        }
    }
    // Användaren skriver en kort recension
    public void writeText(){
        System.out.println("Skriv en recension för " + dinoName + ":");
        scanner.nextLine(); // För att ta bort radbrytning
        this.reviewText = scanner.nextLine();
    }
    // Returnerar all information som en text
    public String getReview(){
        return "Dinosaurie " + dinoName + "\nBeskrivning: " + dinoDescription + "\nVikt: " + dinoWeight + "kg\nBetyg: " + grade + "\nRecension: " + reviewText + "\n";
    }
}
