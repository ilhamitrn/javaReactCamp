package Entities;

public class Campaign {
	
	private int uniqId;
	private String cName;
	private double discount;
	public Campaign() {
		
	}
	public Campaign(int uniqId, String cName, double discount) {
		super();
		this.uniqId = uniqId;
		this.cName = cName;
		this.discount = discount;
	}
	public int getUniqId() {
		return uniqId;
	}
	public void setUniqId(int uniqId) {
		this.uniqId = uniqId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
