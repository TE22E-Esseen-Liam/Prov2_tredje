import java.util.Random;

public class TriceratopsReview extends DinoReview{
    public TriceratopsReview() {
        super();
        this.dinoName = "Triceratops";
        this.dinoDescription = "En växtätare med tre horn och krage.";
        this.dinoWeight = new Random().nextInt(1000) + 5000;
    }
}
