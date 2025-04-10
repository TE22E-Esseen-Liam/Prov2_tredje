import java.util.Scanner;
import java.util.Random;

public class DinoReview {
    protected String dinoName;
    protected String dinoDescription;
    protected int dinoWeight;
    protected int grade;
    protected String reviewText;

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    public DinoReview() {
        this.grade = 0;
        this.reviewText = "";
    }
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

    public void writeText(){
        System.out.println("Skriv en recension för " + dinoName + ":");
        scanner.nextLine();
        this.reviewText = scanner.nextLine();
    }
    public String getReview(){
        return "Dinosaurie " + dinoName + "\nBeskrivning: " + dinoDescription + "\nVikt: " + dinoWeight + "kg\nBetyg: " + grade + "\nRecension: " + reviewText + "\n";
    }
}
