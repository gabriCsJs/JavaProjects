import team.FanClub;
import team.Stadium;
import team.Team;

public class Main {
    public static void main(String[] args) {


        Team palmeiras = new Team("Palmeiras", "Allianz parque", 44000, 70.0, "Mancha verde");
        Team santos = new Team("Santos", "Caldeira",44000, 77.80,"Torcida Jovem do Santos" );

        santos.getBank().transfer(palmeiras, 500.0);
        santos.getBank().getAvailableBalance();
        palmeiras.getBank().getAvailableBalance();

    }
}
