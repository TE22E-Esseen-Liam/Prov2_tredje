import java.util.Random;

// Undersklass till DinoReview, specifik för T-Rex
public class TRexReview extends DinoReview {
    public TRexReview(){
        super(); // Anropar konstruktorn i basklassen
        this.dinoName = "Tyrannosaurus Rex";
        this.dinoDescription = "En stor köttätare";
        this.dinoWeight = new Random().nextInt(2000) + 6000; // Vikt mellan 6000–7999 kg
    }
}

