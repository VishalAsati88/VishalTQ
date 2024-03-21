package test;

public class Player {
	
	private int playerId;
	private String Name;
	private String Country;
	private String team;
	
	public Player()
	{
		
	}

	public Player(int playerId, String name, String country, String team) {
		this.playerId = playerId;
		Name = name;
		Country = country;
		this.team = team;
	}
	
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", Name=" + Name + ", Country=" + Country + ", team=" + team + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
