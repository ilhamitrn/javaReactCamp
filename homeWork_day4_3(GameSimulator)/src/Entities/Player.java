package Entities;

public class Player {
	
	private int playerId;
	private String playerFirstName;
	private String playerLastName;
	private int playerBirthYear;
	private String playerNationalityId;
	
	public Player() {
		
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public int getPlayerBirthYear() {
		return playerBirthYear;
	}

	public void setPlayerBirthYear(int playerBirthYear) {
		this.playerBirthYear = playerBirthYear;
	}

	public String getPlayerNationalityId() {
		return playerNationalityId;
	}

	public void setPlayerNationalityId(String playerNationalityId) {
		this.playerNationalityId = playerNationalityId;
	}

	public Player(int playerId, String playerFirstName, String playerLastName, int playerBirthYear,
			String playerNationalityId) {
		super();
		this.playerId = playerId;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.playerBirthYear = playerBirthYear;
		this.playerNationalityId = playerNationalityId;
	}
}
