import java.util.Random;

public class TRexReview extends DinoReview {
    public TRexReview(){
        super();
        this.dinoName = "Tyrannosaurus Rex";
        this.dinoDescription = "En stor köttätare";
        this.dinoWeight = new Random().nextInt(2000) + 6000;
    }
}

