package files;

import java.io.Serializable;

public class Bowler implements Serializable {
    private static final long serialVersionUID = 1469403398034640086L;
    private String Name;
    private int runs;
    private int wickets;
    private int overs;
    private int wide;

    public Bowler(String Name, int runs, int wickets, int overs, int wide) {
        this.Name = Name;
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.wide = wide;
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

    public int getOvers() {
        return overs;
    }

    public int getWide() {
        return wide;
    }

    public float getEconomy() {
        return (float) (runs * 6) / overs;
    }

    public float getStrikeRate() {
        return (float) (wickets * 6) / overs;
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

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }
}