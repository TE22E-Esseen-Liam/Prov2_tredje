import java.util.Random;

// Undersklass till DinoReview, specifik för Triceratops
public class TriceratopsReview extends DinoReview{
    public TriceratopsReview() {
        super(); // Anropar konstruktorn i basklassen
        this.dinoName = "Triceratops";
        this.dinoDescription = "En växtätare med tre horn och krage.";
        this.dinoWeight = new Random().nextInt(1000) + 5000; // Vikt mellan 5000–5999 kg
    }
}
