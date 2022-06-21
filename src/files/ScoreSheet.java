package files;

import java.io.Serializable;

public class ScoreSheet implements Serializable {
	private static final long serialVersionUID = 8550692080587204612L;
	private String MatchName;
	private String date;
	private int tossWinner;
	private Team teamOne;
	private Team teamTwo;
	private int overs;
	
	public ScoreSheet(){

	}

	public ScoreSheet(String MatchName,String date,int tossWinner,Team teamOne,Team teamTwo,int overs) {
		this.MatchName = MatchName;
		this.date = date;
		this.tossWinner = tossWinner;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.overs = overs;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getMatchName() {
		return MatchName;
	}
	
	public Team getTeamOne() {
		return teamOne;
	}
	
	public Team getTeamTwo() {
		return teamTwo;
	}
	
	public int getTossWinner() {
		return tossWinner;
	}

	public int getOvers() {
		return overs;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setMatchName(String matchName) {
		MatchName = matchName;
	}
	
	public void setTeamOne(Team teamOne) {
		this.teamOne = teamOne;
	}
	
	public void setTeamTwo(Team teamTwo) {
		this.teamTwo = teamTwo;
	}
	
	public void setTossWinner(int tossWinner) {
		this.tossWinner = tossWinner;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public Team winner(){
		return teamOne.getRuns() > teamTwo.getRuns() ? teamOne : teamTwo;
	}

	public Team loser(){
		return teamOne.getRuns() < teamTwo.getRuns() ? teamOne : teamTwo;
	}

	public int getTotalRuns(){
		return teamOne.getRuns() + teamTwo.getRuns();
	}
}