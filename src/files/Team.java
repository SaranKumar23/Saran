package files;

import java.io.Serializable;
import java.util.List;

public class Team implements Serializable {
    private static final long serialVersionUID = 5828874843026682034L;
    private String Name;
    private int runs;
    private int wickets;
    private List<Batsman> batsman;
    private List<Bowler> bowler;

    public Team(String Name, int runs, int wickets, List<Batsman> batsman, List<Bowler> bowler) {
        this.Name = Name;
        this.runs = runs;
        this.wickets = wickets;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public String getName() {
        return Name;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public List<Batsman> getBatsman() {
        return batsman;
    }

    public List<Bowler> getBowler() {
        return bowler;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setBatsman(List<Batsman> batsman) {
        this.batsman = batsman;
    }

    public void setBowler(List<Bowler> bowler) {
        this.bowler = bowler;
    }
}