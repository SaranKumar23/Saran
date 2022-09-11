package files;

import java.io.Serializable;

public class Batsman implements Serializable {
    private static final long serialVersionUID = -1330661014198608131L;
    private String Name;ygyftfffftufuff
    private int runs;
    private int balls;
    private int fours;
    private int sixes;

    public Batsman(String Name, int runs, int balls, int fours, int sixes) {
        this.Name = Name;
        this.runs = runs;
        this.balls = balls;
        this.fours = fours;
        this.sixes = sixes;
    }

    public String getName() {
        return Name;
    }

    public int getRuns() {
        return runs;
    }

    public int getBalls() {
        return balls;
    }

    public int getFours() {
        return fours;
    }

    public int getSixes() {
        return sixes;
    }

    public float getStrikeRate() {
        return (float) (runs * 100) / balls;
    }

    public float getRunRate() {
        return (float) (runs * 6) / balls;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }
}