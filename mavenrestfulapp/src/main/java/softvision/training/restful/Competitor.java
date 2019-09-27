package softvision.training.restful;

public class Competitor {

    private long id;
    private String competitorName;


    public Competitor(long id, String competitorName) {
        this.id = id;
        this.competitorName = competitorName;
    }

    public long getId() {
        return id;
    }

    public String getCompetitorName() {
        return competitorName;
    }


}
