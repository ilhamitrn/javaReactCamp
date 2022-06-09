package Game;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player1=new Player();
		player1.setPlayerFirstName("İLHAMİ");
		player1.setPlayerLastName("TURAN");
		player1.setPlayerId(1321);
		player1.setPlayerNationalityId("20566034266");
		player1.setPlayerBirthYear(1995);
		
		PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player1);
		
	
		

	}

}
