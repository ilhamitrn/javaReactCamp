package Entities;

public class Game {
	
	private int uniqGameId;
	private String gameName;
	private double gamePrice;
	public Game() {
		
	}
	public int getUniqGameId() {
		return uniqGameId;
	}
	public void setUniqGameId(int uniqGameId) {
		this.uniqGameId = uniqGameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public Game(int uniqGameId, String gameName, double gamePrice) {
		super();
		this.uniqGameId = uniqGameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

}
